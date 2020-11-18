package com.customerapp.model;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConnectionFactory {
	
	private static Connection con = null;
	private ConnectionFactory() {}
	
	public static Connection getConnection() {
		
		InputStream is = ConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties");
		
		Properties properties = new Properties();
		try {
			properties.load(is);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		String driver = properties.getProperty("db.driverName");
		String url = properties.getProperty("db.url");
		String username = properties.getProperty("db.username");
		String password = properties.getProperty("db.password");
		
//		try {
//			Class.forName(driver);
//		}catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
}
