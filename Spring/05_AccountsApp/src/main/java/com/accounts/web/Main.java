package com.accounts.web;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accounts.config.AppConfig;
import com.accounts.service.AccountService;
import com.accounts.service.AccountServiceImpl;

public class Main {
	
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
		
		AccountService service = ctx.getBean("accountServiceImpl", AccountServiceImpl.class);
		
		try {
//			service.depositMoney(1, 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		service.transferMoney(1, 2, 500);
		
		System.out.println("----------------getting account details--------------------------");
		System.out.println(service.getAccount(1));
	}

}
