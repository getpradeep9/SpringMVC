package com.postgresql.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
 
public class PostgreSqlJdbcConnection {
 
	public static void main(String[] argv) {
				
		 ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appContext.xml");
		 		    
		 System.out.println(ctx.getBean("str") );
		 
		 System.out.println(ctx.getBean("txManager") );
		 
		 
		 JdbcTemplate jdbcTemplate=(JdbcTemplate) ctx.getBean("jdbcTemplate");
		 System.out.println("jdbcTemplate: "+jdbcTemplate);
		 
		 
		
		Object result= jdbcTemplate.execute("insert into books values(11,3,'J2EE')", new PreparedStatementCallback() {
			
			@Override
			public Object doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {
				return ps.execute();
			}
		});
		
		System.out.println("\n\tResult: "+result); 
		
 		System.out.println("-------- PostgreSQL " + "JDBC Connection Testing ------------");
 
		try {
 
			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {
 
			System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();
			return;
 
		}
 
		System.out.println("PostgreSQL JDBC Driver Registered!");
 
		Connection connection = null;
 
		try {
 
			connection = DriverManager.getConnection(
					"jdbc:postgresql://127.0.0.1:5432/postgres", "postgres",
					"5432");
 
		} catch (SQLException e) {
 
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
 
		}
 
		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
	}
 
}
