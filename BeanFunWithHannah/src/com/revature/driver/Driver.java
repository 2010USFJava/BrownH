package com.revature.driver;
import com.revature.beans.Dog;
import com.revature.beans.HannahsPets;

public class Driver {

	public static void main(String[] args) {
		HannahsPets a= new HannahsPets("Dog","Romeo",3,55);
		System.out.println(a);
		HannahsPets b= new HannahsPets ("Dog","Bailey",15,22);
		System.out.println(b);
		HannahsPets c= new HannahsPets ("Bird","Frodo",17,1);
		System.out.println(c);
		Dog Romeo= new Dog("brown/white","border collie","purinaOne");
		System.out.println(Romeo);
		Dog Bailey= new Dog("tan","shitzu","purinaOne");
		System.out.println(Bailey);
		
		
	}
}
