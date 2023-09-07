package com.bptn.course.week3.coding37;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		// declared hashmap
		HashMap<Integer, String> numbers = new HashMap<>();

		numbers.put(1, "one");
		numbers.put(2, "two");
		numbers.put(3, "three");
		numbers.put(4, "four");
		numbers.put(5, "five");
		numbers.put(6, "six");
		numbers.put(7, "seven");
		numbers.put(8, "eight");
		numbers.put(9, "nine");
		numbers.put(10, "ten");

		// entrySet() method - return a Set of Map.Entry objects - a key-value pair
		// keySet() method- return a set of keys
		for (Map.Entry<Integer, String> num : numbers.entrySet()) {

			// print the key and the value from the num object
			System.out.println(num.getKey() + " : " + num.getValue());

		}

		// remove method to remove value using the key
		numbers.remove(7);

		// add key-value pair using put() method
		numbers.put(11, "eleven");

		// print the map

		for (Map.Entry<Integer, String> num : numbers.entrySet()) {

			// print the key and the value from the num object
			System.out.println(num.getKey() + " : " + num.getValue());

		}

	}

}
