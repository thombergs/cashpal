package nd.jar.springhexboot.adapter.in.web;

import java.math.BigDecimal;


public record EventDto(
	String name,
	String description,
	String from
){}