package com.day2.stack;

public class BookStackTester {
	
	public static void main(String[] args) {
		BookStack bs = new BookStack();
		bs.push(new Book(1, "java"));
		bs.push(new Book(2, "python"));
		bs.push(new Book(3, "ikigai"));
		bs.push(new Book(4, "RDPD"));
		bs.push(new Book(5, "Spring"));
		
		bs.printBooks();
		
//		Book b1 = bs.pop();
//		Book b2 = bs.pop();
//		Book b3 = bs.pop();
//		Book b4 = bs.peek();
//		
//		b1.printBook();
//		b2.printBook();
//		b3.printBook();
//		
//		b4.printBook();
		
	}

}
