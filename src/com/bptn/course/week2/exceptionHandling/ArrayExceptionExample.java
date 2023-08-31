package com.bptn.course.week2.exceptionHandling;

public class ArrayExceptionExample {

	public static void main(String[] args) {
		
		
		
		int[] a= {1,2,3,4};
		
		try {
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
					
			System.out.println("The array index is out of range " +e.getMessage());
		}

	}

}


