package com.bptn.course.week3.coding310;

public class CountdownTimer implements Runnable {

	private int startValue;

	public CountdownTimer(int startValue) {
		this.startValue = startValue;
	}

	@Override
	public void run() {

		// count down from startValue to 1
		// using decrement for-loop
		for (int i = startValue; i >= 1; i--) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		
		CountdownTimer timer= new CountdownTimer(10);
		
		Thread thread = new Thread(timer);
		thread.start();
		
		 
		System.out.println("Main thread continues to execute...");

	}

}
