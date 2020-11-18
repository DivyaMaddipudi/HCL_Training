package com.demo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class DemoListner implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent event)  { 
         
    }

    public void contextInitialized(ServletContextEvent event)  { 
         String email = event.getServletContext().getInitParameter("email");
         event.getServletContext().setAttribute("email", email);
    }
	
}
