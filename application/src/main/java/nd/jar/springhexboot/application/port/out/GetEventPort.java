package nd.jar.springhexboot.application.port.out;

import nd.jar.springhexboot.application.domain.model.Event;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface GetEventPort {
    Optional<Event> find(String id);
}
