package com.revature.generics;
/*Generics
 * using a type as a parameter 
 * write code that can handle different types of objects
 * use angle brackets <> to denot that something
 */
public class Gen1<T> {
	//declare an object of type T
	T object;
	//pass the constructor a reference to an object of type T
	Gen1(T objectParameter){
		object=objectParameter;
		
	}
	//return object 
	T getObject() {
		return object;
		
	}
	//show the type of T
	void showType() {
		System.out.println("Type of T is: "+ object.getClass().getName());
		
	}
}
