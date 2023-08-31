package com.bptn.course.week2.packageB;

import com.bptn.course.week2.packageA.ClassA;

class ClassB extends ClassA {

	public static void main(String[] args) {

		ClassB myObj2 = new ClassB();

		System.out.println(myObj2.protectedVar); // can access protected variable by using a subclass from different package

		myObj2.protectedMethod(); // can access protected method by using a subclass from different package

	}

}

//cannot access protected variables without creating a subclass-when calling from a different package
