package com.bptn.course.week4.streamAPI;

import java.util.Arrays;
import java.util.List;

public class ElementCountExercise {

	public static void main(String[] args) {
		
		
		//create a list of strings
		List<String> words=Arrays.asList("apple","banana","cherry","date","elderberry");
		
		//Count on the number of elements in the list
		//stream() method is used convert it to stream of strings
		//count() terminal operation on the stream of strings 
		long count=words.stream().count();
		
		//Print the count 
		System.out.println("Count numbers of words in the list "+count);
		
		//for-each to print the list using lambda expression
		words.forEach(word->System.out.println(word));
		
		//traditional method
		for(String word:words) {
			System.out.println(word);
		}

	}

}
