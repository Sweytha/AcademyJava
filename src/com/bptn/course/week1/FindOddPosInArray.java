package com.bptn.course.week1;

public class FindOddPosInArray {

	public static void main(String[] args) {

		int[] inputArray = { 10, 20, 30, 40, 50 };

		// print the elements at odd index positions
		for (int i = 1; i < inputArray.length; i += 2) {
			System.out.println("The elements at odd index position are: " + inputArray[i]);
		}
	}

}
