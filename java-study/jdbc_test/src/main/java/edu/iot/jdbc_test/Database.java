package edu.iot.jdbc_test;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Database {
	// 싱글톤과 유사함...
	private static Connection connection;
	static {		// static connection을 설정하는 블록.
		try {
			Properties properties = new Properties();
			String path = JDBCEx3.class.getResource("/database.properties").getPath();
			properties.load(new FileReader(path));	// 문자단위의 리더,
			String driver = properties.getProperty("driver");
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
//			System.out.println(driver);
//			System.out.println(url);
//			System.out.println(username);
//			System.out.println(password);
			Class.forName(driver);
			connection = (Connection) DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}
	
	public static void close() {
		if(connection!=null) {
			try {
				connection.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}