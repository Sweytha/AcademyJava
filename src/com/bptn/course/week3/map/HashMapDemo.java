package com.bptn.course.week3.map;

import java.util.HashMap;

//Last Coding exercise -Maps in Action lesson
public class HashMapDemo {

	public static void main(String[] args) {
		
		//create a hashmap called people
		HashMap<String, Integer> people= new HashMap<>();
		
		//add the key-value pairs
		people.put("John", 32);
		people.put("Steve", 30);
		people.put("Angie", 33);
		
		for(String p: people.keySet()) {
			System.out.println("Name: "+ p + "," + " Age: " + people.get(p));
		}
		

	}

}
