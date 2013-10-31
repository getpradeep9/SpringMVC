package com.emc.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class DeclarativeAspect {
	
	public void logBefore(){
		System.out.println("Declarative_before ");
	}
	
	
	public void logAfterReturning(JoinPoint jp,Object ret){
		System.out.println("Declarative_log after returning: "+ret);
	}
	
	public void logAfterThrowing(JoinPoint jp,Throwable e){
		System.out.println("Declarative_after throwing");
	}
	
	public Object logAround(ProceedingJoinPoint jp) throws Throwable{
		
		try{
			System.out.println("Declarative_ around before");
		Object ret=jp.proceed();
		System.out.println("Declarative_ around after");
		return ret;
		}catch(Exception e){
			throw e;
		}
	}
	
}
