package com.revature.beans;

public class Dog {
	private String color;
	private String breed;
	private String food;
	public Dog() {
		
	}
	public Dog (String color, String breed, String food) {
		this.color=color;
		this.breed=breed;
		this.food=food;
	

		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	@Override
	public String toString() {
		return "Dog [color=" + color + ", breed=" + breed + ", food=" + food + "]";
	}

	
	
}
