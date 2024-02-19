package nd.jar.springhexboot.application.port.out;

import nd.jar.springhexboot.application.domain.model.Event;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PushEventPort {
    boolean push(Event event);
}
