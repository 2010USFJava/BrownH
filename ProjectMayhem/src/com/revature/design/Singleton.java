package com.revature.design;
/*
 * Singleton Design Pattern
 * ensure a class has only one instance and provides 
 * a global access to it (In Java-everything belongs to a class so global scope doesn't apply) 
 */
public class Singleton {

	//private static property/instance of itself 
	private static Singleton instance; //constructor creates object
	
	//private constructor
	private Singleton() {
		//some logic 
	}
	//public static synchronized method to get the unique instance-if it does not exist 
	//we will create it 
	//synchronized so its only in one thread so its only initialized once 
	//each thread has its own stack memory
	//Singleton is a string so its in heap 
	//maintain consistency across threads so we will have one and only one instance 
	public static synchronized Singleton getInstance() {
		if(instance==null) {
			instance= new Singleton();
			
		}
		return instance;
	}
	public void doSomething() {
		//what the object should do 
	}
	
}
