package com.bptn.course.week2.polymorphism;

class Shape {

	void draw() {
		System.out.println("Drawing a shape");
	}


}

class Circle extends Shape {

	// over ridden method from Shape class
	@Override
	void draw() {
		System.out.println("Drawing a circle");
	}

}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing a rectangle");
	}

}

public class Polymorphism2 {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		c1.draw();

		Rectangle r1 = new Rectangle();
		r1.draw();

	}

}
