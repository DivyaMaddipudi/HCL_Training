package ntu_oops.classes2.composition1;

public class Tester1 {
	
	public static void main(String[] args) {
		Author author = new Author("Bruce", "bruce@gmail.com", 'm');
		System.out.println(author);
		
		Book book = new Book("Java", author, 100.0, 2);
		System.out.println(book);
		
		book.setPrice(200.0);
		book.setQty(5);
		
		System.out.println(book);
		System.out.println(book.getAuthor());
		System.out.println(book.getAuthor().getName());
		System.out.println(book.getAuthor().getEmail());
		System.out.println("Calling from book class directly");
		System.out.println(book.getAuthorName());
		System.out.println(book.getAuthorEmail());
	}
}
