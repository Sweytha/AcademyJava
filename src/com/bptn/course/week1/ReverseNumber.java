package com.bptn.course.week1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner myObj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		

		int inputNumber = myObj.nextInt();
		int rem = 0;
		int reverseNumber = 0;

		while (inputNumber != 0) {
			rem = inputNumber % 10;
			reverseNumber = reverseNumber * 10 + rem;
			inputNumber = inputNumber / 10;
		}

		System.out.println("The reversed number is: " + reverseNumber);
		
		myObj.close();

	}

}
