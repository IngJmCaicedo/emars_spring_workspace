package com.ingjmcaicedo.spring.knight.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;

import com.ingjmcaicedo.spring.knight.Minstrel;

@Aspect
public class LoggingAspect {
	
	@Autowired
	private Minstrel minstrel;
	
	@Before("execution(* com.ingjmcaicedo.spring.knight.Knight.startQuest(..))")
	public void doBefore(JoinPoint joinPoint){
		minstrel.singBeforeQuest();
	}

	@After("execution(* com.ingjmcaicedo.spring.knight.Knight.startQuest(..))")
	public void doAfter(JoinPoint joinPoint){
		minstrel.singAfterQuest();
	}

}
