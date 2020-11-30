package com.bankapp.model.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSACTIONS")
public class Transactions extends Account{
	
	@Column(name = "BALANCE")
	private long balance;
	
	@Column(name = "TRANSACTION_TYPE")
	@Enumerated(EnumType.STRING)
	private TransactionType transactionType;
	
	public Transactions() {
	}
	
	public Transactions(long balance, TransactionType transactionType) {
		super();
		this.balance = balance;
		this.transactionType = transactionType;
	}
	
	public Transactions(String accountNumber, String accountHolderName, String password, long balance,
			TransactionType transactionType) {
		super(accountNumber, accountHolderName, password);
		this.balance = balance;
		this.transactionType = transactionType;
	}

	public Transactions(String accountNumber, String accountHolderName, long balance, TransactionType transactionType) {
		super(accountNumber, accountHolderName);
		this.balance = balance;
		this.transactionType = transactionType;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Transactions [balance=");
		builder.append(balance);
		builder.append(", transactionType=");
		builder.append(transactionType);
		builder.append("]");
		return super.toString()  + builder.toString();
	}
}
