package nd.jar.springhexboot.application.port.out;

import nd.jar.springhexboot.application.domain.model.Event;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface GetEventsPort {
    List<Event> getAll(Pageable pageable); //todo: Pageable is part of spring-data. Need to remove from here.
}
