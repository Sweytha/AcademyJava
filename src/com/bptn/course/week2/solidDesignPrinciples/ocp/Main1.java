package com.bptn.course.week2.solidDesignPrinciples.ocp;

class Shape {
    private String type;

    Shape(String type) {
        this.type = type;
    }

    String getType() {
        return type;
    }

    double area() {
        if (type.equals("Circle")) {
            double radius = 5.0;
            return Math.PI * radius * radius;
        } else if (type.equals("Square")) {
            double side = 4.0;
            return side * side;
        }
        return 0.0;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Shape circle = new Shape("Circle");
        Shape square = new Shape("Square");

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Square Area: " + square.area());
    }
}

/*
 * The Shape class is a single class responsible for multiple shapes.
The area method contains conditionals based on the shape type, 
which violates the OCP because adding new shapes would require modifying the existing Shape class.
In this example, to add a new shape type, 
you would need to modify the Shape class and add a new conditional, which goes against the Open-Closed Principle.
*/
