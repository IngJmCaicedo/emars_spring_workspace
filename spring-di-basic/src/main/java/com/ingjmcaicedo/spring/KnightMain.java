package com.ingjmcaicedo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ingjmcaicedo.spring.knight.Knight;

public class KnightMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
		
		Knight knight = context.getBean(Knight.class);
		
		knight.startQuest();
		
	}
	
}
