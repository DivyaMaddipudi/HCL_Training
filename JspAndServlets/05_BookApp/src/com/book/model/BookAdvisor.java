package com.book.model;

import java.util.ArrayList;
import java.util.List;

public class BookAdvisor {
	
	public static List<String> getBooks(String topic) {
		
		List<String> books = new ArrayList<>();
		if(topic.equals("servlet")) {
			books.add("head first servlet jsp");
			books.add("note by rajiv sir");
		} else if(topic.equals("spring")) {
			books.add("spring in action E5");
			books.add("begining spring");
		} else if(topic.equals("hibernate")) {
			books.add("begining hibernate 5");
		}
		return books;
	}

}
