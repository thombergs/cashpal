package nd.jar.springhexboot.adapter.in.web;

import lombok.RequiredArgsConstructor;
import nd.jar.springhexboot.application.port.in.PushEventUseCase;
import nd.jar.springhexboot.application.port.out.GetEventsPort;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController("/events")
@RequiredArgsConstructor
public class EventsController {
    private final GetEventsPort getAccountsPort;
    private final EventDtoMapper eventDtoMapper;
    private final PushEventUseCase pushEventUseCase;

    @GetMapping
    List<EventDto> find(Pageable pageable) {
        return getAccountsPort.getAll(pageable).stream().map(eventDtoMapper::toDto).collect(Collectors.toList());
    }

    @PostMapping
    ResponseEntity<Void> push(EventDto eventDto) {
        pushEventUseCase.push(eventDtoMapper.toDomainModel(eventDto));
        return ResponseEntity.ok().build();
    }
}
