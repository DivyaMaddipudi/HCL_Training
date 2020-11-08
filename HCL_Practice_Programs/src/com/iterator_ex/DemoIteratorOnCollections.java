package com.iterator_ex;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

class Book {
	
	 	String name;
	    String author;
	    long isbn;
	    float price;
	    
		public Book(String name, String author, long isbn, float price) {
			super();
			this.name = name;
			this.author = author;
			this.isbn = isbn;
			this.price = price;
		}
		
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Book [name=");
			builder.append(name);
			builder.append(", author=");
			builder.append(author);
			builder.append(", isbn=");
			builder.append(isbn);
			builder.append(", price=");
			builder.append(price);
			builder.append("]");
			return builder.toString();
		}
}


class BookShop implements Iterable<Book>{

	List<Book> bookList;
	
	public BookShop() {
		bookList =  new ArrayList<Book>();
	}

	public void addBook(Book book) {
		bookList.add(book);
	}

	@Override
	public Iterator<Book> iterator() {
		return bookList.iterator();
	}
	
//	class BookShopIterator implements Iterator<Book>{
//		int index = 0;
//		@Override
//		public boolean hasNext() {
//			if(index >= bookList.size()) {
//				return false;
//			} else {
//				return true;
//			}
//		}
//
//		@Override
//		public Book next() {
//			return bookList.get(index++);
//		}
//		
//		@Override
//		public void remove() {
//			bookList.get(--index);
//		}
//	}
}
public class DemoIteratorOnCollections {
	
	public static void main(String[] args) {
		
		Book book1 = new Book("Java", "JamesGosling", 123456, 1000.0f);
        Book book2 = new Book("Spring", "RodJohnson", 789123, 1500.0f);
        Book book3 = new Book("Struts", "Apache", 456789, 800.0f);
        
        BookShop bookShop = new BookShop();
        bookShop.addBook(book1);
        bookShop.addBook(book2);
        bookShop.addBook(book3);
        
        for(Book book: bookShop) {
        	System.out.println(book);
        }
        
	}
}
