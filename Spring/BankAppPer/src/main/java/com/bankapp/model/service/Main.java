package com.bankapp.model.service;

public class Main {
	
	public static void main(String[] args) {
		TransactionServiceImpl service = new TransactionServiceImpl();
		service.transferAmount("1234", "4567", 100);
		System.out.println("===============================================");
	}

}
