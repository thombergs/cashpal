package nd.jar.springhexboot.adapter.out.persistence;

import nd.jar.springhexboot.application.domain.model.Event;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventEntityMapper {
    Event toDomainModel(EventEntity entity);
    EventEntity toEntity(Event domainModel);

}
