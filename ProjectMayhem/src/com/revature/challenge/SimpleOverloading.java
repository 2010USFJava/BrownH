package com.revature.challenge;

public class SimpleOverloading {
	static Integer a=5;
	public static void num(int a) {
	}
	public static void num(int a, int b) {
		System.out.println("This is an exact method overload");
	}
	public static void num(double a) {
		System.out.println("This is a conversion method overload");
	}
	public static void num(Integer a) {
		System.out.println("This is a boxing method overload");
		
	}
	public static void num(int...a) {
		System.out.println("This is a varargs method overload");
	}
	public static void main(String[] args) {
		num(3);
		num(4.54);
		num(a);
		num(3,4,5,6,8);
		
		
		
		
	}
}
