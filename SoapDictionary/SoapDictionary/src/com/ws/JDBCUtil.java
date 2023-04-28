package com.ws;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
	private static final String driverName = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mySql://localhost:3303/dictionary";
	private static final String username = "root";
	private static final String password = "123456";
	
	public static Connection getConnection() {
		Connection connection = null;
		
		try {
			Class.forName(driverName);
			connection =  DriverManager.getConnection(url, username, password);

			if(connection != null){
				   System.out.println("Successfully connected.");
				}else{
				   System.out.println("Failed to connect.");
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return connection;
		
	}
}
