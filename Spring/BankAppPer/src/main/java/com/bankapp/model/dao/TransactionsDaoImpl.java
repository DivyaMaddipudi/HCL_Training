package com.bankapp.model.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionsDaoImpl implements TransactionDao{

	private SessionFactory factory;
	
	public TransactionsDaoImpl() {
	}

	@Autowired
	public TransactionsDaoImpl(SessionFactory factory) {
		this.factory = factory;
	}
	
	private Session getSession() {
		System.out.println("---------------------------------------");
		System.out.println(factory.getCurrentSession());
		return factory.getCurrentSession();
	}

	@Override
	public void updateAccount(String accountNumber, long balance) {
		Transactions accountToBeUpdated = getAccountByAccountNumber(accountNumber);
		accountToBeUpdated.setBalance(balance);
		getSession().update(accountToBeUpdated);
	}

	@Override
	public Transactions getAccountByAccountNumber(String accountNumber) {
		Query query = getSession().createQuery("select a from Account a where accountNumber=:accountNumber1");
		query.setParameter("accountNumber1", accountNumber);
		Transactions list = (Transactions) query.getSingleResult();
		return  list;
		
	}

	@Override
	public void saveAccount(Transactions transactions) {
		getSession().save(transactions);
		
	}
}
