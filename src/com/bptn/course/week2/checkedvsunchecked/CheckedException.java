package com.bptn.course.week2.checkedvsunchecked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) {

	 
	 
			try {
				readFile("hello.txt");
			} catch (FileNotFoundException e) {
				System.out.println("File not found");
			}
		
	}

	private static void readFile(String fileName) throws FileNotFoundException {

		FileReader fileReader = new FileReader(fileName);

	}

}

//checked exception is an exception where java wants you to deal with it some way or the other