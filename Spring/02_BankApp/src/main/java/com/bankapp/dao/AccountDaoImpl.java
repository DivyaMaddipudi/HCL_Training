package com.bankapp.dao;

import java.util.*;

import org.springframework.stereotype.Repository;


@Repository
public class AccountDaoImpl implements AccountDao {

private Map<Integer, Account> acccounts=new HashMap<Integer, Account>();
	
	public AccountDaoImpl() {
		acccounts.put(1, new Account(1	, "raj", 1000));
		acccounts.put(2, new Account(2	, "ekta", 1000));
	}
	
	public List<Account> getAllAccounts() {
		return new ArrayList<Account>(acccounts.values());
	}

	public void update(Account account) {
		acccounts.put(account.getId(), account);
	}

	public Account findAccountById(int id) {
		return acccounts.get(id);
	}

}

