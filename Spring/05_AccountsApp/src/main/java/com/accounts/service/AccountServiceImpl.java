package com.accounts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accounts.dao.Account;
import com.accounts.dao.AccountDao;

@Service("accountServiceImpl")
public class AccountServiceImpl implements AccountService{
	
	AccountDao dao;
	
	@Autowired
	public AccountServiceImpl(AccountDao dao) {
		this.dao = dao;
	}

	@Override
	public void transferMoney(long sourceAccountId, long targetAccountId, double amount) {
		Account source = dao.find(sourceAccountId);
		Account target = dao.find(targetAccountId);
		
		source.setBalance(source.getBalance() - amount);
		target.setBalance(target.getBalance() + amount);
		
		System.out.println("---------------------account details after transferring--------------------------------------------");
	}

	@Override
	public void depositMoney(long accountId, double amount) throws Exception {
		
		Account accountToBeDeposited = dao.find(accountId);
		accountToBeDeposited.setBalance(accountToBeDeposited.getBalance() + amount);
		dao.update(accountToBeDeposited);
		System.out.println(dao.find(accountId));
	}

	@Override
	public Account getAccount(long accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}
