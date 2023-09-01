package com.bptn.course.week2.solidDesignPrinciples.ocp;

/*abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Square Area: " + square.area());
    }
}*/

/*
 * We have an abstract Shape class with an area method that is overridden by concrete subclasses (Circle and Square).
The Main class can create different shapes and calculate their areas without modifying the existing code. New shape types can be added by creating new subclasses of Shape without changing the existing code.
This adheres to the OCP because we can extend the system's behavior (by adding new shapes) without modifying the existing code.
*/
