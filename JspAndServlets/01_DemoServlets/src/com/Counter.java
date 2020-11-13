package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Counter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	AtomicInteger counter = new AtomicInteger(0);
	
	//1. if we restart the server ---> 0
	//2. Multithreading issues
	//3. as we have one object of servlet per app, for each req, a thread of servlet is going to be created
	// and instance variable/static variable is not thread safe.
	

	@Override
	public void init(ServletConfig config) throws ServletException {
		//read the data from file
		super.init(config);
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("foo.ser"));
			Integer value = (Integer) ois.readObject();
			counter = new AtomicInteger(value);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		counter.addAndGet(1);
		PrintWriter out = response.getWriter();
		out.print("<br>" + counter + "<br>");
	}



	@Override
	public void destroy() {
		//if server is shutting down due to maintance plz put the last file
		super.destroy();
		try {
			ObjectOutput oos = new ObjectOutputStream(new FileOutputStream("foo.ser"));
			oos.writeObject(counter.get());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
