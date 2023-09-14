package com.bptn.course.week4.streamAPI;



import java.util.Arrays;
import java.util.List;

public class StringSorter {

	public static void main(String[] args) {
		//create a list of strings
	   List<String> words=Arrays.asList("apple","banana","cherry","date","elderberry");

	   //sort the words in the list in ascending order
	   List<String> sortedList=words.stream()
	             .sorted((s1,s2)->s1.length()-s2.length())
	             .toList();
	   
	   System.out.println("Sorted list (ascending order)" + sortedList);
	}

}