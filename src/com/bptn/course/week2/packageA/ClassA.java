package com.bptn.course.week2.packageA;

public class ClassA {

	// declare a private variable
	private int privateVar;

	// declare a default variable
	int defaultVar;
	
	//declare a protected variable
	protected int protectedVar;
	
	public int publicVar;

	// declare a private method
	private void privateMethod() {
		// code goes here

	}

	// declare a default method
	void defaultMethod() {
		// code goes here
	}

	
	//declare a protected method
	protected void protectedMethod() {
		// code goes here
		
	}
	public static void main(String[] args) {

		// creating an object from a class
		ClassA myObj = new ClassA();

		myObj.privateMethod();// yes, you can access private method within the same class

		System.out.println(myObj.privateVar);// yes, you can access private variable within the class
		
		System.out.println(myObj.defaultVar); // yes, you can access default variable within the class
		
		myObj.defaultMethod();  // yes, you can access default method within the class
		
		System.out.println(myObj.protectedVar);// yes, you can access protected variable within the class
		
		myObj.protectedMethod();// yes, you can access protected method within the class

	}

}
