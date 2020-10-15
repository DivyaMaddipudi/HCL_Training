/*
 * 
 * Sorting an array:
 * 
 * input: 5 4 8 9 6
 * 
 * output: 4 5 6 8 9 
 * 
 */
package practice_programs;

public class PracticeSortAnArray {
	
	public static void main(String[] args) {
		
		int arr[] = {5, 4, 8, 9, 6};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		
	}

}
