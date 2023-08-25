package com.bptn.course.week1;

import java.util.Scanner;

public class JavaInput {

	public static void main(String[] args) {
		
		//Created myObj which is the object of Scanner class		
		Scanner myObj= new Scanner(System.in);
		
		//Create a variable "userName" which is used to store the String data type
		String userName;

		
		// Ask the user to enter the username by printing "Enter Username" and read the input given by the user
	    // Fill in the code for the above part below
		System.out.println("Enter the username : ");
		userName = myObj.nextLine();
		
		//print the username on the console
		System.out.println("The username is "+ userName);
		
	    //close the scanner
		myObj.close();
		
		

	}

}
