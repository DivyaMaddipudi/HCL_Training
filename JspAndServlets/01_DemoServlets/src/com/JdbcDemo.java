package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JdbcDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	//from servlet config: u can get init param
	//
	String driver = null;
	String url = null;
	
	String email = null;
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		driver = config.getInitParameter("driverName");
		url = config.getInitParameter("url");
		email = config.getServletContext().getInitParameter("email");
		super.init(config);
		
	}




	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<br>");
		
		try {
			Connection conn = ConnectionFactory.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			
			out.print(email + "<br>");
			while(rs.next()) {
				out.print(rs.getString("id") +" " +rs.getString("name") +" "+ rs.getString("salary") + "<br>");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
