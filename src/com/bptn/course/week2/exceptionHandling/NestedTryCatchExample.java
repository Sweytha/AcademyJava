package com.bptn.course.week2.exceptionHandling;

public class NestedTryCatchExample {

	public static void main(String[] args) {

		// outer try block
		try {

			int[] num = { 1, 2, 3 };
			int divisor = 0;

			// first inner try block
			try {
				int result = num[1] / 0; // dividing a number by zero
			} catch (ArithmeticException e) {

				System.out.println("Arithmetic exception has occurred" + e.getMessage());
			}

			String text = null;

			// second inner try block
			try {
				System.out.println(text.length());
			} catch (NullPointerException e) {
				System.out.println("Null pointer exception has occurred" + e.getMessage());
			}
			// third inner try block
			try {
				System.out.println(num[7]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index out of bounds exception has occurred" + e.getMessage());
			}

		} catch (Exception e) {
			System.out.println("general exception has occurred " + e.getMessage());
		}

		System.out.println("Statements after the outer try-catch block");
	}

}
