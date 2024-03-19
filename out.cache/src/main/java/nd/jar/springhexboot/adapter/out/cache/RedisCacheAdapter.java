package nd.jar.springhexboot.adapter.out.cache;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import nd.jar.springhexboot.application.domain.model.Event;
import nd.jar.springhexboot.application.port.out.GetEventPort;
import nd.jar.springhexboot.application.port.out.ExternalStorage;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Log4j2
@RequiredArgsConstructor
public class RedisCacheAdapter implements ExternalStorage, GetEventPort {
    private final StringRedisTemplate stringRedisTemplate;
    private final ObjectMapper om;
    @Override
    public boolean push(Event event) {
        try {
            stringRedisTemplate.opsForValue().set(event.id(), om.writeValueAsString(event));
        } catch (JsonProcessingException e) {
            log.error("Error while processing json", e);
            return false;
        }
        return true;
    }

    @Override
    public Optional<Event> find(String id) {
        final var stringResult = stringRedisTemplate.opsForValue().get(id);
        try {
            final var result = om.readValue(stringResult, Event.class);
            return Optional.of(result);
        } catch (JsonProcessingException e) {
            log.error("Error while processing json", e);
            return Optional.empty();
        }
    }
}
