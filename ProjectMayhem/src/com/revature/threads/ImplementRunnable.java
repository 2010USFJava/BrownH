package com.revature.threads;

public class ImplementRunnable implements Runnable {

	@Override
	public void run() {
		for (int i=0; i <20; i++) {
			System.out.println("\t\t\t\t implement runnable");
		}
		
	}

}
