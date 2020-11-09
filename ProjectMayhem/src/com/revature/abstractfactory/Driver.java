package com.revature.abstractfactory;

public class Driver {
	public static void main(String[] args) {
		Quokka q=new FactoryProvider.getFactory("Animal").create("Quokka");
		
	}
}
