package com.bptn.course.week4.lambda;

import java.util.ArrayList;

public class AddToArrayListLambda {

	public static void main(String[] args) {
		
		//declare an arrayList
		ArrayList<String> colors= new ArrayList<>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		
		//traditional method
		for(String element :colors) {
			System.out.println(element);
		}
		
		//lambda expression
		//forEach() method has a parameter which specifies the action to be performed
		colors.forEach((element)->System.out.println("Colors: "+element));
		
	}

}
