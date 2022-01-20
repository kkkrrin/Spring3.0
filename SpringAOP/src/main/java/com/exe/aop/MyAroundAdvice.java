package com.exe.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAroundAdvice {
	
	@Around("execution(* com..aop.*.*(..))")
	public Object aroundMethodCall(ProceedingJoinPoint joinPoint) { // 어떤값이 반환될지 몰라서 Object타입 
		
		Object result = null;
		
		try {
			
			System.out.println("메소드 실행 전(Around)..");
			
			result = joinPoint.proceed() ; //메소드 실행 ( 반환값이 있을 수 있기때문에 result 로 받는다) 
			
			// 메소드 전 후 실행하고, 전 -> 메소드실행 -> 후, 중간에 메소드실행을 하기위해 proceedingJoinPoint가필요함,
			// 중간에 실행한 메소드의 반환값이 나올 수 있으니 그걸 받아내기 위해 result 를 사용. 
			 
			
			System.out.println("메소드 실행 후(Around)..");
			
			
		} catch (Throwable e) {
			// TODO: handle exception
		}
		
		return result; 
	}

}
