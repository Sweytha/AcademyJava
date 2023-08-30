package com.bptn.course.week2.wrapperClass;

public class Main {

	public static void main(String[] args) {
		
		//convert an int into Integer (Auto-boxing)- convert a primitive type to wrapper class object
		Integer intObject= Integer.valueOf(100);
		
		//Alternatively to convert int to Integer- we can do as below
		Integer intObject1=100; //commonly used
		
		//Unboxing- convert Integer to int - convert wrapper class object to primitive type
		int intPrimitive =intObject; //commonly used
		
		//Alternatively to convert Integer to int - convert wrapper class object to primitive type
		int intPrimitive1=intObject1.intValue();
		
		//to convert a string value to int , you can use parseInt() method from the Integer class
		int num= Integer.parseInt("100");
		

	}

}
