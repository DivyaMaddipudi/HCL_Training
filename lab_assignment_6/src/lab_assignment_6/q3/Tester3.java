package lab_assignment_6.q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Tester3 {
	
	public static void main(String[] args) {
		
		Book book = new Book(1, "head first java", "bates");
		Book book1 = new Book(2, "ikigai", "mercika");
		Book book2 = new Book(3, "amex", "amer");
		Book book3 = new Book(4, "let's us c", "Yaswanth kanethkar");
		
		
		BookCollection bookCol = new BookCollection();
		bookCol.bookList.add(book);
		bookCol.bookList.add(book1);
		bookCol.bookList.add(book2);
		bookCol.bookList.add(book3);
		
		System.out.println("---------------before sorting---------------");
		printBooks(bookCol.bookList);
		
		//check whether book is there or not
		Book bookUpdate = new Book("ikigai", "george");
		System.out.println(bookCol.hasBook(bookUpdate));
		
		//sort
		System.out.println("---------------after sorting by book title---------------");
		bookCol.sortByBookName();
		

		System.out.println("---------------after sorting by author ---------------");
		bookCol.sortByAuthor();
	}
	
	private static void printBooks(List<Book> bookList) {
		//print the book
		for(Book book: bookList) {
			System.out.println(book);
		}
	}

}
