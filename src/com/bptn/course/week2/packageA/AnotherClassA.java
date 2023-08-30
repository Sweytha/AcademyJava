package com.bptn.course.week2.packageA;

public class AnotherClassA {
	
	
	public static void main(String[] args) {

		// creating an object from a class
		ClassA myObj1 = new ClassA();
		
		
		//myObj1.privateVar; // No, cannot access private variable from a different class
		
		//myObj1.privateMethod(); // No, cannot access private method from a different class
		
		System.out.println(myObj1.defaultVar); // yes, you can access default variable from a different class in same package
		myObj1.defaultMethod(); // yes, you can access default method from a different class in same package
		
		System.out.println(myObj1.protectedVar); // yes, you can access protected variable from a different class in same package
		
		myObj1.protectedMethod();// yes, you can access protected method from a different class in same package
		
	

	}
	
	

}
