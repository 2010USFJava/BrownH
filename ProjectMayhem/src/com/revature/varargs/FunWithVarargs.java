package com.revature.varargs;


public class FunWithVarargs {
/*Variable Length Argument
 * Method that will take in a variable number of arguments
 * Automate and hide the process of creating and saving values into an array
 * prior to invoking the method 
 * can be of any type (ex. boolean)
 * must be last parameter 
 */
	public static void main(String[] args) {
		varTest();

	}
	static void varTest(int ... V ) { //can have an arg before but not after
		System.out.println("Number of Args is: " + V.length + " Contents:");
		for(int x:V) {
			System.out.println(x);
		}
		
	}

}
