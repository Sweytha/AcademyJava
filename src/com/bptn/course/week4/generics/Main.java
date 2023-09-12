package com.bptn.course.week4.generics;

import java.util.ArrayList;

public class Main<T extends Number> {
	
	
	//instance variables
	private ArrayList<T> list= new ArrayList<>();
	
	//create a add method
	public void add(T num) {
		list.add(num);
	}
	
	//access the element from the list
	public T get(Integer index) {
		return list.get(index);
	}

	//sum up all the elements in the list
	public double sum() {
		double sum=0;
		for(T element: list) {
			sum= sum + element.doubleValue();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		//Create a list of type integer and add integer values to it
		
		Main<Integer> intList= new Main<>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		
		
		System.out.println("Access the first element of Integer list " + intList.get(0));
		
		System.out.println("Sum of all elements from Integer list "+ intList.sum());
		
		Main<Double> doubleList= new Main<>();
		doubleList.add(20.23);
		doubleList.add(20.22);
		doubleList.add(20.24);
		
		System.out.println("Access the first element of Double list " + doubleList.get(0));
		
		System.out.println("Sum of all elements from Integer list "+ doubleList.sum());
		
		//it does not allow us to create a String list because of bounded generics T extends Number 
		
/*		Main<String> stringList= new Main<>();
		stringList.add("apple");
		stringList.add("banana");
		stringList.add("mango");*/ 
		
		

	}

}
