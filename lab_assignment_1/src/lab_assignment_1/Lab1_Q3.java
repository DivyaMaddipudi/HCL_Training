package lab_assignment_1;

import java.util.Scanner;

public class Lab1_Q3 {
	public static void main(String[] args) {
		
		System.out.println("Enter number of students:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int students[] = new int[num];
		for(int i=0;i<num;i++) {
			System.out.println("Enter the grade for student " + (i+1));
			students[i] = sc.nextInt();
			if(students[i]>0 && students[i] <= 100) {
				continue;
			} else {
				System.out.println("Invalid grade");
				i--;
			}
			
		}
		
		int sum = 0;
		for(int i=0;i<students.length;i++) {
			sum = sum + students[i];
		}
		System.out.println(sum/students.length);
		sc.close();
	}

}