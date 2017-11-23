package com.javatpoint;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TrackOperation {
	/*
	 * @Pointcut("execution(* Operation.*(..))")
	 * 
	 * @Pointcut("execution(* Operation.m*(..))")
	 * 
	 * @Pointcut("execution(public Employee.set*(..))")
	 * 
	 * @Pointcut("execution(public Operation.*(..))")
	 * 
	 * @Pointcut("execution(public * *(..))")
	 */

	@AfterReturning(pointcut = "execution(* Operation.*(..))", returning = "result")

	public void myadvice(JoinPoint jp, Object result)// it is advice (after returning advice)
	{
		System.out.println("additional concern");
		System.out.println("Method Signature: " + jp.getSignature());
		System.out.println("Result in advice: " + result);
		System.out.println("end of after returning advice...");
	}
}