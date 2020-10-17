package lab_assignment_2.q3;

public class Book {
	
	private String bookTitle;
	private String bookAuthor;
	private String ISBN;
	private int numOfCopies;
	
	public Book() {}

	public Book(String bookTitle, String bookAuthor, String ISBN, int numOfCopies) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.ISBN = ISBN;
		this.numOfCopies = numOfCopies;
	}
		
	public String getBookTitle() {
		return bookTitle;
	}


	public String getBookAuthor() {
		return bookAuthor;
	}

	public String getISBN() {
		return ISBN;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	public void addBooks(int numOfCopies) {
		this.numOfCopies = this.numOfCopies + numOfCopies;
	}
	
	public void display() {
		System.out.format("%s %15s %15s %15s", bookTitle,bookAuthor, ISBN, numOfCopies);
		System.out.println();
	}

}
