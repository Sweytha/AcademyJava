package com.bptn.course.week2.polymorphism;

public class MathOperations {

	// multiple methods with the same name but different parameter lists

	int add(int a, int b) {
		return a + b;
	}
	
	int add(int a, int b ,int c) {
		return a + b + c;
	}
	

	public static void main(String[] args) {

		MathOperations m = new MathOperations();

		System.out.println(m.add(5, 10)); //called the first add method because 2 parameters is passed
		System.out.println(m.add(5, 10, 15)); //called the second add method because 3 parameters is passed

	}
	
	public static void main1(String[] args) {

		MathOperations m = new MathOperations();

		System.out.println(m.add(5, 10)); //called the first add method because 2 parameters is passed
		System.out.println(m.add(5, 10, 15)); //called the second add method because 3 parameters is passed

	}

}
