package com.bookapp.model.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import com.bookapp.model.dao.BookDao;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceImplTest {

	@Mock
	private BookDao dao;
	
	@InjectMocks
	private BookServiceImpl bookService;
	
	@Test
	public void testAllJavaBooks() {
		
//		dao = mock(BookDao.class);
		
		List<String> allBooks = Arrays.asList("java", "java adv", "RDPD");
		
		when(dao.getAllBooks()).thenReturn(allBooks);
		
		bookService = new BookServiceImpl(dao);
		Assert.assertEquals(2, bookService.getBooksOnTopic("java").size());
	}
}
