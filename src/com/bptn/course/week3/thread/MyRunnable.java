package com.bptn.course.week3.thread;

public class MyRunnable implements Runnable{

	//implement the run method
	@Override
	public void run() {
		System.out.println("Run() method is executed");
		
	}
	
	public static void main(String[] args) {
		
		//create an object from MyRunnable class
		MyRunnable myRunnable = new MyRunnable();
		
		//create a thread object using Thread class and pass myRunnable as argument to the constructor
		Thread thread= new Thread(myRunnable);
		
		thread.start();
	}
	

}
