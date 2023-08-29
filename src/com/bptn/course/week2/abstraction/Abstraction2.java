package com.bptn.course.week2.abstraction;

interface ShapeInterface {

	// before java 8 version we had only abstract methods and constants
	void draw();

	double getArea();

}

class CircleClass implements ShapeInterface {
	
	private double radius;

	@Override
	public void draw() {
       System.out.println("Draw a circle");
	}

	@Override
	public double getArea() {

		return (Math.PI *radius *radius);
	}

}

class RectangleClass implements ShapeInterface{
	
	private double width;
	private double height;

	@Override
	public void draw() {
		System.out.println("Draw a rectangle");
		
	}

	@Override
	public double getArea() {
		
		return width *height;
	}
	
	
}

public class Abstraction2 {

	public static void main(String[] args) {
		
		//create objects from the CircleClass and RectangleClass and call the methods from the respective class

	}

}
