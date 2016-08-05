package org.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Profile({"DEV", "PERF"})
public class QosLoggerAspect {
	
	@Around("execution(* org.example.service..*.*(..))")
	public void logTime(ProceedingJoinPoint joinPoint) throws Throwable{
		long startingTime = System.currentTimeMillis();
		joinPoint.proceed();
		System.out.println("Execution time: "+(System.currentTimeMillis()-startingTime));
	}

}
