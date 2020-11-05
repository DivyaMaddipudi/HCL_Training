package books.dao;

public class DaoException extends Exception {
	
	public DaoException(String message, Throwable throwable) {
		super(message, throwable.getCause());
	}
}
