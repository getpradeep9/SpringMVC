package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emc.Act;

//This has main method
//Pradeep made local changes
public class Tl {

	
	public static void main(String[] args) {
	  

		AbstractApplicationContext xt=new ClassPathXmlApplicationContext("beanContext.xml");
		
		/*ApplicationContext xt=new ClassPathXmlApplicationContext("beanContext.xml");
		Account act=(Account)xt.getBean("act");
		System.out.println(act.name);
		System.out.println(act.getAddrList());
		xt.registerShutdownHook();*/
		
		
		Act act=(Act)xt.getBean("acct");
		
		System.out.println(act.getDept().getDeptno());

		xt.start();
		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection connection = null;
		 
		try {
 
			connection = DriverManager.getConnection(
					"jdbc:postgresql://127.0.0.1:5432/postgres", "postgres","5432");
 
		} catch (SQLException e) {
 
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
 
		}


		
	}

}
