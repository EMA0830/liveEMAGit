package com.domain.aspect;

import java.time.LocalTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceLoggingAspect {
	@Before(value="execution(* com.domain.service.EmployeeService.*())")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.err.println("Before method : " + LocalTime.now() + " " + joinPoint.getSignature());
	}
	@After(value="execution(* com.domain.service.EmployeeService.*())")
	public void afterAdvice(JoinPoint joinPoint) {
		System.err.println("After method : " + LocalTime.now() + " " + joinPoint.getSignature());
	}
}
