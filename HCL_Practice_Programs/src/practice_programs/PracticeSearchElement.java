/*
 * 
 * Binary search and Linear search
 */
package practice_programs;

public class PracticeSearchElement {

	public static void main(String[] args) {

		int arr[] = { 20, 30, 40, 50, 60, 70, 80 };

		// linearSearch(arr, ele);
		int low = 0;
		int high = arr.length;
		binarySearch(arr, low, high);
	}

	private static void binarySearch(int[] arr, int low, int high) {
		int ele = 80;
		int mid = (low + high) / 2;

		if (arr[mid] == ele) {
			System.out.println("Element found at index " + mid);
		} else if (arr[mid] >= ele) {
			binarySearch(arr, low, mid);
		} else {
			binarySearch(arr, mid, high);
		}

	}

	private static void linearSearch(int[] arr, int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				System.out.println("Element found at index " + i);
			}
		}
	}

}
