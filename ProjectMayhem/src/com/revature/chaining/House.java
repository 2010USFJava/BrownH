package com.revature.chaining;
//chaining practice 
public class House {
	
	private int zipcode;
	private int numRooms;
	private int numBath;
	private int cost;
	private int sqFt;
	private int garageCapacity;
	
	public House() { 
		this(79410);
	}
	public House(int zipcode) { 
		this(zipcode, 4);
	}
	
	public House(int zipcode, int numRooms) { 
		this(zipcode,numRooms,3);
	}
	public House(int zipcode, int numRooms, int numBath) {
		this(zipcode,numRooms,numBath,250000);
	}
	public House(int zipcode, int numRooms, int numBath, int cost) {
		this(zipcode,numRooms,numBath,cost,4000);
	}
	public House(int zipcode, int numRooms, int numBath, int cost, int sqFt) {
		this(zipcode,numRooms,numBath,cost,sqFt,2);
	}
	
public House(int zipcode, int numRooms, int numBath, int cost, int sqFt, int garageCapacity) { 
	this.zipcode=zipcode;
	this.numRooms=numRooms;
	this.numBath=numBath;
	this.cost=cost;
	this.sqFt=sqFt;
	this.garageCapacity=garageCapacity;
}
public static void main(String [] args) { 
	House H=new House();  
	System.out.println(H);
}
@Override
public String toString() {
	return "House [zipcode=" + zipcode + ", numRooms=" + numRooms + ", numBath=" + numBath + ", cost=" + cost
			+ ", sqFt=" + sqFt + ", garageCapacity=" + garageCapacity + "]";
}

}
