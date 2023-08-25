package com.bptn.course.week1;

public class ArrayLoop {

	public static void main(String[] args) {

		int[] numArray = { 3, 4, 5, 6, 7 };

		int[] numArray1 = { 2, 4, 6, 8, 10, 11 };

		multiplyArray(numArray,4);
		
		multiplyArray(numArray1,6);

	}

	// method to multiply each value of the array that is passed as parameter by n
	public static void multiplyArray(int[] values, int n) {

		for (int i = 0; i < values.length; i++) {

			values[i] = values[i] + n;

			System.out.println("The new value of the array " + values[i]);

		}

	}

}

//i=0 numArray[0]= numArray[0]*2= 3 *2= 6
//i=1 numArray[1]=numArray[1]*2= 4*2= 8
//i=2 numArray[2]= numArray[2]*2= 5*2=10
//i=3 numArray[3]= numArray[3] *2=6*2=12
//i=4 numArray[4] =numArray[4] *2=7*2=14
