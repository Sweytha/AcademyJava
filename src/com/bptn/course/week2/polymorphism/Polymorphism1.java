package com.bptn.course.week2.polymorphism;

//parent class
class Animal {

	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

//Dog class which extends Animal parent class
class Dog extends Animal {

	//over ridden method of the child class
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}

}
//Cat class which extends Animal parent class
class Cat extends Animal{
	
	@Override
	void makeSound() {
		System.out.println("Cat meows");
	}
	
}
public class Polymorphism1 {

	public static void main(String[] args) {

		// create an object from the Dog class

		Dog d1 = new Dog();
		d1.makeSound();
		
		Cat c1= new Cat();
		c1.makeSound();

	}

}
