package com.revature.threads;

public class ThreadDemo {
/*
 * 2 ways to spin a thread 
 * 1-extend thread and overwrite Run(): use to override methods in thread class "building a house"
 * 2-implement the runnable interface- allows you to extend something else while implementing thread "buying a house"
 */
	
	public static void main(String[] args) {
		Thread extendThread = new ExtendThread();
		Thread implementThread= new Thread(new ImplementRunnable());

		implementThread.setPriority(10);
		
		extendThread.start();
		implementThread.start();
		
		for (int i=0;i<20;i++) {
			System.out.println("Hey-driver");
			
		}
	}

}
