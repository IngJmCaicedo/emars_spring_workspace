package com.ingjmcaicedo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ingjmcaicedo.spring.knight.Knight;
import com.ingjmcaicedo.spring.knight.Quest;
import com.ingjmcaicedo.spring.knight.impl.BraveKnight;
import com.ingjmcaicedo.spring.knight.impl.SlayDragonQuest;

@Configuration
public class KnightConfig {
	
	@Bean
	public Knight knight(){
		return new BraveKnight();
	}

	@Bean
	public Quest quest(){
		return new SlayDragonQuest();
	}

}
