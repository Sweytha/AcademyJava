package com.bptn.course.week3.list;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        // Access elements in the ArrayList
        System.out.println("ArrayList Elements:");
        for (int i : arrayList) {
            System.out.println(i);
        }

        // Update an element
        arrayList.set(2, 35);

        // Remove an element
        arrayList.remove(1);

        // Size of the ArrayList
        System.out.println("Size of ArrayList: " + arrayList.size());
    }
}

