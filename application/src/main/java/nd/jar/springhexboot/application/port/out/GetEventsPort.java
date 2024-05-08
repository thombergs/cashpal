package nd.jar.springhexboot.application.port.out;

import nd.jar.springhexboot.application.domain.model.Event;

import java.util.List;

public interface GetEventsPort {
    List<Event> getAll();
}
