package nd.jar.springhexboot.adapter.out.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import nd.jar.springhexboot.application.domain.model.Event;
import nd.jar.springhexboot.application.port.out.ExternalStorage;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Log4j2
@Service
@RequiredArgsConstructor
public class KafkaAdapter implements ExternalStorage {
    private final KafkaTemplate<String, String> template;
    private final ObjectMapper om;

    @Override
    public boolean push(Event event) {
        log.info("KAFKA: Pushing event with id=`{}`", event.id());
        try {
            template.send("events", event.id(), om.writeValueAsString(event));
        } catch (JsonProcessingException e) {
            log.error("Error while processing json", e);
            return false;
        }
        log.info("KAFKA: Pushed event with id=`{}`", event.id());
        return true;
    }

    @Override
    public Optional<Event> find(String id) {
        log.error("Getting messages by id in kafka is not implemented");
        return Optional.empty();
    }
}
