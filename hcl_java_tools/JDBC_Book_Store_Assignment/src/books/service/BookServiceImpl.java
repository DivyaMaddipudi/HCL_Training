package books.service;

import java.util.List;

import books.dao.BookDaoImpl;
import books.dao.DaoException;
import books.model.Book;

public class BookServiceImpl implements BookService{

	BookDaoImpl bookDao;
	
	public BookServiceImpl() {
		bookDao = new BookDaoImpl();
	}
	@Override
	public List<Book> getAllBooks() throws DaoException {
		return bookDao.getAllBooks();
	}
	@Override
	public Book addBook(Book book) throws DaoException {
		return bookDao.addBook(book);
	}
	@Override
	public void deleteBook(int id) throws DaoException {
		bookDao.deleteBook(id);
		
	}
	@Override
	public void updateBook(int id, Book book) throws DaoException {
		bookDao.updateBook(id, book);
		
	}
	@Override
	public Book getBookById(int id) throws DaoException {
		return bookDao.getBookById(id);
	}
}
