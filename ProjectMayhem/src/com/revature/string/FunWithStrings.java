package com.revature.string;

public class FunWithStrings {
	public static void main(String[] args) {
		String s= "dog";
		String a= "dog";
		System.out.println(s.hashCode()); 
		System.out.println(a.hashCode()); //points to same memory 
		a=a+"house";
		System.out.println(a.hashCode()); 
		System.out.println(s.charAt(2)); //3rd letter of s 
		StringBuilder sb=new StringBuilder("Wreck 'em");
		StringBuilder sb2=new StringBuilder("Wreck 'em");
		System.out.println(sb.hashCode());
		System.out.println(sb2.hashCode()); //same memory different memory location
		sb=sb.append("w");
		System.out.println(sb.hashCode());//same memory location, changed value
		//string is thread safe- shared between threads only one thread can access at a time, same string shared between each thread
		//ex. refrigerator- everyone stores in it but only one person can use at a time
		
		
	}
}
