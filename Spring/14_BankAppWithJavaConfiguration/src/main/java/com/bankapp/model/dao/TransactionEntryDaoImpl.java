package com.bankapp.model.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionEntryDaoImpl implements TransactionEntryDao{

	private SessionFactory factory;
	
	@Autowired
	public TransactionEntryDaoImpl(SessionFactory factory) {
		this.factory = factory;
	}
	
	private Session getSession() {
		return factory.getCurrentSession();
	}
	
	@Override
	public  TransactionEntry addTransaction(String txInfo, Double amount, TxType txType) {
		TransactionEntry transactionEntry = new TransactionEntry(txInfo, amount, txType);
		getSession().persist(transactionEntry);
		return transactionEntry;
	}

	@Override
	public List<TransactionEntry> getTransactionsById(int accountId) {
		Query query = getSession().createNativeQuery("select * from transaction_table t where t.account_id_fk=:accountId", TransactionEntry.class);
		query.setParameter("accountId", accountId);
		List<TransactionEntry> transactionEntries = query.getResultList();
		return transactionEntries;
	}
}
