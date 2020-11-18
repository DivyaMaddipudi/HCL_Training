package com.book.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.book.connection.ConnectionFactory;
import com.book.exception.DataAccessException;

public class BookDaoImpl implements BookDao{

	Connection conn;
	ArrayList<Book> books;
	Book book;
	public BookDaoImpl() {
		conn = ConnectionFactory.getConnection();
		books = new ArrayList<>();
				
	}
	@Override
	public List<Book> getAll() {
		//1	A1213	ML	divya	1970-01-01	2000
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from books");
			while(rs.next()) {
				book = new Book(rs.getInt("id"), rs.getString("isbn"), rs.getString("title"), rs.getString("author"),
						rs.getDate("pubDate"), rs.getDouble("price"));
				
				books.add(book);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DataAccessException(e.getMessage());
		}
		
		return books;
		
	}

	@Override
	public Book add(Book book) {
		PreparedStatement pstmt;
		//1	A1213	ML	divya	1970-01-01	2000
		String add_query = "insert into books(isbn, title, author, pubDate, price) values(?, ?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(add_query);
			pstmt.setString(1, book.getIsbn());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getAuthor());
			pstmt.setDate(4, new Date(book.getPubDate().getTime()));
			pstmt.setDouble(5, book.getPrice());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DataAccessException(e.getMessage());
		}
		return book;
	}

	@Override
	public Book delete(int bookId) {
		
		return null;
	}



	@Override
	public Book getById(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book update(int id, Book book) {
		// TODO Auto-generated method stub
		return null;
	}

}
