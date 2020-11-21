package com.mapping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("mapping.xml");
		Bank bank = ctx.getBean("bank", Bank.class);
		bank.printDetails();
		
	}

}
