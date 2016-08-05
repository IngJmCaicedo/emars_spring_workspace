package org.example;

import org.example.service.PrintService;
import org.example.service.impl.ConsolePrinting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrintConfig {

	@Bean
	public PrintService printService(){
		return new ConsolePrinting();
	}
	
}
