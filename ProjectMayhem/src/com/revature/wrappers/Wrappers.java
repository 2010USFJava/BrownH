package com.revature.wrappers;

public class Wrappers {
/*All wrapper classes inherit from the Number class
 * they wrap around a primitive value and allow it to be treated as an object
 * Wrappers- primitive values
 * Character -char
 * Boolean - boolean
 * Byte- byte 
 * Short - short
 * Integer- int
 * Long- long
 * Float- float
 * Double- double
 * 
 * AutoBoxing- "expensive" process-
 * -boxing- implicit conversion from a primitive type to wrapper class
 * -unboxing- implicit conversion from wrapper to primitive
 */
	static int myInt=3;
	static Integer myInteger=5; //is an object, wrapper type
	static Double myDouble=45.93;
	public static int addEmUp(int a, int b) { //calls for primitive values
		return a+b;
	}
	public static void main(String[] args) {
	int result= addEmUp(myInt,myInteger); //unboxing 
	System.out.println(result);
	Integer i=0;
	i=i.MAX_VALUE; //max value we can have for an int
	System.out.println(i);
	}

}
