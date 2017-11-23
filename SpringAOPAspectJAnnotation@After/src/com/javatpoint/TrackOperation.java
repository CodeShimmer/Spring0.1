package com.javatpoint;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {
	@Pointcut("execution(* Operation.*(..))")
	// @Pointcut("execution(* Operation.m*(..))")
	// @Pointcut("execution(public Employee.set*(..))")
	// @Pointcut("execution(public Operation.*(..))")
	// @Pointcut("execution(public * *(..))")

	public void k() {
	}// pointcut name

	@After("k()") // applying pointcut on before advice
	public void myadvice(JoinPoint jp)// it is advice (before advice)
	{
		System.out.println("additional concern");
		System.out.println("Method Signature: " + jp.getSignature());
	}
}