package com.emc.aop.pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CalPointCut {

	@Pointcut("execution(* *.add(..))")
	public void  addcut(){}
	
	@Pointcut("execution(* *.sub(..))")
	public void  subcut(){}
	
}
