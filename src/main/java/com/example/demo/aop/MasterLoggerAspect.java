package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MasterLoggerAspect {
	
	//@Pointcut("execution(* *(..))")
	//@Pointcut("execution(* com.example.demo.SpringBootWithAOP.*(..)) ")
	@Pointcut("execution(* com.example.demo.services.*.*(..) )")
	public void logForAllMethods(){}

	@Before("execution(* com.example.demo.services.*.*(..) )")
	public void doForEveryServicesMethod(JoinPoint jp){
		System.out.println("hurray! In class: " + jp.getSignature().getDeclaringTypeName() + " - before method: " + jp.getSignature().getName());
	}
	
	@Before("execution(* com.example.demo.*.*(..) )" )
	public void doForEveryMainClassMethod(JoinPoint jp){
		System.out.println("hurray! In class: " + jp.getClass() + " - before method: " + jp.getSignature().getName());
	}
}
