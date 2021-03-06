/*
 * 
 * Q1. Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where 
 * F(n)=F(n�1)+F(n�2) and F(1)=F(2)=1. Also compute their average. The output shall look like:
 */

package lab_assignment_1;

public class Lab1_Q1 {
	
	public static void main(String[] args) {
		
		int prePrevious = -1;
		int previous = 1;
		
		int counter = 1;
		int sum = 0;
		while(counter <= 20) {
			int term = prePrevious + previous;
			
			prePrevious = previous;
			previous = term;
			sum = sum +term;
			System.out.println(term);
			counter++;
		}
		System.out.println(sum);
		System.out.println(sum/20);
	}

}
