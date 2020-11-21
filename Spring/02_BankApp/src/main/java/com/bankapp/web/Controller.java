package com.bankapp.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bankapp.service.AccountService;

public class Controller {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		AccountService as=(AccountService) ctx.getBean("accountService");
		
		as.transfer(1, 2, 100);
		as.getAllAccounts().forEach(a-> System.out.println(a));
	
		
	}

}
