package com.bptn.course.week2.polymorphism;

public class Printer {
	
	void print(int integer) {
		System.out.println("Printing an integer "+ integer);
	}
	
	void print(String s) {
		
		System.out.println("Printing a string: "+s);
	}
	
	void print(double number) {
		
		System.out.println("Printing a double: "+number);
	}
	

	public static void main(String[] args) {
		
		Printer p1= new Printer();
		
		p1.print(2);// it calls the first print method- parameter is an integer
		
		p1.print("John"); //it called the second print method- parameter is a string
		
		p1.print(2.5); //it called the third print method =parameter is a double

	}

}
