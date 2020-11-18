package com.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/S1")
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dog dog = new Dog();
		dog.setDogName("puppy");
		
		Person person = new Person();
		person.setName("ramu");
		person.setDog(dog);
		
		request.setAttribute("person", person);
		
		String[] cities = {"andhra", "banglore", "delhi", "chennai"};
		request.setAttribute("cities", cities);
		
		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
	}

}
