package com.bankapp.model.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bankapp.config.AppConfig;
import com.bankapp.model.service.AccountService;

public class Main {
	
	public static void main(String[] args) {
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class );
		
		AccountService accountService = ctx.getBean("getAccountService", AccountService.class);
		
		System.out.println("status of account before transfer: ");
		System.out.println(accountService.find(1));
		System.out.println(accountService.find(2));
		
		accountService.transfer(1, 2, 1000);
		
		System.out.println("status of account after transfer: ");
		System.out.println(accountService.find(1));
		System.out.println(accountService.find(2));
		
		
		
	}
}
