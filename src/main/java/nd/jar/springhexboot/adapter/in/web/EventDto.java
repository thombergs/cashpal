package nd.jar.springhexboot.adapter.in.web;

import java.math.BigDecimal;


public record EventDto(
	String id,
	String name,
	String description,
	String from
){}