package lab_assignment_4.q4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester4 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("PE a number or -1 if you want to quit");

			try {
				while (true) {
					int num = sc.nextInt();
					if (num == -1) {
						System.exit(0);
					} else if (num % 2 == 0) {
						System.out.println("even");
					} else {
						System.out.println("odd");
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("you must enter an integer");
			}
		}
	}
}
