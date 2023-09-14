package com.bptn.course.week4.streamAPI;

import java.util.Arrays;
import java.util.List;

public class StringLengthCountExercise {

	public static void main(String[] args) {

		// create a list of strings
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		int length = 5;

		// count the number of words which has a length>5
		//filter()- intermediate operation
		//count() -terminal operation

		long count = words.stream()
				.filter(word -> word.length()>length)
				.count();
		//print the count
		System.out.println("Count "+count);

	}

}