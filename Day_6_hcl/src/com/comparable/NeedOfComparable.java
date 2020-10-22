package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NeedOfComparable {
	
	public static void main(String[] args) {
		
		ArrayList<Book> bookList = new ArrayList<>();
		bookList.add(new Book(104, "RDPD", 200));
		bookList.add(new Book(102, "ikigai", 399));
		bookList.add(new Book(103, "java", 600));
		bookList.add(new Book(101, "spring", 250));
		bookList.add(new Book(104, "python", 300));
		bookList.add(new Book(104, "the alchemist", 250));
		
		printBooks(bookList);
		
//		sort the books
		Collections.sort(bookList);
		
		System.out.println("Sorted as per id");
		
		printBooks(bookList);
		
		System.out.println("sorted as per title");
		//how to force java to sort as per title
		Collections.sort(bookList, new BookSorteAsPerName());
		printBooks(bookList);
		
		System.out.println("-----------------------------------");
		System.out.println("sorted as per price");
		//how to force java to sort as per price
		System.out.println("--------------------------");
		Collections.sort(bookList, new BookSortedAsPerPriceThenId());
		printBooks(bookList);
		
		
	}

	private static void printBooks(ArrayList<Book> bookList) {
		//print the book
		for(Book book: bookList) {
			System.out.println(book);
		}
	}

}
