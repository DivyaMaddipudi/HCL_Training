package com.customerapp.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.customerapp.user.model.User;


public class SecFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		
		HttpServletResponse res = (HttpServletResponse) response;
		
		HttpSession session = req.getSession(false);

		
		boolean isValid = false; //let assume he is not valid user!
		if(session != null) {
			User user = (User) session.getAttribute("user");
			System.out.println(user);
			if(user!=null) {
				isValid = true;
			}
		} else if (session == null || session.getAttribute("username") == null) {
	    	res.sendRedirect("welcome.html"); // No logged-in user found, so redirect to login page.
	    }
		
		if(isValid) {
			chain.doFilter(request, response);
		} else {
			res.sendRedirect("login.jsp?message=please login");
		}
		
	}
	

	public void destroy() {
		// TODO Auto-generated method stub
	}



}
