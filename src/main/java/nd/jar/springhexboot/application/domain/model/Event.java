package nd.jar.springhexboot.application.domain.model;

import java.math.BigDecimal;


public record Event(
		String uid,
		String name,
		String description,
		String from
){}