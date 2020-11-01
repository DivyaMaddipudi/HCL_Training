package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class DemoOnStreams {
	
	public static void main(String[] args) {
		//1. filter expensive transactions and group them by currency
		System.out.println("--------------------------------------filter expensive transactions and group them by currency----------------------------------");
		
		List<Transaction> transactions = Arrays.asList(new Transaction(1200, new Currency("Rupee")), new Transaction(1000, new Currency("Rupee")), 
								new Transaction(700, new Currency("Yen")), new Transaction(1500,  new Currency("Dollars")));
		
		Map<Currency, List<Transaction>> transactionsByCurrencies = new HashMap<>();
		
		
//		for(Transaction transaction : transactions) {
//			if(transaction.getPrice()>=1000) {
//				Currency currency = transaction.getCurrency();
//				
//				List<Transaction> transactionsForCurrency = transactionsByCurrencies.get(currency);
//				if(transactionsForCurrency == null) {
//					transactionsForCurrency = new ArrayList<>();
//				}
//				transactionsByCurrencies.put(currency, transactionsForCurrency);
//				transactionsForCurrency.add(transaction);
//			}
//			
//		}
		
//		Set<Entry<Currency, List<Transaction>>> groupByCurrency = transactionsByCurrencies.entrySet();
//		for(Entry<Currency, List<Transaction>> entry : groupByCurrency) {
//			System.out.println(entry.getKey() +":" + entry.getValue());
//		}
		
		Map<Currency, List<Transaction>> getAllTransactions = transactions.stream().filter(tran -> tran.getPrice() >= 1000)
																		.collect(Collectors.groupingBy(Transaction::getCurrency));
		
		
		
		Set<Entry<Currency, List<Transaction>>> groupByCurrency = getAllTransactions.entrySet();
		for(Entry<Currency, List<Transaction>> entry : groupByCurrency) {
			System.out.println(entry.getKey() +":" + entry.getValue());
		}
	}
}
