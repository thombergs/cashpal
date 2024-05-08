package nd.jar.springhexboot.application.port.out;

import nd.jar.springhexboot.application.domain.model.Event;

import java.util.Optional;

public interface GetEventPort {
    Optional<Event> find(String id);
}
