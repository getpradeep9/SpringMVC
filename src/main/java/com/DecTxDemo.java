package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emc.aop.Calculator;

public class DecTxDemo {

	public static void main(String[] args) {
	
		AbstractApplicationContext xt=new ClassPathXmlApplicationContext("postgre.JDBC.Context.xml");
		
		
		PJdbc pjdbc=(PJdbc) xt.getBean("bookStore");
		
		pjdbc.doStuff();
		
		
		System.out.println("\n\t_Done.");

	}

}
