package com.bptn.course.week2.abstraction;

interface Operations {

	// from java 8 version we have abstract, default and static methods
	void draw(); // abstract method- no implementation

	default int add(int a, int b) {
		return a + b;
	}

	static double getRandomNumber() {

		return Math.random();
	}
}

class Calculator implements Operations{

	@Override
	public void draw() {
		System.out.println("Calculator");
		
	}
	
	//no need to implement default methods because it is already implement - but it can override if it wishes to
	//static methods cannot be overridden
	
}

public class Abstraction3 {

	public static void main(String[] args) {
		
		Calculator calculator =new Calculator();
		
		calculator.draw();
		
		int result = calculator.add(2, 3);
		System.out.println("Result: "+result);
		
		//call the static method using the interface name
		System.out.println("Random Number: "+Operations.getRandomNumber());
		
		

	}

}
