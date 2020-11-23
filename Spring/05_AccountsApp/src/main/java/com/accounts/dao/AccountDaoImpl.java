package com.accounts.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao{

	private Map<Long, Account> accountsMap = new HashMap<Long, Account>();
	
	{
		
		Account account1 = new Account();
		account1.setId(1L);
		account1.setOwnerName("divya");
		account1.setBalance(1000);
		account1.setAccessTime(new Date());
		accountsMap.put(account1.getId(), account1);
		
		Account account2 = new Account();
		account2.setId(2L);
		account2.setOwnerName("veenai");
		account2.setBalance(2000);
		account2.setAccessTime(new Date());
		accountsMap.put(account2.getId(), account2);
		
		

	}
	
	@Override
	public void insert(Account account) {
		accountsMap.put(account.getId(), account);
		
	}

	@Override
	public void update(Account account) {
		accountsMap.put(account.getId(), account);
	}

	@Override
	public void update(List<Account> accounts) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long accountId) {
		accountsMap.remove(accountId);
	}

	@Override
	public Account find(long accountId) {
		return accountsMap.get(accountId);
	}

	@Override
	public List<Account> find(List<Long> accountIds) {

		ArrayList<Account> newAccountsList = new ArrayList<Account>();
		
		for(Long account: accountIds) {
			if(accountsMap.containsKey(account)) {
				newAccountsList.add((Account) accountsMap.values());
			}
		}
		
		return newAccountsList;
	}

	@Override
	public List<Account> find(String ownerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> find(boolean locked) {
		// TODO Auto-generated method stub
		return null;
	}

}
