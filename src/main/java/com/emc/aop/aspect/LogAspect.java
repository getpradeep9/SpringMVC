package com.emc.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class LogAspect {
	
	//@Before("execution(* *.CalculatorImpl.add(..))")
	/*@Before("execution(* com.emc.aop.Calculator.add(..))")
	public void logBefore(){
		System.out.println("\n logBefore() method called.\n");
	}*/
	
	//@AfterReturning(pointcut="execution(* com.emc.aop.impl.*.add(..) )",returning="returnObj")
	//@AfterReturning(pointcut="com.emc.aop.pointcut.CalPointCut.subcut()")
	@AfterReturning(pointcut="com.emc.aop.pointcut.CalPointCut.subcut()")
	public void logAfterReturing(JoinPoint jp,Object returnObj){
		System.out.println("\n\t returned object: "+returnObj);
		
		
	}
	
/*	@AfterThrowing(pointcut="execution(* *.sub(..))",throwing="e")
	public void  logAfterThrowingException(JoinPoint jp, Throwable e){
		System.out.println(" \n\t PRADEEP	 AfterThrowing: "+e);
		throw new NumberFormatException();
	}*/
	
	/*@Around("execution( * *.sub(..) )")
	public Object aroundLogging(ProceedingJoinPoint jp) throws Throwable{
		
		Object ret=null;
		
		try {
			System.out.println("\nBefore calling proceed()");
			ret=jp.proceed();
			System.out.println("\nAfter  calling proceed()");
			return ret;
		} catch (Throwable e) {
			System.out.println(e.getMessage());
			throw e;
		}
		
		
	}*/

}
