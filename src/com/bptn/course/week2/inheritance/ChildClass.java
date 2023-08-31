package com.bptn.course.week2.inheritance;

public class ChildClass extends ParentClass{
	
	//instance variable
	int age;
	
	//create the constructor for the child class
	ChildClass(String name, int age){
		
		super(name); //invoke the parent class constructor
		this.age=age;
	}
	
	@Override
	void greet() {
		super.greet();//calls the greet from the parent class
		System.out.println(this.age);// this is it's own greet() implementation
	}

	public static void main(String[] args) {
		
		//create an object for ChildClass 
		
	  ChildClass child= new ChildClass("John",25);// this.name="John" , this.age= 25
	  child.greet();

	}

}
