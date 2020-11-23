package com.accounts.web;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.accounts.config.AppConfig;
import com.accounts.service.AccountService;
import com.accounts.service.AccountServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		AccountService service = ctx.getBean("accountServiceImpl", AccountServiceImpl.class);
		
		try {
			service.depositMoney(1, 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
