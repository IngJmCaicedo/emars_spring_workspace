package com.ingjmcaicedo.spring.knight.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ingjmcaicedo.spring.knight.Knight;
import com.ingjmcaicedo.spring.knight.Quest;

public class BraveKnight implements Knight {
	
	@Autowired
	private Quest quest;

	public void startQuest() {
		System.out.println(quest.getQuestDescription());
	}
	

}
