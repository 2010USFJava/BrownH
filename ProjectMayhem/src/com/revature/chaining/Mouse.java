package com.revature.chaining;
//chain constructors 
public class Mouse {
	private int numTeeth; //these are called fields 
	private int numWhiskers;
	private int weight;
	
	public Mouse() { //constructor 
	}
	public Mouse(int numTeeth) { //constructor 1 parameter
		this(numTeeth, 2);
	}
	
	public Mouse(int numTeeth,int numWhiskers) { //2 parameters 
		this(numTeeth,numWhiskers,5);
	}
	
	
public Mouse(int numTeeth, int numWhiskers, int weight) { //parameters
	this.numTeeth=numTeeth;
	this.numWhiskers=numWhiskers;
	this.weight=weight;
}
public static void main(String [] args) { //main method
	Mouse m=new Mouse(47430); //given one parameter 
	System.out.println(m);
}

@Override
public String toString() {
	return "Mouse [numTeeth=" + numTeeth + ", numWhiskers=" + numWhiskers + ", weight=" + weight + "]";
}
// class customer{
/* FirstName
 * LastName
 * Balance
 * 
 * use chaining constructor based on how much info is given or not given
 * if a new customer wants to open an account but not add funds
 * you would only input First/Last Name and balance would be default 
 * 
 */
 

}