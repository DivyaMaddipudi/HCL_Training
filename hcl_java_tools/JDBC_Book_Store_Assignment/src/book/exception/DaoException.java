package book.exception;

public class DaoException extends Exception {
	
	public DaoException(String message) {
		super(message);
	}
	
	public DaoException(String message, Throwable throwable) {
		super(message, throwable.getCause());
	}
}
