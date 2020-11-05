package books.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import books.controller.ConnectionFactory;
import books.model.Book;

public class BookDaoImpl implements BookDao {

	List<Book> booksList = null;
	Connection conn = null;
	Book book = null;

	public BookDaoImpl() {
		conn = ConnectionFactory.getConnection();
		booksList = new ArrayList<>();
		
	}

	@Override
	public List<Book> getAllBooks() throws DaoException {

		try {
			PreparedStatement pstmt = conn.prepareStatement("select * from book");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				book = new Book();
				book.setId(rs.getInt("id"));
				book.setIsbn(rs.getString("isbn"));
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getDouble("price"));

				booksList.add(book);
			}
		} catch (SQLException ex) {
			throw new DaoException("can't enter values into the list", ex);
		}
		return booksList;
	}

	@Override
	public Book addBook(Book book) throws DaoException {

		try {
			PreparedStatement pstmt = conn.prepareStatement(
					"insert into book (isbn, title, author, price) values (?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);

			pstmt.setString(1, book.getIsbn());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getAuthor());
			pstmt.setDouble(4, book.getPrice());

			int numOfRowsEffected = pstmt.executeUpdate();
			System.out.println(numOfRowsEffected + " book updated successfully..!");

//			ResultSet rs = pstmt.getGeneratedKeys();
//			if(rs.next()) {
//				rs.getInt(1);
//			}
		} catch (SQLException ex) {
			throw new DaoException("Duplicate entry of the record", ex);
		}

		return book;
	}

	@Override
	public void deleteBook(int id) throws DaoException {
		try {
			PreparedStatement pstmt = conn.prepareStatement("delete from book where id = ?");
			pstmt.setInt(1, id);

			int numOfRowsEffected = pstmt.executeUpdate();
			System.out.println(numOfRowsEffected + " book deleted successfully..!");

		} catch (SQLException ex) {

			throw new DaoException("error while deleting the record", ex);
		}
	}

	@Override
	public void updateBook(int id, Book book) throws DaoException {
		try {
			PreparedStatement pstmt = conn.prepareStatement("update book set isbn = ?, title = ?, author = ?, price = ? where id = ?");
			pstmt.setString(1, book.getIsbn());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getAuthor());
			pstmt.setDouble(4, book.getPrice());
			pstmt.setInt(5, id);
			

			int numOfRowsEffected = pstmt.executeUpdate();
			System.out.println(numOfRowsEffected + " book details updated successfully..!");
			
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DaoException("error while updating the records", ex);
		}

	}

	@Override
	public Book getBookById(int id) throws DaoException {
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement("select * from book where id = ?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				book = new Book();
				book.setIsbn(rs.getString("isbn"));
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getDouble("price"));
			}
			
		} catch (SQLException ex) {
			throw new DaoException("error while fetching the book by id", ex);
			
		}
		
		return book;
	}

}
