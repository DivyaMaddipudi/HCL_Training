package com.bankapp.model.dao;

import java.util.List;

public interface TransactionDao {
	
	public void updateAccount(String accountNumber, long balance);
	public Transactions getAccountByAccountNumber(String accountNumber);
	public void saveAccount(Transactions transactions);

}
