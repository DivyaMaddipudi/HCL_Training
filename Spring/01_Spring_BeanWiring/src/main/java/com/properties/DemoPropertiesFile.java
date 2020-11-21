package com.properties;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoPropertiesFile {
	
	public static void main(String[] args) {
//		PropertyPlaceholderConfigurer 
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("emp.xml");
		Employee emp = ctx.getBean(Employee.class);
		System.out.println(emp);
	}

}
