package day_1_hcl;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and cols");
		int rows = sc.nextInt();
		int col = sc.nextInt();

		int arr[][] = new int[rows][col];
		int arr2[][] = new int[rows][col];

		int[][] newArr = new int[rows][col];
		
		
		System.out.println("Enter arr1");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();

			}
		}

		System.out.println("Enter arr2");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				arr2[i][j] = sc.nextInt();

			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				newArr[i][j] = arr[i][j] + arr2[i][j];

			}
		}
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(newArr[i][j] +" ");

			}
			System.out.println();
		}
	}
}
