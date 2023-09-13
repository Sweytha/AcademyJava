package com.bptn.course.week4.lambda;

@FunctionalInterface
interface Calculator {

	// this is an abstract method- because it does not have any implementation
	int calculate(int a, int b);
	
	//add a default method to display the result
	default void displayResult(int result) {
		System.out.println("Result "+result);
	}

}

public class CalculatorExample {

	public static void main(String[] args) {

		// using lambda expression to implement the calculate method of the Calculator
		// functional interface in different ways
		Calculator addition = (a, b) -> a + b;

		Calculator substraction = (a, b) -> a - b;

		Calculator multiplication = (a, b) -> a * b;

		//when you have block of statements, you enclose it in a curly brace and end with a semicolon
		Calculator division = (a, b) -> {

			if (b == 0) {
				throw new ArithmeticException("Division by zero");
			}
			return a / b;

		};
		
		//calculate and display the result
		int result1= addition.calculate(2, 4);
		
		int result2= substraction.calculate(10, 5);
		
		int result3= multiplication.calculate(10, 5);
		
		int result4= division.calculate(10, 5);
		
		System.out.println("Addition result "+result1);
		System.out.println("Substraction result "+result2);
		System.out.println("Multiplication result "+result3);
		System.out.println("Division result "+result4);
		
		//using the default method from the functional interface
		addition.displayResult(result1);
		substraction.displayResult(result2);
		multiplication.displayResult(result3);
		division.displayResult(result4);
		

	}

}
