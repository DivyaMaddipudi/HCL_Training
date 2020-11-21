package com.bankapp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.model.dao.Account;
import com.bankapp.model.dao.AccountDao;
import com.bankapp.model.dao.AccountDaoImpl;

//@Service(value = "accountService")
public class AccountServiceImpl implements AccountService{
	
//	@Autowired
	private AccountDao accountDao; //must => ctr
	
//	@Autowired
	private EmailService emailService; //optional

//	public AccountServiceImpl() {
//		
//	}
//	
//	public AccountServiceImpl(AccountDao accountDao) {
//		this.accountDao = accountDao;
//	}
	
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void transfer(int from, int to, double balance) {
		//tx, log4j, security, caching => declarative way
		Account accountFrom = accountDao.find(from);
		Account accountTo = accountDao.find(to);
		
		accountFrom.setBalance(accountFrom.getBalance() - balance);
		accountTo.setBalance(accountTo.getBalance() + balance);
		
		accountDao.update(accountFrom);
		accountDao.update(accountTo);
		
		System.out.println("fund transfered");
		if(emailService != null) {
			emailService.sendEmail("divya@gmail.com");
		}
		
	}

	public Account find(int id) {
		return accountDao.find(id);
	}

}
