package com.ingjmcaicedo.spring.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class SgtPepper implements CompacDisc {

	private static final String NAME = "Sargent Pepper Disc";
	
	public void play() {
		System.out.println("Playing "+NAME);
	}

}
