package rmi;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
	private static final String driverName = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mySql://localhost:3303/dictionary";
	private static final String username = "root";
	private static final String password = "123456";
	
	//Oracle
	//XE is the Oracle service name.
//	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
//	private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
//	private static final String DB_USERNAME = "system";
//	private static final String DB_PASSWORD = "oracle";
	
	public static Connection getConnection() {
		Connection connection = null;
		
		//Oracle
//		try{
//			//Register the JDBC driver
//			Class.forName(DB_DRIVER);
// 
//			//Open the connection
//			connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
// 
//			if(connection != null){
//			   System.out.println("Successfully connected.");
//			}else{
//			   System.out.println("Failed to connect.");
//			}
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		
		try {
			//Đăng ký driver
			Class.forName(driverName);
			//Tạo kết nối
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
	
	public static void closeConnection(Connection connection) {
		try {
			if(connection !=  null) {
				connection.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
