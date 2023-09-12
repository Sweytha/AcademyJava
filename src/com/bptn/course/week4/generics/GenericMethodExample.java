package com.bptn.course.week4.generics;

public class GenericMethodExample {

    // Generic method to find the index of the first occurrence of an element in an array
    public static <T> int findIndex(T[] array, T element) {
        if (array == null || element == null) {
            throw new IllegalArgumentException("Array or element is null");
        }

        for (int i = 0; i < array.length; i++) {
            if (element.equals(array[i])) {
                return i;
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        String[] stringArray = { "apple", "banana", "cherry", "date" };

        int index1 = findIndex(intArray, 3); // Find the index of 3 in the integer array
        int index2 = findIndex(stringArray, "cherry"); // Find the index of "cherry" in the string array

        System.out.println("Index of 3 in the integer array: " + index1);
        System.out.println("Index of 'cherry' in the string array: " + index2);
    }
}

