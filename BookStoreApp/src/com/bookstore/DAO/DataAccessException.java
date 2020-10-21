package com.bookstore.DAO;

public class DataAccessException extends RuntimeException{
	
	public DataAccessException(String message, Throwable cause) {
		super(message, cause);
	}
}
