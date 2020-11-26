package com.bookapp.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookapp.dao.Book;
import com.bookapp.service.BookService;


@Controller
public class HelloController {
	
	private BookService bookService;
	
	@Autowired
	public HelloController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping("/")
	public String home() {
		return "redirect:/allbooks";
	}

	@GetMapping("allbooks")
	public ModelAndView hello(ModelAndView mv) {
		List<Book> books = bookService.getAllBooks();
		mv.addObject("books", books);
		mv.setViewName("showAllBooks");
		return mv;
	}
	
	@GetMapping("deletebook")
	public String deleteBook(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("id"));
		bookService.deleteBook(id);
		return "redirect:/allbooks";
	}
	
	
	@GetMapping("addbook")
	public String addBookGet(ModelMap map) {
		Book book = new Book(); // form bean: write now it is empty
		book.setAuthor("divya");
		map.addAttribute("book", book);
		return "addbook";
	}

	@PostMapping("addbook")
	public String addBookPost(HttpServletRequest req, @ModelAttribute(name="book") Book book) {
		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println(id);
		
		if(id == 0) {
			bookService.addBook(book);
		} else {
			bookService.updateBook(id, book);
		}
		return "redirect:/allbooks";
	}
	
	@GetMapping("updatebook")
	public String updateBookGet(HttpServletRequest req, ModelMap map) {
		int id = Integer.parseInt(req.getParameter("id"));
		Book book = bookService.getBookById(id);
		map.addAttribute("book", book);
		return "updatebookpage";
	}
	
}
