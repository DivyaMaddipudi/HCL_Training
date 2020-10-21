package com.bookstore.DAO;

import java.sql.SQLException;

public class BookDaoImplUsingJdbc implements BookDao{

	@Override
	public void addBook(Book book) throws DataAccessException{
		System.out.println("book is added to db using jdbc");
		
		try {
			if(1==1)
				throw new SQLException();
		} catch(SQLException ex) {
			throw new DataAccessException("some data acces", ex);
		}
	}
}
