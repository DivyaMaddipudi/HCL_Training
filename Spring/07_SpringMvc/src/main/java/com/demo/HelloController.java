package com.demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
//	private DataSource dataSource;
	
	@GetMapping("hello")
	public ModelAndView hello(ModelAndView mv) {
		
//		try {
//			Connection conn = dataSource.getConnection();
//			if(conn != null) {
//				System.out.println(conn);
//			} else {
//				throw new ConnectionException("Connection failed");
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		List<String> books = Arrays.asList("spring", "hibernate", "java");
		mv.addObject("books", books);
		mv.setViewName("show");
		return mv;
	}
	
	@GetMapping("helloMap/{name}/{address}")
	public void hello(@PathVariable("name") String name, @PathVariable("address") String address ) {
		
		System.out.println(name);
		System.out.println(address);
	}
	
	@GetMapping("helloMap1")
	public void hello1(@RequestParam("name") String name, @RequestParam("address") String address ) {
		System.out.println(name);
		System.out.println(address);
	}
}
