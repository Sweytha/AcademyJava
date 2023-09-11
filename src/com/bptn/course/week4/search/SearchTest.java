package com.bptn.course.week4.search;

public class SearchTest {
	
	public static int sequentialSearch(String[] arr1, String target) {
		 
		
		for(int i=0;i<arr1.length;i++) {
			
			if(arr1[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		//declare an array of strings
		String[] arr1 = {"blue", "red", "purple", "green"};

        // test when the target is in the array
        int index = sequentialSearch(arr1,"red");
        System.out.println(index);

        // test when the target is not in the array
        index = sequentialSearch(arr1,"pink");
        System.out.println(index);


	}



}
