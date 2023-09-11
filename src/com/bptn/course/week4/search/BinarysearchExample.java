package com.bptn.course.week4.search;

import java.util.ArrayList;

public class BinarysearchExample {
	
	private static int binarySearch(ArrayList<Integer> nums, int target) {
		
		int low =0;
		int high= nums.size()-1;
		
		//keep looping until your high pointer is greater than or equal to the low pointer
		while(low<=high) {
			
			//calculate my middle index
			int mid =(low +high)/2;
			// if the target is equal to the middle element , return the middle index
			if(nums.get(mid)==target) {
				return mid;
			}
			else if(target <nums.get(mid)) {
				//found the target smaller than the element at the middle
				high=mid-1; 
			}
			else {
				//found the target greater than the element at the middle
				low= mid+1;
			}
			
		}
		//if the element is not found, then you return -1
		return -1;
	}

	
	public static void main(String[] args) {
		
		//create a sorted arrayList
		ArrayList<Integer> nums= new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(40);
		nums.add(50);
		nums.add(80);
		nums.add(90);
		
		//define the target element
		int target= 10;
		
		int index = binarySearch(nums, target);
		
		if(index!= -1) {
			System.out.println("The element is found");
		}
		else {
			System.out.println("The element is not found");
		}
		
	}


}
