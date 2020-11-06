package books.controller;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import book.exception.BookNotFoundException;
import book.exception.DaoException;
import books.model.Book;
import books.service.BookServiceImpl;

public class MainController {
	private static BookServiceImpl bookService = new BookServiceImpl();;

	public static void main(String[] args) {
		// checking connection
		// Connection conn = ConnectionFactory.getConnection();

//		System.out.println("-------------------------------display books--------------------------------------");
//		try {
//			List<Book> booksList = bookService.getAllBooks();
//			for (Book book : booksList) {
//				System.out.println(book.getId() + " " + book.getIsbn() + " " + book.getTitle() + " " + book.getAuthor()
//						+ " " + book.getPrice());
//			}
//		} catch (DaoException e) {
//			throw new DaoException("error while fetching all the records in main", e);
//		}

		
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
//			int id = 20;
//			System.out.println("--------------------------------delete book in db-----------------------------------------------");
//			bookService.deleteBook(id);
//			System.out.println("book successfully deleted");
//		} catch (DaoException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		int id = 8;
		Book updateBook = new Book("A131", "Java 8 in action", "umra", 1200);
		try {
			System.out.println("--------------------------------update book in db-----------------------------------------------");
			bookService.updateBook(id, updateBook);
			System.out.println("updated successfully");
		} catch (DaoException e) {
			e.printStackTrace();
		}
		
		int idValueToGetData = 10;
		try {
			System.out.println("--------------------------------get book based on Id-------------------------------------------------");
			Book getBookById = bookService.getBookById(idValueToGetData).orElseThrow(() ->  new BookNotFoundException("book not found"));
			System.out.println(getBookById);
		} catch (DaoException e) {
			e.printStackTrace();
		}
	}

}
