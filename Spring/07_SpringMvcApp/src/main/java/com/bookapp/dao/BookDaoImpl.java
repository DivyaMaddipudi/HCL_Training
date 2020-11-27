package com.bookapp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;



@Primary
@Repository
public class BookDaoImpl implements BookDao{
	
	
	private DataSource dataSource;
	
	@Autowired
	public BookDaoImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	

	public List<Book> getAllBooks() {
		Connection conn;
		List<Book> books = new ArrayList<Book>();
		Book book = null;
		
		try {
			conn = dataSource.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from books");
			
			while(rs.next()) {
				book = new Book(rs.getInt("id"), rs.getString("isbn"), rs.getString("title"),
						rs.getString("author"), rs.getDate("pubDate"), rs.getDouble("price"));
			
				books.add(book);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return books;
	}

	public Book addBook(Book book) {
		
		Connection conn;
		
		String add_book_query =
				"insert into books(isbn, title, author, pubDate, price) values(?, ?, ?, ?, ?)";
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(add_book_query, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, book.getIsbn());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getAuthor());
			pstmt.setDate(4, new Date(book.getPubDate().getTime()));
			pstmt.setDouble(5, book.getPrice());
			
			int numOfRowsEffected = pstmt.executeUpdate();
			
			if(numOfRowsEffected > 0) {
				ResultSet rs = pstmt.getGeneratedKeys();
				rs.next();
				book.setId(rs.getInt(1));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		
		return book;

	}

	public void deleteBook(int id) {
		
         
         try {
             Connection connection = dataSource.getConnection();
             String delete_book_by_id="delete from books where id=?";
             PreparedStatement pstmt= connection.prepareStatement(delete_book_by_id);
             pstmt.setInt(1, id);
             pstmt.executeUpdate();
             
         } catch (SQLException e) {
             e.printStackTrace();
         }
	}

	public void updateBook(int id, Book book) {
		
		Connection connection;
		String add_book_query =
				"update books set price = ? where id = ?";
		
		try {
			connection=dataSource.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(add_book_query);
			
			pstmt.setDouble(1, book.getPrice());
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
			 
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Book getBookById(int id) {
		Connection conn;
		PreparedStatement pstmt;
		Book book = null;
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement("select * from books where id = ?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				book = new Book(rs.getInt("id"), rs.getString("isbn"), rs.getString("title"),
						rs.getString("author"), rs.getDate("pubDate"), rs.getDouble("price"));
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DataAccessException(e.getMessage()) {};
		}
		return book;
	}
}
