package com.revature.abstractfactory;

public class AnimalFactory implements AbstractFactory<String> {

	@Override
	public Animal create(String t) {
		if(t.equalsIgnoreCase("Quokka")) {
			return new Quokka();
			
		} else if (t.equalsIgnoreCase("Duck")) {
			return new Duck();
		}else if (t.equalsIgnoreCase("Fox")) {
			return new Fox();
		}
		return null;
	}


}
