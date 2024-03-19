package nd.jar.springhexboot.application.port.in;

import nd.jar.springhexboot.application.domain.model.Event;

import java.util.Map;

public interface FindEventsUseCase {
    Map<String, Event> find(String eventId);
}
