package lab_assignment_4.q6;

import java.util.Scanner;

public class Tester6 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("PE a number");
			int num = sc.nextInt();
			try {
				if(num > 100) {
					throw new InputException("number can't be greater than 100");
				}
			} catch (InputException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
