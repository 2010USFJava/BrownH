package com.revature.classtypes;

public class Puma extends Mammal implements Hunt {

	private boolean isCapableOfMurderingPeople;
	
	public void breath() {
		System.out.println("I can breathe");
	}
	public Puma() {
		super();
	}
	public Puma(boolean isCapableOfMurderingPeople) {
		super();
		this.isCapableOfMurderingPeople= isCapableOfMurderingPeople;
				
	}
		
	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findPrey() {
		System.out.println("I hunt prey in the forest");
		
	}
	@Override
	public String toString() {
		return "Puma [isCapableOfMurderingPeople=" + isCapableOfMurderingPeople + "]";
	}
}
