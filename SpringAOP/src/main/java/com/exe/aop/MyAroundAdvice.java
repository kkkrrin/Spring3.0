package com.exe.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAroundAdvice {
	
	@Around("execution(* com..aop.*.*(..))")
	public Object aroundMethodCall(ProceedingJoinPoint joinPoint) { // ����� ��ȯ���� ���� ObjectŸ�� 
		
		Object result = null;
		
		try {
			
			System.out.println("�޼ҵ� ���� ��(Around)..");
			
			result = joinPoint.proceed() ; //�޼ҵ� ���� ( ��ȯ���� ���� �� �ֱ⶧���� result �� �޴´�) 
			
			// �޼ҵ� �� �� �����ϰ�, �� -> �޼ҵ���� -> ��, �߰��� �޼ҵ������ �ϱ����� proceedingJoinPoint���ʿ���,
			// �߰��� ������ �޼ҵ��� ��ȯ���� ���� �� ������ �װ� �޾Ƴ��� ���� result �� ���. 
			 
			
			System.out.println("�޼ҵ� ���� ��(Around)..");
			
			
		} catch (Throwable e) {
			// TODO: handle exception
		}
		
		return result; 
	}

}
