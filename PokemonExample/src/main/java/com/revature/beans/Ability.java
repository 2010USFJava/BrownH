package com.revature.beans;

public class Ability {

	public int aid;
	public String name;
	public String adescription;
	public Ability() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ability(int aid, String name, String adescription) {
		super();
		this.aid = aid;
		this.name = name;
		this.adescription = adescription;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdescription() {
		return adescription;
	}
	public void setAdescription(String adescription) {
		this.adescription = adescription;
	}
	@Override
	public String toString() {
		return "Ability [aid=" + aid + ", name=" + name + ", adescription=" + adescription + "]";
	}
	
	
}
