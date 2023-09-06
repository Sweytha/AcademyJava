package com.bptn.course.week3.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedhashSet {

	public static void main(String[] args) {
		
		
		Set<String> linkedHashSet= new LinkedHashSet<>();
		
		linkedHashSet.add("banana");
		linkedHashSet.add("apple");
		linkedHashSet.add("mango");
		linkedHashSet.add("cherry");
		
		//allows max one null value
		linkedHashSet.add(null);
		
		//order of the elements are insertion order
		System.out.println(linkedHashSet);

	}

}
