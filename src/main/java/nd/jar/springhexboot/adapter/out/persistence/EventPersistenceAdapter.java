package nd.jar.springhexboot.adapter.out.persistence;

import lombok.RequiredArgsConstructor;
import nd.jar.springhexboot.application.domain.model.Event;
import nd.jar.springhexboot.application.port.out.GetEventsPort;
import nd.jar.springhexboot.application.port.out.PushEventPort;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class EventPersistenceAdapter implements GetEventsPort, PushEventPort {
    private final EventRepository eventRepository;
    private final EventEntityMapper accountMapper;
    @Override
    public List<Event> getAll(Pageable pageable) {
        return eventRepository.findAll(pageable)
                .stream().map(accountMapper::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public boolean push(Event event) {
        eventRepository.save(accountMapper.toEntity(event));
        return true;
    }
}
