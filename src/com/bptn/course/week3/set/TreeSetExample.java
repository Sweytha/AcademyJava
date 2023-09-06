package com.bptn.course.week3.set;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {

	public static void main(String[] args) {

		Set<String> treeSet= new TreeSet<>();

		treeSet.add("banana");
		treeSet.add("apple");
		treeSet.add("mango");
		treeSet.add("cherry");
		
		
		//does not allow to have even a single null value
		//treeSet.add(null); //this line will throw an exception

		//Elements are arranged in natural order(ascending order)
		System.out.println(treeSet);

	}

}
