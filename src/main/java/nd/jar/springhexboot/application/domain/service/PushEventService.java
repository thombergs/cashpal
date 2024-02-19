package nd.jar.springhexboot.application.domain.service;

import lombok.RequiredArgsConstructor;
import nd.jar.springhexboot.application.domain.model.Event;
import nd.jar.springhexboot.application.port.in.PushEventUseCase;
import nd.jar.springhexboot.application.port.out.PushEventPort;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class PushEventService implements PushEventUseCase {
    private final Set<PushEventPort> subscribers;
    @Override
    public boolean push(Event event) {
        return subscribers.stream().map(sub -> sub.push(event))
                .anyMatch(result -> !result);
    }
}
