package nd.jar.springhexboot.adapter.out.persistence;

import lombok.RequiredArgsConstructor;
import nd.jar.springhexboot.application.domain.model.Event;
import nd.jar.springhexboot.application.port.out.ExternalStorage;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.Optional;

@EnableJpaRepositories(basePackageClasses = EventRepository.class)
@RequiredArgsConstructor
@Service
public class EventPersistenceAdapter implements ExternalStorage {
    private final EventRepository eventRepository;
    private final EventEntityMapper accountMapper;

    @Override
    public boolean push(Event event) {
        eventRepository.save(accountMapper.toEntity(event));
        return true;
    }

    @Override
    public Optional<Event> find(String id) {
        return eventRepository.findById(id).map(accountMapper::toDomainModel);
    }
}
