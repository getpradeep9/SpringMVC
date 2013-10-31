package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class PostgresJDBC implements PJdbc {

	DataSource datasource;

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	public void doStuff() {

		System.out.println("_Started");

		
		try {

			Connection connection = datasource.getConnection();
			
			Statement stmt = connection.createStatement();

			/*
			 * ResultSet rst=stmt.executeQuery("update emp set sal="+9999+
			 * " where empno='a101'");
			 * 
			 * while(rst.next()){ System.out.println(rst.getString(1)); }
			 */

			boolean ret = stmt.execute("update emp set sal=" + 9999
					+ " where empno='a103'");

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
