package nd.jar.springhexboot.application.port.in;

import nd.jar.springhexboot.application.domain.model.Event;

public interface PushEventUseCase {
    boolean push(Event event);
}
