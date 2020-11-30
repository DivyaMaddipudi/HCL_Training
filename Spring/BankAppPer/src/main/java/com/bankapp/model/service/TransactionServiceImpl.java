package com.bankapp.model.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.exceptions.DataAccessException;
import com.bankapp.model.dao.Account;
import com.bankapp.model.dao.TransactionDao;
import com.bankapp.model.dao.Transactions;
import com.bankapp.model.dao.TransactionsDaoImpl;

@Service("transactionService")
@Transactional
public class TransactionServiceImpl implements TransactionService{
	
	private static long counterNumber = 100;
	
	private TransactionDao transactionDao;

	public TransactionServiceImpl() {
	}

	@Autowired
	public TransactionServiceImpl(TransactionDao transactionDao) {
		this.transactionDao = transactionDao;
	}

	@Override
	public void transferAmount(String fromAccountNumber, String toAccountNumber, long amount) {
		Transactions fromAccount = transactionDao.getAccountByAccountNumber(fromAccountNumber);
		Transactions toAccount = transactionDao.getAccountByAccountNumber(toAccountNumber);
		
		if(fromAccount.getBalance() > 500) {
			long balanceFrom = fromAccount.getBalance() - amount;
				if(balanceFrom > 500) {
					long balanceTo = toAccount.getBalance() + amount;
					transactionDao.updateAccount(toAccount.getAccountNumber(), balanceTo);
					transactionDao.updateAccount(fromAccount.getAccountNumber(), balanceFrom);
				} else {
					throw new DataAccessException("Insufficient balance...");
				}
		} else {
			throw new DataAccessException("Insufficient balance in account...");
		}
		
	}

	@Override
	public String generateAccountNumber() {
		Random rand = new Random();
		int value = rand.nextInt(1000);
		String accountNumber = "" + counterNumber + value;
		counterNumber++;
		return accountNumber;
	}

	@Override
	public void saveAccount(Transactions transactions) {
		transactionDao.saveAccount(transactions);
		
	}

	@Override
	public Transactions getAccountByAccountNumber(String accountNumber) {
		return transactionDao.getAccountByAccountNumber(accountNumber);
	}

	@Override
	public boolean verifyDetails(String accountName, String password, String accountNumber) {
		Transactions transactionDetails = transactionDao.getAccountByAccountNumber(accountNumber);
		boolean isValidAccount = false;
		if(accountName.equals(transactionDetails.getAccountHolderName()) && (password.equals(transactionDetails.getPassword()))) {
			isValidAccount = true;
		} else {
			isValidAccount = false;
		}
		return isValidAccount;
	}

	@Override
	public long checkBalance(String accountNumber) {
		Transactions account = transactionDao.getAccountByAccountNumber(accountNumber);
		return account.getBalance();
	}

}
