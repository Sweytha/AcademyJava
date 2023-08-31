package com.bptn.course.week2.customException;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the file name with correct extension i.e. .txt ");

		String fileName = scanner.nextLine();// read the file name and store it inside a variable

		try {
			validateFileExtension(fileName);
			System.out.println("Correct file name with extension .txt");
		} catch (FileExtensionException e) {
			System.out.println("Error: " + e.getMessage());

		} finally {
			scanner.close();
		}

	}

	private static void validateFileExtension(String fileName) throws FileExtensionException {

		if (!fileName.endsWith(".txt")) {
			throw new FileExtensionException("File doesn't have .txt extension");
		}

	}

}

//throw is used within the code block to manually throw an exception.
//throws is used in a method signature to indicate that the method might throw specific exceptions, which need to be handled by the calling code using try-catch blocks or propagated further.
