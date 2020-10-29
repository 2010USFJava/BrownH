package com.revature.flow;

public class LoopyLoops {
/* If Statement
 * for decision making
 * provides multiple paths of execution
 * 
 *  if(<condition>){
 *  <what to do if true>
 *  }
 *  else if (<second condition>){
 *  <what to do if 2nd condition is true>
 *  else{
 *  <what to do if false>
 *  }
 * 
 * Switch Cases
 * provides multiple paths of execution based on some value
 * the "switch" is based on an integer numeric, a string, 
 * a char, a boolean, or enum.
 * 
 * For Loops
 * for(a;b;c;) {do something}
 * a is a variable declaration (counter)
 * b is the condition that controls how far the loop will go
 * c is the incrementor/decrementor 
 */
	public static void main(String [] args) {
		//ifMethod(6,4);
		//whatColor("green");
		//forLoopFunness(10);
		//int[] myArray= {12,15,16,46,87,92,0,0,5,78};
		//forEachFun(myArray);
		doWileyWhile(15);
		
	
}
	public static void ifMethod(int a, int b) { //static belongs to the class/doesn't need to be instantiated 
		//a and b are called parameters 
		if(a>b) {
			System.out.println("This is true!");
		}
		else if(a==6) {
			//= assigns a value ==compares value
			System.out.println("Wreck 'em");
		}
		else {
			System.out.println("This is false");
		}
		// if(a>b || a==6) 
			// || -OR, && -AND
		}
	public static void whatColor(String color) {
		switch(color) {
			case "blue":
				System.out.println("you picked blue");
				break;
			case "red":
				System.out.println("you picked red");
				break;
			case "green":
				System.out.println("you picked green");
				break;
			case "purple":
				System.out.println("you picked purple");
				break;
			//else
			default:
				System.out.println("You are dumb.");
		}
	}
	public static void forLoopFunness(int p) {
		for(int i=0;i<p;i++) {
			System.out.println("counter is at: "+i);
			System.out.println("checking i...");
			if (i==6) {
				//break;
				continue;

			}
		}
		System.out.println("outside for loop");
	}
	/*
	 * Enhanced for loop
	 * for (x:<Array or Collection>){do something}
	 * good for moving through collections, arrays and other
	 * more CPU efficient 
	 * no issues w/ index out of bounds- not size dependent
	 * good for access elements in one collection 
	 * bad for adding and removing 
	 */
	public static void forEachFun(int [] a) {
		for(int i:a) {
			System.out.println(i+5);
		}
// same result more complex form 
		//for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]+5);
		}
		/*
		 * While loops
		 * while(<condition>) {<do something>}
		 * 
		 * do while
		 * do{<do something>} while (<condition>)
		 */
		public static void wileyWhile(int i) {
			while(i++<10) {
				System.out.println("Wreck 'em in the while loop"+i);
				//i++;
			}
		}
		public static void doWileyWhile(int i) {
				do {
					System.out.println("Do you feel like we do " +i);
					i++;
				} while (i<=10);
			}
		}
		
	
