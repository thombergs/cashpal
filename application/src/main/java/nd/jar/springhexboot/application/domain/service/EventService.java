package nd.jar.springhexboot.application.domain.service;

import lombok.RequiredArgsConstructor;
import nd.jar.springhexboot.application.domain.model.Event;
import nd.jar.springhexboot.application.port.in.FindEventsUseCase;
import nd.jar.springhexboot.application.port.in.PushEventUseCase;
import nd.jar.springhexboot.application.port.out.ExternalStorage;
import org.springframework.stereotype.Service;

import java.util.Map;

import static java.util.stream.Collectors.toMap;

@Service
@RequiredArgsConstructor
public class EventService implements PushEventUseCase, FindEventsUseCase {
    private final Map<String, ExternalStorage> storages;
    @Override
    public boolean push(Event event) {
        return storages.values().stream().map(sub -> sub.push(event))
                .anyMatch(result -> !result);
    }

    @Override
    public Map<String, Event> find(String eventId) {
        return storages.entrySet().stream()
                .collect(toMap(Map.Entry::getKey, entry -> entry.getValue().find(eventId))).entrySet().stream()
                .filter(entry -> entry.getValue().isPresent())
                .collect(toMap(Map.Entry::getKey, entry -> entry.getValue().get()));
    }

}
