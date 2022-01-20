package com.exe.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAfterReturningAdvice {
	
	@AfterReturning("execution(* com..aop.*.*(..))")
	public void afterReturningMethodCall() {
		
		System.out.println("정상적으로 실행된 후 .. ");
	}

}
