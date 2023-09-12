package com.bptn.course.week4.generics;


public class GenericsExample {

	public static void main(String[] args) {

		// optimize the code using Box<T> class
		Box<Integer> intBox = new Box<>(42);
		System.out.println(intBox.getValue());

		Box<String> stringBox = new Box<>("Hello world");
		System.out.println(stringBox.getValue());

		Box<Double> doubleBox = new Box<>(42.22);
		System.out.println(doubleBox.getValue());
		//don't specify type parameter, it is behaving as raw type generics
		
		Box rawBox = new Box("Hello, World"); // Using a raw type without specifying the type parameter
	
		
		// This can lead to runtime errors
        String content = (String) rawBox.getValue(); // Unchecked cast
       

        System.out.println(content);
		
		

	}

}
//generics class with type T
class Box<T> {

	// instance variables
	private T value;

	// constructor
	public Box(T value) {
		this.value = value;
	}

	// getters to get the value
	public T getValue() {
		return this.value;
	}
}

