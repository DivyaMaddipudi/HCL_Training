package com.bookstore.DAO;

import java.sql.SQLException;

public class BookDaoImplHibernate implements BookDao{

	@Override
	public void addBook(Book book) throws DataAccessException {
		System.out.println("book is added to db using hibernate");
		
		try {
			if(1==1)
				throw new HibernateException("hibernate");
		} catch(HibernateException ex) {
			throw new DataAccessException("some data added", ex);
		}
		
	}

}
