package com.bptn.course.week4.streamAPI;

import java.util.Arrays;
import java.util.List;


public class StringFilterExercise {

	public static void main(String[] args) {
		// create a list of strings
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

		// filter strings that contain the letter 'e'
		List<String> filteredWords=words.stream()
		                       .filter(word -> word.contains("e"))
		                       .toList();
		
		//print the filtered list using for-each loop
		filteredWords.forEach(word->System.out.println(word));
		
		
	}

}