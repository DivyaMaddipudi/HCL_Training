package com.bankapp.model.service;

import java.util.List;

import com.bankapp.model.dao.Transactions;

public interface TransactionService {
	public void transferAmount(String fromAccountNumber, String toAccountNumber, long amount);
	public String generateAccountNumber();
	public void saveAccount(Transactions transactions);
	public Transactions getAccountByAccountNumber(String accountNumber);
	public boolean verifyDetails(String username, String password, String accountNumber);
	public long checkBalance(String accountNumber);
}
