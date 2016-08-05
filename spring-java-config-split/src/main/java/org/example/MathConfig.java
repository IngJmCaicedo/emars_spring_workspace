package org.example;

import org.example.service.MathService;
import org.example.service.impl.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MathConfig {

	@Bean
	public MathService mathService(){
		return new Calculator();
	}
	
}
