package com.exe.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyBeforeAdvice {
	
	@Before("execution(* com..aop.*.*(..))")
	public void beforeMethodCall() {
		System.out.println("메소드가 실행되기 전에..");
	}

}
