package com.bptn.course.week2.exceptionHandling;


public class ArithmeticExceptionExample {

	public static void main(String[] args) {

		try {

			int result = 10 / 0;

		} catch (ArithmeticException e) {
			System.out.println("Error message " + e.getMessage());
		}
		
		System.out.println("Execute statements after try-catch");

	}

}
