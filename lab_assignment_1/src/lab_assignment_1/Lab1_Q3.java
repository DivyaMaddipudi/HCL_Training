/*
 * Q3. Write a program called GradesAverage, which prompts user for the number of students, reads itfrom the keyboard, and saves it in an int variable called numStudents.
 * It then prompts user for the grades of each of the students and saves them in an int array called grades.  
 * Your program shall check that the grade is between 0 and 100.
 *  A sample session is as follow:
 *  Enter the number of students: 3
 *  Enter the grade for student 1: 55
 *  Enter the grade for student 2: 108
 *  Invalid grade, try again...Enter the grade for student 2: 56
 *  Enter the grade for student 3: 57
 *  The average is: 56.0
 * 
 */

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
		System.out.println("Average grade is:"+ sum/students.length);
		sc.close();
	}

}
