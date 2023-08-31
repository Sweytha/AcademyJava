package com.bptn.course.week2.exceptionHandling;

public class NullPointerExceptionExample {
	
	

	public static void main(String[] args) {
		
		
		String text=null;
		
		try {
		
		System.out.println(text.length());
		
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer exception has occurred " +e.getMessage());
			
		}

	}

}
