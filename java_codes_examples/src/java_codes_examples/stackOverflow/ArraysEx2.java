package java_codes_examples.stackOverflow;

public class ArraysEx2 {

	public static void main(String[] args) {
		int[][] array = { { 1, 1, 2, 3, 3 }, { 2, 1, 1, 2, 3 }, { 3, 3, 3, 3, 3 }, { 3, 3, 3, 3, 3 } };

		String[][] array2 = new String[array.length][array.length + 1];

		int totalSum = 0;

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				System.out.print(array[i][j] + " ");
				
				for (int i1 = 0; i1 < array.length; i1++) {
					totalSum = 0;
					for (int j1 = 0; j1 < array[i1].length; j1++) {
						totalSum = totalSum + array[i1][j1];
					}
					
					if (array[i][j] == 3) {
						if(totalSum >= 15) {
							array2[i][j] = "F";
						} else if(totalSum<15){
							array2[i][j] = "T";
						}

					} else if (array[i][j] != 3) {

						array2[i][j] = "T";

					}
					System.out.println("sum:" + totalSum);
				}
			}
			System.out.println();
		}
		
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {

				System.out.print(array2[i][j] + " ");

			}
			System.out.println();
		}
	}
}
