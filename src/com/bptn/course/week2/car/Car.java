package com.bptn.course.week2.car;

public class Car {

	// instance variables
	String color;
	String brand;
	int price;

	//parameterized constructor which accepts 3 parameter variables-color,brand, price
	public Car(String color, String brand, int price) {
		this.color = color;
		this.brand = brand;
		this.price = price;
	}

    public void printCarDetails() {
    	//calls the print method within the same Car class
    	this.print();
        
    }
    
    //print the color, brand and price
    public void print() {
    	  System.out.println("Car{" +
                  "color='" + color + '\'' +
                  ", brand='" + brand + '\'' +
                  ", price=" + price +
                  '}');
    }

}
