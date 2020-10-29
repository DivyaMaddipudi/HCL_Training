package lab_assignment_4.q4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;
		try {

			do {
				System.out.println("PE a number or -1 to quit");
				num = sc.nextInt();
				evenOdd(num);
			} while (num != -1);
			
			
		} catch (InputMismatchException e) {
			System.out.println("you must enter an integer");
		}
		
	}

	private static void evenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println("even");
		} else if(num%2!=0){
			System.out.println("odd");
		} else {
			System.exit(0);
		}
	}
}
