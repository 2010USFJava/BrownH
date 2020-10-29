package com.revature.challenge;

public class OverloadingChallenge {
	//overloading by changing the number of arguments aka exact
	//this is a primitive variable 
	public static void dog(double weight) { 
		System.out.println("My dog weights "+weight);
	}
	//this is also a primitive but has different number of args
	public static void dog(double age, double length) {
		System.out.println("My dog is " + age + " years old and " + length +" feet tall");
	}
	//overloading by changing data types aka conversion
	public static void dog2(double numOfToys) {
		System.out.println("He has " +numOfToys+" number of toys");  //data type is double 
	}
	public static void dog2(int numOfToys) {
		System.out.println("He has destroyed "+numOfToys+" toys"); //data type is int 
	}
	//overloading with autoboxing 
	static int numOfToys=3;
	static Integer numOfToysDestroyed=2;
	public static int toysRemaining(int a, int b) {
		return a-b; 

		
	}
	//overloading with varargs
	public static void dog4(int...x) {
		System.out.println("int varagrs");
	}
	public static void dog4(double...x) {
		System.out.println("double varagrs");
	}
	
	public static void main(String[] args) {
		dog(3.8,2.4); //exact
		dog(65.93);
		dog2(8.0); //conversion
		dog2(7);
		int result=toysRemaining(numOfToys,numOfToysDestroyed.intValue());//boxing?
		System.out.println(result+" toys remaining");
		dog4();		//varargs?
	}

}
	
			
	
