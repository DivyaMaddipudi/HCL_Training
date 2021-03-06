package day_1_hcl;

import java.util.Scanner;

public class DemoPrime {

	public static boolean primeChecker(int number) {
		if (number <= 1) {
			return false;
		}
		boolean isPrime = true; // let assume num is a prime num
		for (int j = 2; j <= number / 2; j++) {
			if (number % j == 0) {
				isPrime = false;

				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {

		// modularity: functions

		// Check for prime number
		// 1. take the value from the user

		System.out.println("Plz enter the range:");
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		int end = scanner.nextInt();

		primeCount(start, end);
	}

	private static int primeCount(int start, int end) {

		int counter = 0;
		for (int i = start; i <= end; i++) {

			if (primeChecker(i)) {
				counter = counter + 1;
				System.out.println(i);
			}
		}
		return counter;
	}

}
