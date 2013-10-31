package com.emc.spring.hib;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class SprHibDemoClient {

	
	public static void main(String[] args) {
		

		AbstractApplicationContext xt=new ClassPathXmlApplicationContext("Spr-hib.xml");
		
		
		FundTransfer fd=(FundTransfer) xt.getBean("fd");
		
		
		fd.doTransfer("A101","A102", 5000);
		
		
		
		
		System.out.println("\n\t_Done.");

	}

}
