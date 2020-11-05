package com.revature.services;


import com.revature.beans.States;

public class AddMethod {

	public static void addPopulation(States a,States b) {
		int bPop=b.getPopulation();
		int aPop=a.getPopulation();
		bPop= bPop+aPop;
		b.setPopulation(bPop);
		System.out.println("State B's new population is: " +bPop);
		
	}
}
