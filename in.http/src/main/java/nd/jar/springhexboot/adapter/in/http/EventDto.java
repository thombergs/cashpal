package nd.jar.springhexboot.adapter.in.http;

public record EventDto(
	String id,
	String name,
	String description,
	String from
){}