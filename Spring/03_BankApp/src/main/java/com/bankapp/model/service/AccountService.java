package com.bankapp.model.service;

import com.bankapp.model.dao.Account;

//Service layer = BL + cross cutting concern?

/*
 * servicce layer: logging, security, tx, caching! => AOP
 */
public interface AccountService {
	public void transfer(int from, int to, double balance);
	public Account find(int id);
}
