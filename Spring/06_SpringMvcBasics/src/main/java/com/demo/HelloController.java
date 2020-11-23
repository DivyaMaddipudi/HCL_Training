package com.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@GetMapping("hello")
	public ModelAndView hello() {
		List<String> books = Arrays.asList("java", "spring", "hibernate");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("show");
		mv.addObject("books", books);
		return mv;
	}

}
