/*
 * 
 * Pascal Triangle in java
 * 
 *   1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 

 * 
 * 
 */

package practice_programs;

public class PracticePascalTriangle {

	public static void main(String[] args) {

		int rows = 5;
		printPascal(rows);
	}

	private static void printPascal(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			int num = 1;
			for (int k = 0; k <= i; k++) {
				System.out.print(num + " ");
				num = num * (i - k) / (k + 1);
			}
			System.out.println();
		}
	}

}
