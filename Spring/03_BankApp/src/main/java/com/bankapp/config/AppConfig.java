package com.bankapp.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.bankapp.model.dao.AccountDao;
import com.bankapp.model.dao.AccountDaoImpl;
import com.bankapp.model.service.AccountService;
import com.bankapp.model.service.AccountServiceImpl;
import com.bankapp.model.service.EmailService;
import com.bankapp.model.service.EmailServiceImpl;

@Configuration
@ComponentScan(basePackages = {"com.bankapp"})
public class AppConfig {
	
	@Bean(autowire = Autowire.BY_TYPE)
	public AccountService getAccountService() {
		AccountServiceImpl as = new AccountServiceImpl();
//		as.setAccountDao(getAccountDao());
//		as.setEmailService(getEmailService());
		
		return as;
	}


	@Bean(autowire = Autowire.BY_TYPE)
	public EmailService getEmailService() {
		EmailService emailService = new EmailServiceImpl();
		return emailService;
	}

	@Bean(autowire = Autowire.BY_TYPE)
	public AccountDao getAccountDao() {
		AccountDao accountDao = new AccountDaoImpl();
		return accountDao;
	}

}
