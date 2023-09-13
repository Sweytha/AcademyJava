package com.bptn.course.week4.lambda;

import java.util.ArrayList;

public class RemoveFromArrayListLambda {

	public static void main(String[] args) {
		
		//declare an arraylist and add elements to it
		ArrayList<String> fruits= new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("mango");
		
		//remove the element "banana" from the arraylist
		fruits.removeIf((element)->element.equals("banana"));
		
		//print arraylist using forEach() and lambda expression		
		fruits.forEach((element)-> System.out.println(element));
		
		System.out.println(fruits);
		

	}

}
