package com.bptn.course.week3.coding34;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
       List<String> nameList = new ArrayList<String>();

       nameList.add("Robert");
       nameList.add("Samson");
       nameList.add("Alex");
       nameList.add("William");
       
       System.out.println("Elements of List: " + nameList);

       // Create an array of String named output of the same size as nameList.
       // Hint: use the size() method. 
       String[] output= new String[nameList.size()];
        
       // Fetch the elements from the nameList and insert them into the newly created array.
       // Hint: Use the get() method to fetch the elements from the arraylist
       for(int i=0; i<output.length;i++) {
    	   //getting the elements from the nameList and adding it to the output array
    	   output[i]=nameList.get(i);
       }
      
       //printing the elements from the array
        System.out.print("Elements of Array: ");
        for (int i = 0 ; i < output.length ; i++){
            System.out.print(output[i] + "  ");
        }

    }
}
