package com.raju.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogAspect {

/*	@Before("execution( *  com.raju.aop.AddImpl.*(..)  )")
	public void logBeforeAdvice() {
		System.out.println("\n\t Before\t\n");
	}

	@AfterReturning(pointcut = "execution( *  com.raju.aop.AddImpl.*(..)  )", returning = "ali")
	public void logAfterAdvice(JoinPoint jp, Object ali) {

		System.out.println(jp.getSourceLocation());

		System.out.println("\n\t" + jp.getSignature() + ". Return value=" + ali
				+ "\n\t");
	}

	@AfterThrowing(pointcut = "execution( *  com.raju.aop.AddImpl.*(..)  )", throwing = "e")
	public void logAfterThrowing(JoinPoint jp, Throwable e) {
		System.out.println("Raju the exception thrown is : "
				+ e.getClass().getName());
	}*/

	@Around("execution( *  com.raju.aop.AddImpl.*(..)  )")
	public Object logAroundAdvice(ProceedingJoinPoint jp) throws Throwable {

		try {
			System.out.println("before");
			Object result = jp.proceed();
			System.out.println("after");
			return result;
		} catch (Throwable e) {
			System.out.println("throw e");
			throw e;
		}

	}

}
