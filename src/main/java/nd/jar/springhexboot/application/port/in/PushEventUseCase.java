package nd.jar.springhexboot.application.port.in;

import nd.jar.springhexboot.application.domain.model.Event;

public interface PushEventUseCase {
    void push(Event event);
}
