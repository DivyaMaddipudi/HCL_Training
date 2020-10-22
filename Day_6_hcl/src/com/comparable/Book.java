package com.comparable;

import java.util.Comparator;

//using comaparable we can only define one sort sequence
// what if i want to define more sort seq: we have to go for comparator

class BookSorteAsPerName implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		
		//logic to teach java how to sort as per title
		
		return o2.getTitle().compareTo(o1.getTitle());
	}
}


class BookSortedAsPerPriceThenId implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		
		int val  = Double.compare(o1.getPrice(), o2.getPrice());
		if(val == 0) {
			val = Double.compare(o1.getBookId(), o2.getBookId());
		}
			
		return val;	 
	}
}

class BookSortedAsPerPrice implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return Double.compare(o1.getPrice(), o2.getPrice()); 
	}
}

public class Book implements Comparable<Book>{
	
	private int bookId;
	private String title;
	private double price;
	
	public Book() {
		
	}
	
	public Book(int bookId, String title, double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [bookId=");
		builder.append(bookId);
		builder.append(", title=");
		builder.append(title);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Book o) {
		// java internally calls this method
		return Integer.compare(this.getBookId(), o.getBookId());
	}
	
}
