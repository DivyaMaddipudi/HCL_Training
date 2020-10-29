package com.day2.stack;

public class Book {
	
	private int bookId;
	private String bookTitle;
	
	public Book(int bookId, String bookTitle) {
		
		this.bookId = bookId;
		this.bookTitle = bookTitle;
	}
	
	public void printBook() {
		System.out.println(bookId + " " + bookTitle);
	}

	public String printBooks() {
		return "bookId=" + bookId + ", bookTitle=" + bookTitle + "";
	}
}
