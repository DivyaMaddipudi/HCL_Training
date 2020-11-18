package com.customerapp.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.customerapp.exceptions.UserNotFoundException;
import com.customerapp.user.model.User;
import com.customerapp.user.model.UserDao;
import com.customerapp.user.model.UserDaoImpl;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDao userDao = new UserDaoImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			User user = userDao.getUser(username, password);
			//he is a valid user as no ex
			
			HttpSession session= request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("customercontroller.do?action=showall");
		
		} catch (UserNotFoundException e) {
			request.setAttribute("user", "invalid credentials");
			response.sendRedirect("login.jsp?error=loginfailed");
		}
		
	
	}

}
