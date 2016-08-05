package com.ingjmcaicedo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.ingjmcaicedo.spring.knight.Knight;
import com.ingjmcaicedo.spring.knight.Minstrel;
import com.ingjmcaicedo.spring.knight.Quest;
import com.ingjmcaicedo.spring.knight.aspects.LoggingAspect;
import com.ingjmcaicedo.spring.knight.impl.BraveKnight;
import com.ingjmcaicedo.spring.knight.impl.KnightMinstrel;
import com.ingjmcaicedo.spring.knight.impl.SlayDragonQuest;

@Configuration
@EnableAspectJAutoProxy
public class KnightConfig {
	
	@Bean
	public Knight knight(){
		return new BraveKnight();
	}

	@Bean
	public Quest quest(){
		return new SlayDragonQuest();
	}
	
	@Bean
	public LoggingAspect loggingAspect(){
		return new LoggingAspect();
	}

	@Bean
	public Minstrel minstrel(){
		return new KnightMinstrel();
	}
	
}
