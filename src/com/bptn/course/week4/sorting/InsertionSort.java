package com.bptn.course.week4.sorting;

public class InsertionSort {

	private static void insertionSort(int[] arr) {

		// check if the array is null or array has less than 1 element
		if (arr == null || arr.length < 1) {
			return;
		}
		// actual logic of insertion sort
		for (int i = 1; i < arr.length; i++) {

			// store my current element into temp
			int temp = arr[i];
			// initialize the value of j
			int j = i - 1;
			// inner loop compares temp element which all the elements before it
			while (j >= 0 && arr[j] > temp) {
				// shift the element one position to the right
				arr[j + 1] = arr[j];
				// going backwards from j=i-1 to 0
				j--;
			}
			// new position of temp
			// insert the current element which is stored inside temp to one position ahead
			// of j
			arr[j + 1] = temp;

		}

	}

	public static void main(String[] args) {
		// Initialize the array
		int[] arr = { 6, 1, 7, 4, 2, 9, 8, 5, 3 };
		// Call the sort method to sort the array
		insertionSort(arr);
		// Print the sorted array
		System.out.println("Sorted array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
