package com.book.listner;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DbDriver implements ServletContextListener {

    
    public void contextInitialized(ServletContextEvent event)  { 
    	
    	String driver = event.getServletContext().getInitParameter("driver");
    	System.out.println("====================driver loaded========================");
    	System.out.println(driver);
    	try {
			Class.forName(driver);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
    
    public void contextDestroyed(ServletContextEvent event)  { 
    }

	
}
