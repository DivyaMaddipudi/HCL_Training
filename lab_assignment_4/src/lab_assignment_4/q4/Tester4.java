package lab_assignment_4.q4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester4 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

//			System.out.println("PE a number or -1 if you want to quit");
			int num = -1;

			do {
				System.out.println("PE a number or -1 if you want to quit");
				try {
					
					num = sc.nextInt();

					evenOdd(num);

				} catch (InputMismatchException e) {
					e.getMessage();
				}
			} while (num != -1);

		}
	}

	private static void evenOdd(int num) {
		if (num == -1) {
			System.exit(0);
		} else if (num % 2 == 0) {
			System.out.println("even");
		} else if (num % 2 != 0) {
			System.out.println("odd");
		}
	}
}
