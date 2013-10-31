package com.aop;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.PJdbc;

public class PostgresJDBC implements PJdbc {
	
	DataSource datasource;

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.REPEATABLE_READ,timeout=1)     
	@Override
	public void doStuff() {


		System.out.println("_Started");

		
		try {

			Connection connection = datasource.getConnection();
			
			Statement stmt = connection.createStatement();

			boolean ret = stmt.execute("update emp set sal=" + 9797
					+ " where empno='a104'");

			stmt.close();
			connection.close();

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;

		}

		System.out.println("_Done");

	
		
	}
	
	
	
	
	
}
