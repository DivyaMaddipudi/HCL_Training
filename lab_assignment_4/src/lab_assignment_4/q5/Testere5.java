package lab_assignment_4.q5;

import java.util.Scanner;

public class Testere5 {
	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)) {
			System.out.println("PE number");
			int num = sc.nextInt();
			try {
				if(num > 100) {
					throw new Exception();
				}
			}catch (Exception e) {
				System.out.println("Number can't be greater than 100");
			}
		}
	}
}
