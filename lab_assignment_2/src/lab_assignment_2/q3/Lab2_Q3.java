package lab_assignment_2.q3;

import java.util.Scanner;

public class Lab2_Q3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		Book books[] = { new Book("ikigai", "Graceir", "1234", 5), new Book("java", "Bruce", "12345", 6), new Book("python", "Eric", "123456", 1) };
		BookStore bookStore = new BookStore(books);

		while (true) {
			System.out.println();
			System.out.println("Here is the menu!!");

			System.out.println("Enter 1 to display books");
			System.out.println("Enter 2 to order new books");
			System.out.println("Enter 3 to sell books");
			System.out.println("Enter 0 to exit the system");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.format("%s %15s %15s %15s", "Title", "Author", "ISBN Number", "Quantity");
				System.out.println();
				bookStore.printBookDetails();
				break;
			case 2:
				System.out.println("Enter ISBN number...");
				String iSBN = sc.next();
				System.out.println("Enter number of copies you want to order...");
				int numOfCopies = sc.nextInt();
				bookStore.orderBooks(iSBN, numOfCopies);
				break;
			case 3:
				System.out.println("Enter title of the book...");
				String title = sc.next();
				System.out.println("Enter number of copies you want to sell...");
				int copies = sc.nextInt();
				bookStore.sellBook(title, copies);
				break;
			default:
				break;
			}
			if(num == 0) {
				System.out.println("Exited!!");
				break;
			} else if(num >3 || num < 0) {
				System.out.println("Wrong choice! Enter value again!!");
			}
		}
	}
}
