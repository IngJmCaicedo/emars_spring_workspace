package com.ingjmcaicedo.spring.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class VivaLaVida  implements CompacDisc {

	private static final String NAME = "Viva La Vida";
	
	public void play() {
		System.out.println("Playing "+NAME);
	}

}
