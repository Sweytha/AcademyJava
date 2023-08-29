package com.bptn.course.week1;

import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int target = 71;
		int num = 0;

		while (num != target) {
			System.out.print("Guess: ");
			num = input.nextInt();

			if (num == target) {
				System.out.println("Congratulations!");

				break;

			} else if (num > 100) {
				System.out.println("Please enter a number between 1 and 100");
			} else if (num < 1) {
				System.out.println("Please enter a number between 1 and 100");
			} else if (num > target) {
				System.out.println("Too high! Try again");
			} else if (num < target) {
				System.out.println("Too low! Try again");
			}

		}
		input.close();
	}
}