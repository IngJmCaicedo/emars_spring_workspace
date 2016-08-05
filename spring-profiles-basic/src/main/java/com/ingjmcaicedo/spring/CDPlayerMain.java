package com.ingjmcaicedo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ingjmcaicedo.spring.model.CompacDisc;

public class CDPlayerMain {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		
		CompacDisc disc = context.getBean(CompacDisc.class);
		
		disc.play();
	}

}
