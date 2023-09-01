package com.bptn.course.week2.solidDesignPrinciples.lsp;

/*class Shape {
    public double getArea() {
        return 0.0; // Default area for a generic shape
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Square Area: " + square.getArea());
    }
}*/
/*
The Shape class defines a default getArea method that returns 0.0, which is suitable for a generic shape.
The Circle and Square classes extend Shape and provide their specific implementations of the getArea method.
We can use instances of Circle and Square interchangeably with instances of the base class Shape, and the program behaves as expected.
*/