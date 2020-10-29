package com.revature.classtypes;
/*
 * ABSTRACT CLASS CANNOT BE INSTANCIATED, CONTAIN AT LEAST ONE ABSTRACT METHOD 
 * contract based- you have to implement all the methods in the class
 * must be overridden in subclass
 */
public abstract class Animals implements Hunt {
	
	private int eyes; 
	public abstract void breathe();
	
	
}
