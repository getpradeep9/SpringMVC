package com.raju.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddClient {

	public static void main(String[] args) {

		AbstractApplicationContext xt = new ClassPathXmlApplicationContext(
				"rajuAop.xml");

		Add addServ = (Add) xt.getBean("add");

		try {
			double result = addServ.doDiv(5.0, 6.0);
			System.out.println("Result: " + result);

			result = addServ.doAdd(5.0, 6.0);

			System.out.println("Result: " + result);

		} catch (Exception e) {

		}

		System.out.println("\n\t_Done.");

	}

}
