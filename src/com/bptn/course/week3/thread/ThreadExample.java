package com.bptn.course.week3.thread;

public class ThreadExample extends Thread {

	@Override
	public void run() {

		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		
		ThreadExample t1= new ThreadExample();
		
		//call the run method is not recommended because it runs within the context of the main thread
		//t1.run();
		
		//created a new thread and then executes the run program
		t1.start();
		

	}

}
