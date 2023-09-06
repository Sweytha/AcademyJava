package com.bptn.course.week3.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		
		Set<String> hashSet= new HashSet<>();
		
		
		hashSet.add("apple");
		hashSet.add("banana");
		hashSet.add("cherry");
		hashSet.add("mango");
		
		//allow max one null value
		hashSet.add(null);
		
		
		//order of the elements is not guaranteed
		System.out.println(hashSet);
		
		
		

	}

}
