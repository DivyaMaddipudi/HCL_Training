package com.bankapp.exceptions;

public class DataAccessException extends RuntimeException{
	public DataAccessException(String msg) {
		super(msg);
	}
}
