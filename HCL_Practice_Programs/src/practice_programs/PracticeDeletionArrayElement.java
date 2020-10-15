/*
 * 
 * Deleting element from an array
 * 
 */
package practice_programs;

import java.util.Scanner;

public class PracticeDeletionArrayElement {

	public static void main(String[] args) {

		int arr[] = { 20, 30, 40, 50, 60, 70, 80 };

		int newArr[] = new int[arr.length - 1];
		Scanner sc = new Scanner(System.in);
		int numToDel = sc.nextInt();

		int index = searchIndex(arr, numToDel);
		System.out.println(index);
		
		for(int i=0;i<newArr.length;i++) {
			
			if(i<index) {
				newArr[i] = arr[i];
			} else if(i>=index) {
				newArr[i] = arr[i+1];
			}
			
		}
		

		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}

	public static int searchIndex(int arr[], int numToDel) {
		
		int index = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] == numToDel) {
				index = i;
			}
		}
		return index;
	}

}
