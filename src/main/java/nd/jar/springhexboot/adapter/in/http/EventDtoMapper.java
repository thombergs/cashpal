package nd.jar.springhexboot.adapter.in.http;

import nd.jar.springhexboot.application.domain.model.Event;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventDtoMapper {
    EventDto toDto(Event domain);
    Event toDomainModel(EventDto dto);
}
