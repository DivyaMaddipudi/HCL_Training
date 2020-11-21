package com.mapping;

import java.util.List;

public class Bank {
	
	private String bank;
	private List<Account> accounts;
	public void setBank(String bank) {
		this.bank = bank;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	public void printDetails() {
		System.out.println("bank name " + bank);
		System.out.println("---------account details---------");
		accounts.forEach(a -> System.out.println(a));
	}

}
