package com.bptn.course.week2.inheritance;

public class ParentClass {

	// Declare the instance variable
	String name;

	// create the constructor
	ParentClass(String name) {
		this.name = name;
	}
	
	//declare a method
	void greet() {
		System.out.println("Hello my name is "+this.name);
	}

	

}
