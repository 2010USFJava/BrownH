package com.revature.beans;

public class HannahsPets {
	private String type;
	private String name;
	private int age;
	private int weight;
	static String homePlanet="Earth";
	
	public HannahsPets() {
		
	}

	public HannahsPets (String type, String name, int age, int weight) {
		this.type=type;
		this.name=name;
		this.age=age;
		this.weight=weight;

	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public static String getHomePlanet() {
		return homePlanet;
	}

	public static void setHomePlanet(String homePlanet) {
		HannahsPets.homePlanet = homePlanet;
	}

	@Override
	public String toString() {
		return "HannahsPets [type=" + type + ", name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
}


