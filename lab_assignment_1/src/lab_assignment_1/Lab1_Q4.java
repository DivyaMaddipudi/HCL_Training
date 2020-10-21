/*
 * Q4. Write a method called copyOf(), which an int Array and returns a copy of the given array. 
 * The method's signature is as follows:
 * 
 */
package lab_assignment_1;

import java.util.Arrays;

public class Lab1_Q4 {
	
	public static void main(String[] args) {
		
		int orgArr[] = {100, 101, 102, 103};
		
		int arr[] = copyOf(orgArr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] copyOf(int[] array) {
		int copyArr[] = Arrays.copyOf(array, array.length);
		return copyArr;
	}

}
