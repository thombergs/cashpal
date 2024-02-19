package nd.jar.springhexboot.application.domain.service;

import nd.jar.springhexboot.application.domain.model.Event;
import nd.jar.springhexboot.application.port.in.PushEventUseCase;
import org.springframework.stereotype.Service;

@Service
public class PushEventService implements PushEventUseCase {
    @Override
    public void push(Event event) {

    }
}
