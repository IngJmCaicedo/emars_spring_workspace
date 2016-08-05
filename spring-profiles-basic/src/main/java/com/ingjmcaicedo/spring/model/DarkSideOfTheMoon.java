package com.ingjmcaicedo.spring.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa")
public class DarkSideOfTheMoon  implements CompacDisc {

	private static final String NAME = "DarkSideOfTheMoon";
	
	public void play() {
		System.out.println("Playing "+NAME);
	}

}
