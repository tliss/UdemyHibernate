package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://104.131.74.25:3306/hb_student_tracker?useSSL=false"; // useSSL=false gets rid of MySQL SSL warnings
		String user = "hbstudent";
		String pass = "hbstudent";
		try {
			
			System.out.println("Connecting to database: " + jdbcUrl);
			Connection myConn = 
					DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection successful!!!");
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}

}
