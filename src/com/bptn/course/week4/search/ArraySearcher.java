package com.bptn.course.week4.search;

public class ArraySearcher {

	public static int sequentialSearch(int[] numArray, int target) {

		// loop over the elements in the array
		for (int i = 0; i < numArray.length; i++) {
			// the target is present inside the array
			if (numArray[i] == target) {
				return i;
			}

		}
		return -1;

	}

	public static void main(String[] args) {

		int[] numArray = { 3, -2, 9, 38, -23 };
		System.out.println("Tests of sequentialSearch");
		System.out.println(sequentialSearch(numArray, 3)); //0 //lowest execution element
		System.out.println(sequentialSearch(numArray, 9)); //2  
		System.out.println(sequentialSearch(numArray, -23)); //4 //highest execution element
		System.out.println(sequentialSearch(numArray, 99)); //-1 //highest execution element

	}

}
//linear time complexity
//as the size of the data increases the complexity of the algorithm proportional increases
//the execution is also going to increase linearly 
//space and time complexity 
