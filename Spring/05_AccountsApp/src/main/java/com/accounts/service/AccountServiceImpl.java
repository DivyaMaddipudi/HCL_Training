package com.accounts.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accounts.dao.Account;
import com.accounts.dao.AccountDao;

@Service("accountServiceImpl")
public class AccountServiceImpl implements AccountService{
	
	AccountDao dao;
	
	public AccountServiceImpl() {
		
	}
	
	@Autowired
	public AccountServiceImpl(AccountDao dao) {
		this.dao = dao;
	}

	@Override
	public void transferMoney(long sourceAccountId, long targetAccountId, double amount) {
		Account source = dao.find(sourceAccountId);
		Account target = dao.find(targetAccountId);
		
		System.out.println(dao.find(sourceAccountId));
		System.out.println(dao.find(targetAccountId));
		
		source.setBalance(source.getBalance() - amount);
		target.setBalance(target.getBalance() + amount);
		
		dao.update(Arrays.asList(source, target));
		
		System.out.println("---------------------account details after transferring--------------------------------------------");
		System.out.println(dao.find(sourceAccountId));
		System.out.println(dao.find(targetAccountId));
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
		return dao.find(accountId);
	}

}
