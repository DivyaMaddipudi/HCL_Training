package com.customerapp.web.listeners;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DbDriverListner implements ServletContextListener {
	
	public void contextInitialized(ServletContextEvent event) {
		String driver = event.getServletContext().getInitParameter("driver");
		System.out.println("============driver loaded=============");

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public void contextDestroyed(ServletContextEvent sce) {

	}

}
