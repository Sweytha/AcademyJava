package com.bptn.course.week2.abstraction;

//cannot be used to create objects
abstract class Shape {

	// non-abstract methods
	void moveTo(int x, int y) {

		System.out.println("Move to " + x + y);
	}

	// abstract methods- not implemented
	abstract void draw();
	
	abstract void print();
}

class Circle extends Shape {

	// child class Circle should implement all the un-implemented methods of
	// abstract class(draw())
	@Override
	void draw() {
		System.out.println("Draw a circle");

	}

	@Override
	void print() {
		System.out.println("Print a circle");
		
	}

}

class Rectangle extends Shape {

	// child class rectangle should implement all the un-implemented methods os
	// abstract class(draw())
	@Override
	void draw() {
		System.out.println("Draw a rectangle");

	}

	@Override
	void print() {
		System.out.println("Print a rectangle");
		
	}

}

public class Abstraction1 {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		c1.draw();

		c1.moveTo(2, 3);
		
		c1.print();

		Rectangle r1 = new Rectangle();
		r1.draw();

		r1.moveTo(4, 5);
		
		r1.print();

	}

}
