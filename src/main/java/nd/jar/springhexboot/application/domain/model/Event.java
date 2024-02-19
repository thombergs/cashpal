package nd.jar.springhexboot.application.domain.model;

public record Event(
		String uid,
		String name,
		String description,
		String from
){}