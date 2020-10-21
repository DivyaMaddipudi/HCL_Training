package com.bookstore.DAO;

import java.sql.SQLException;

public interface BookDao {
	
	public void addBook(Book book) throws DataAccessException;

}
