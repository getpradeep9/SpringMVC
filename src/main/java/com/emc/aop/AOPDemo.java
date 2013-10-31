package com.emc.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emc.Act;

public class AOPDemo {


	public static void main(String[] args) {
		
		AbstractApplicationContext xt=new ClassPathXmlApplicationContext("aopContext.xml");
		//AbstractApplicationContext xt=new ClassPathXmlApplicationContext("DeclAopContext.xml");
		
		Calculator cal=(Calculator) xt.getBean("cal");
		
		//System.out.println(cal.sub(2.0, 3.0));
		
		System.out.println(cal.add(3.0, 3.0));
		
		System.out.println("\n\t_Done.");

	}

}
