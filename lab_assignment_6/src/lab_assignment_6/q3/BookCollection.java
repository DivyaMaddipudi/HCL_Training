package lab_assignment_6.q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookCollection {
	
	private String ownerName;
	List<Book> bookList = new ArrayList<Book>();
	
	public boolean hasBook(Book book) {
		boolean hasBook = false;
		if(bookList.contains(book)) {
			hasBook = true;
		}
		return hasBook;
	}

	public void sortByBookName() {
		Collections.sort(bookList);
		printBooks();
	}
	
	public void sortByAuthor() {
		Collections.sort(bookList, new sortByAuthorName());
		printBooks();
	}
	
	public void printBooks() {
		for(Book book: bookList) {
			System.out.println(book);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookCollection [");
		for(int i=0; i<bookList.size();i++) {
			builder.append(" [author =");
			builder.append(bookList.get(i).getAuthor());
			builder.append(" title =");
			builder.append(bookList.get(i).getBookName());
			builder.append("]");
		}
		builder.append(" ]");
		return builder.toString();
	}
}
