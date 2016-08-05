package org.example;

import org.example.service.MathService;
import org.example.service.PrintService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MathConfig.class, PrintConfig.class})
public class AppConfig {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(AppConfig.class);
		
		MathService mathService = context.getBean(MathService.class);
		System.out.println(mathService.addInts(1, 2));
		
		PrintService printService = context.getBean(PrintService.class);
		printService.basicPrinting();
	}
	
}
