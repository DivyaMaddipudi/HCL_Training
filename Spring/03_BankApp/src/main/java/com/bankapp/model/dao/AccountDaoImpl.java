package com.bankapp.model.dao;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository(value = "accountDao") //accountDaoImpl
public class AccountDaoImpl implements AccountDao{

	private Map<Integer, Account> accounts = new HashMap<Integer, Account>();
	
	{
		accounts.put(1, new Account(1, "divya", 5000));
		accounts.put(2, new Account(2, "veenai", 10000));
	}
	
	public void update(Account account) {
		accounts.put(account.getId(), account);
		
	}

	public Account find(int id) {
		return accounts.get(id);
	}
}
