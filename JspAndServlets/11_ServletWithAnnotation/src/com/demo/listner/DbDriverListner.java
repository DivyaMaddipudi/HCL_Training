package com.demo.listner;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class DbDriverListner implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent sce)  { 
        System.out.println("destroy in listner");
    }

	public void contextInitialized(ServletContextEvent sce)  { 
		System.out.println("init in listner");
    }
	
}
