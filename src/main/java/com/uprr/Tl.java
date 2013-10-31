package com.uprr;

import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Tl {
 
	public static void main(String[] argv) {
				
		System.out.println("Started\n");
		 ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appContext.xml");
		 		    
		 System.out.println(ctx.getBean("str") );
		 
		// System.out.println(ctx.getBean("txManager") );
		 System.out.println("\nEnded");
	}
 
}

