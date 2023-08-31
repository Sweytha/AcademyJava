package com.bptn.course.week2.codingRooms;

public class Main1 {

	void method() {

		// outer try
		try {

			try {
				int[] arr = { 1, 2, 3, 4 };

				System.out.println(arr[0]);
				System.out.println(arr[5]); //fails here
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException occurred");
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException is handled in the outer catch block");
		}
	}

	public static void main(String[] args) {

		Main1 nestedTryBlockSolutionObject = new Main1();
		nestedTryBlockSolutionObject.method();

	}

}
