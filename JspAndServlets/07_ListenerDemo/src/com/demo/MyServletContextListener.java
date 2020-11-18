package com.demo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event)  { 
         String dogName = event.getServletContext().getInitParameter("dogName");
         Dog dog = new Dog(dogName);
         //i will keep this dog into context scope so that any servlet/jsp can pick it
         event.getServletContext().setAttribute("dog", dog);
    }
    
	public void contextDestroyed(ServletContextEvent event)  { 
		event.getServletContext().removeAttribute("dog");
	}
}
