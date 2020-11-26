package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	
	
	
	@GetMapping("hello")
	public String hello(Model mv) {
		mv.addAttribute("key", "hello to spring mvc");
		return "hello";
	}
	
	
//	@GetMapping("hello")
//	public ModelAndView hello(ModelAndView mv) {
//		mv.addObject("key", "hello to spring mvc");
//		mv.setViewName("hello");
//		return mv;
//	}
	
	
	
//	@GetMapping("hello")
//	public String hello(ModelMap map) {
//		map.addAttribute("key", "hello to spring mvc");
//		return "hello";
//	}

}
