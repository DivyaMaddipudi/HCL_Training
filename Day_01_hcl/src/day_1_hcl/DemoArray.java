package day_1_hcl;

import java.util.Scanner;

public class DemoArray {
	
	public static void main(String[] args) {
		
		//int x[] = new int[5];
		
		int x[] = {4, 6, 7, 3, 5};
		int sum = 0;
		for(int i=0;i<x.length;i++) {
//			Scanner sc = new Scanner(System.in);
//			x[i] = sc.nextInt();
			sum += x[i];
		}
		System.out.println(sum);
		
		//enhance for loop: java 5: that can be used for array and collection*
		int sumValue = 0;
		for(int temp: x) {
			sumValue += temp;
		}
		System.out.println(sumValue);
		
	}

}
