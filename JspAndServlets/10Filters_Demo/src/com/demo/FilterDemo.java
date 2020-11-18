package com.demo;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

//chain of responsibility design pattern1 : ex handling
public class FilterDemo implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		System.out.println("i am filter f1 and im watching");
		System.out.println(req.getRequestURL());
		
		chain.doFilter(request, response);
		System.out.println("i am filter f1 and you are going");
	}


	public void init(FilterConfig fConfig) throws ServletException {
	
	}
	
	
	public void destroy() {

	}

}
