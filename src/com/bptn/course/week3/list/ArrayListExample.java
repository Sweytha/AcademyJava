package com.bptn.course.week3.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        // Access elements in the ArrayList using for-each loop(enhanced for loop)
        System.out.println("ArrayList Elements:");
        for (int element : arrayList) {
            System.out.println(element);
        }
        
        //access elements using normal for-loop
        for(int i=0; i<arrayList.size(); i++) {
        	System.out.println(arrayList.get(i));
        }
        
        //iterating through the collection using iterator
        Iterator<Integer> iterator= arrayList.iterator();
        while(iterator.hasNext()) {
        	 System.out.println(iterator.next());
        }

       
        
        // Update an element
        arrayList.set(2, 35);

        // Remove an element
        arrayList.remove(1);

        // Size of the ArrayList
        System.out.println("Size of ArrayList: " + arrayList.size());
    }
}

