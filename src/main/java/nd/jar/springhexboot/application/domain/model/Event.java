package nd.jar.springhexboot.application.domain.model;

public record Event(
		String id,
		String name,
		String description,
		String from
){}