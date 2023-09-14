package com.bptn.course.week4.methodReference;

@FunctionalInterface
interface JavaInterface{
	int findMax(int a, int b);
}

public class MethodReferenceExample1 {
	
	public static void main(String[] args) {
	
	    //1. Method reference using static method	
	  
		//using lambda expression
		JavaInterface obj=(a,b)->Math.max(a, b);
		int objResult= obj.findMax(2, 4);
		System.out.println(objResult);
		
		// static method reference using  className::staticMethod
		JavaInterface ji = Math::max;
		int result = ji.findMax(10, 20);
		System.out.println(result);
		
	}
}