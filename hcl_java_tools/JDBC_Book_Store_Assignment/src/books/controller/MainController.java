package books.controller;

import java.sql.Connection;
import java.util.List;

import books.dao.DaoException;
import books.model.Book;
import books.service.BookServiceImpl;

public class MainController {
	private static BookServiceImpl bookService = new BookServiceImpl();;

	public static void main(String[] args) throws DaoException {
		// checking connection
		// Connection conn = ConnectionFactory.getConnection();

		System.out.println("-------------------------------display books--------------------------------------");
		try {
			List<Book> booksList = bookService.getAllBooks();
			for (Book book : booksList) {
				System.out.println(book.getId() + " " + book.getIsbn() + " " + book.getTitle() + " " + book.getAuthor()
						+ " " + book.getPrice());
			}
		} catch (DaoException e) {
			throw new DaoException("error while fetching all the records in main", e);
		}

		
//		Book book = new Book("A1234", "Think like a monk", "Jay shetty", 399);
//		try {
//			System.out.println("-----------------------------------add book in db-----------------------------------------------");
//			Book bookData = bookService.addBook(book);
//			System.out.println(bookData.getIsbn() + " " + bookData.getTitle() + " " + bookData.getAuthor() + " "
//					+ bookData.getPrice());
//		} catch (DaoException e) {
//			throw new DaoException("add book error in main", e);
//		}
		
		
		
//		try {
//			int id = 3;
//			System.out.println("--------------------------------delete book in db-----------------------------------------------");
//			bookService.deleteBook(id);
//		} catch (DaoException e) {
//			// TODO Auto-generated catch block
//			throw new DaoException("delete error in main", e);
//		}
		
		int id = 5;
		Book updateBook = new Book("A131", "Java 8 in action", "umra", 1200);
		try {
			System.out.println("--------------------------------update book in db-----------------------------------------------");
			bookService.updateBook(id, updateBook);
		} catch (DaoException e) {
			e.printStackTrace();
		}
		
		int idValueToGetData = 10;
		System.out.println("--------------------------------get book based on Id-------------------------------------------------");
		Book getBookById = bookService.getBookById(idValueToGetData);
		System.out.println(getBookById.getIsbn() + " " + getBookById.getTitle() +" " + getBookById.getAuthor() + " " + getBookById.getPrice());
	}

}
