package com.bptn.course.week2.staticConcepts;

public class ClassName {
	
	//instance variable
	int instanceVariable;
	
	//declare a static variable
	static int staticVariable=100;
	
	//declare an instance method
	void instanceMethod() {
		
		//code goes here
	}
	
	//declared a static method
	static void staticMethod() {
		
		System.out.println("Static method is called");
	
	}
	

	public static void main(String[] args) {
		
		//create an object of ClassName
		
		ClassName obj= new ClassName();
		
		//Static variable is called directly by using the class name
		System.out.println(ClassName.staticVariable);
		
		//Static method is called directly by using the class name
		ClassName.staticMethod();
		

	}

}
