package com.bptn.course.week4.methodReference;

import java.util.Arrays;
import java.util.List;

public class PrintStrings {
	
	 public static void main(String[] args) {
	        //Declare and initialize a list of strings using an ArrayList and the Arrays.asList method
	    	List<String> strings = Arrays.asList("foo", "bar", "baz", "qux", "quux");
	    	
	    	// print the list of strings using a lambda expression
	    	strings.forEach((element)-> System.out.println(element));
	        
	        // print the list of strings using a method reference	
	    	strings.forEach(System.out :: println);
	        
	         

	       
	    }

}
