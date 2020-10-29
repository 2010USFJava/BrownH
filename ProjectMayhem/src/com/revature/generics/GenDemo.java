package com.revature.generics;

public class GenDemo {

	public static void main(String[] args) {
		//create Gen1 reference for Integers
		Gen1<Integer> i;
		i= new Gen1<Integer>(88);
		//show the type of i 
		i.showType();
		//get value of i 
		int v=i.getObject();
		System.out.println("value: "+ v);
		
		Gen1<String> s= new Gen1<String>("Generics Test");
		s.showType();
		String str=s.getObject();
		System.out.println("value: "+str);
		
	}

}
