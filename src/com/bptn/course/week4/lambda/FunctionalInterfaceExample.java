package com.bptn.course.week4.lambda;

@FunctionalInterface
interface A {

	// abstract method- method without any implementation
	void print(String name);

}

@FunctionalInterface
interface C{
	//abstract method- method without any implementation
	int add(int a, int b);
}

/*
 * class B implements A {
 * 
 * @Override 
 * public void print() 
 * { 
 * System.out.println("Hello");
 * 
 * }
 * 
 * }
 */

public class FunctionalInterfaceExample {

	public static void main(String[] args) {

		// We cannot create objects from an interface
		// We have lambda expression using curly brace and ending with a semicolon
		A obj = (name) -> {
			System.out.println("Hello" +name);
			System.out.println("World");

		};

		obj.print("John");
		
		//without the return keyword, it does not throw and error because it knows you are returning a value
		//Passing the input type for the parameters is optional
		//Passing the same number of parameters as how it's defined in the interface is important
		C obj1= (a,b)-> a+b;
		
		System.out.println(obj1.add(4,5));

	}

}
