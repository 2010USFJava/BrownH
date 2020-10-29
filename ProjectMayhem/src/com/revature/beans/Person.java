package com.revature.beans;
//Java is an object oriented language using objects that have properties and perform actions 
//cookie cutter makes copies of cookies
//classes can instantiate objects 
// objects have states and behaviors 
//Class- template for an object 
/* make instances by utilizing classes' constructors 
 * OOP
 * 4 Pillars of OOP 
 * Polymorphism 
 * 	-many forms, 
 * 	-method overriding/overloading,
 * 		-overriding needs minimum 2 classes with same method name and parameter but different behavior)
 * 		-overloading has to be in one class with same method name but different parameter)
 *	-multiple "is-a" relationships
 *	-covariance
 * Encapsulation
 * 	-wrapping and protecting data fields, preventing outside manipulation 
 * 	-concealing internal state 
 * Inheritance
 * 	-programming language allows for hierarchy of objects 
 * 	-child objects are inheriting properties from parent objects
 * 	-Java does not allow multiple inheritance but can w/ interfaces 
 * 		-Diamond problem
 * Abstraction
 * 	-process of hiding the implementation details and only showing functionality to user
 * 	-"what it does, not how it does it"
 * 
 */
public class Person {
/*bean- represents some entity 
 * for data structure 
 * Makeup:
 * 	private fields
 * 	no args constructor
 * 	constructor w/ fields
 * 	getters and setters
 * 	override toString(), equals(), hashcode(),
 */
	/*Members of a class
	 * Instance variables- property of a specific object
	 * Static variables- property that belongs to the class, to every object of that type
	 * (when a static variable changes, it changes for all instances)
	 * Instance methods- behavior related to specific object
	 * Static methods- behavior related to entire class 
	 * Constructor- instantiates the class using the "new" keyword
	 * 
	 */
	private String name;
	private int age;
	private int weight;
	static String homePlanet="Earth";

	//no args constructor (defualt)
	public Person (){
		//super(); constructor for parent class 
		// default value for an object is null or zero 
		
	}
	//constructor with fields 
	public Person(String name, int age, int weight) {
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	//getters and setters
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;			
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getWeight() {
	 return this.weight;
	}
	public void setWeight(int weight) {
		this.weight=weight; 
	}
	
	public static String getHomePlanet() {
		return homePlanet;
	}
	public static void setHomePlanet(String homePlanet) {
		Person.homePlanet = homePlanet;
	}
	//override toString() 
	@Override 
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + ", homePlanet= "+homePlanet+"]";
	}
	
}
