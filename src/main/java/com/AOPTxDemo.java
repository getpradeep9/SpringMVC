package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTxDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		AbstractApplicationContext xt=new ClassPathXmlApplicationContext("annotationTx.xml");
		
		
		PJdbc pjdbc=(PJdbc) xt.getBean("bookStore");
		
		pjdbc.doStuff();
		
		
		System.out.println(xt.getBean("fb"));
		
		System.out.println("\n\t_Done.");

	}

}
