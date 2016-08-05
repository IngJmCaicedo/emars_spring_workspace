package org.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Profile({"PROD"})
public class SecurityLoggerAspect {
	
	@Before("saveMethod() || updateMethod()")
	public void accessingSensityMethod(JoinPoint joinPoint){
		System.out.println("Accessing "+joinPoint.toShortString());
	}
	
	@Pointcut("execution(* save(..))")
	public void saveMethod(){}
	
	@Pointcut("execution(* update(..))")
	public void updateMethod(){}
	
}
