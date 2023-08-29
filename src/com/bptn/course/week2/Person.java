package com.bptn.course.week2;

public class Person {

	// instance variables -name , age , location
	// class level scope
	String name;
	int age;
	String location;

	// default constructor-it does not have any parameters passed
	public Person() {
		// set default values
		this.name = "sweytha";
		this.age = 20;
		this.location = "Canada";

	}

	// parameterized constructor
	public Person(String name, int age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}

	// method to print the values
	public void printInfo() {

		System.out.println("Name: " + this.name + " Age: " + this.age + " location: " + this.location);
	}

	public static void main(String[] args) {

		// create a person p1 object from Person class
		Person p1 = new Person();

		p1.printInfo();
		
		//create a person p2 object from Person class
		Person p2= new Person("John", 23, "Toronto");
		
		p2.printInfo();

	}

}
