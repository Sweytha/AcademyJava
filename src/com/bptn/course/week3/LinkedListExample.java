package com.bptn.course.week3;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		// create an object from the LinkedList class
		LinkedList<String> colors = new LinkedList<>();

		// add item at the beginning of the list
		colors.addFirst("Red");
		
		//add item to the end of the list
		colors.addLast("Green");

		System.out.println("LinkedList elements after adding " + colors);

       //remove item at the beginning of the list
	    colors.removeFirst();
	   
		 //remove item at the end of the list
	   colors.removeLast();
	   
	   System.out.println("LinkedList elements after removing "+ colors);
	   
	   colors.add("Blue");
	   colors.add("Red");
	   colors.add("Green");
	   colors.add("Orange");
	   
	   //getting the first element from the list
	   System.out.println("Access the first element "+ colors.getFirst());
	   
	   //getting the last element from the list
	   System.out.println("Access the last element "+ colors.getLast());
	   
	   //removing element at specified index
	   colors.remove(1);
	   
	   System.out.println("LinkedList elements after removing "+ colors);
	   
	   //adding the element from the specified index
	   colors.add(1,"Purple");
		
	   System.out.println("LinkedList elements after adding "+ colors);
	   
	   //replacing an element at specified index
	   colors.set(1, "Violet");
	   
	   System.out.println("LinkedList elements after replacing element "+ colors);

	}

}
