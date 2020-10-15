/*
 * 
 * Insert element into an array at specified position
 * 
 */
package practice_programs;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeInsertEleIntoArray {
	
	public static void main(String[] args) {
		int arr[] = { 20, 30, 40, 50, 60, 70, 80};
		
		int[] newArr = Arrays.copyOf(arr, arr.length + 1);
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		int ele = sc.nextInt();
		int temp =0;
		
		for(int i=0;i<newArr.length;i++) {
			
			if(i < index) {
				newArr[i] = arr[i];
			}else if(i == index) {
				newArr[i] = ele;
			} else {
				newArr[i] = arr[i-1];
			}
		}
		
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i] +" ");
		}
	}

}
