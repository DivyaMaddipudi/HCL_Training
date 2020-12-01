package com.bookapp.model.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.bookapp.model.dao.BookDao;

public class BookServiceImpl implements BookService{

	private BookDao dao;
	
	
	public BookServiceImpl(BookDao dao) {
		super();
		this.dao = dao;
	}


	@Override
	public List<String> getBooksOnTopic(String topic) {
		return dao.getAllBooks().stream().filter(b -> b.contains(topic)).collect(Collectors.toList());
	}

}
