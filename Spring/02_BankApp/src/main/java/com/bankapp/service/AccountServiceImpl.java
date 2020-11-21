package com.bankapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;

@Service(value = "accountService")
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountDao dao;

	public AccountServiceImpl() {}
	public AccountServiceImpl(AccountDao dao) {
		this.dao = dao;
	}

	public void setDao(AccountDao dao) {
		this.dao = dao;
	}

	public List<Account> getAllAccounts() {
		return dao.getAllAccounts();
	}
	
	public void transfer(int fromId, int toId, int amount) {
		//first load first acc, then get sec
		//deduce amount from fromAcc, deposite in toAcc, update the balance
		Account fromAcc=dao.findAccountById(fromId);
		Account toAcc=dao.findAccountById(toId);
		fromAcc.setBalance(fromAcc.getBalance()-amount);
		toAcc.setBalance(toAcc.getBalance()+amount);
		dao.update(fromAcc);
		dao.update(toAcc);
	}


}
