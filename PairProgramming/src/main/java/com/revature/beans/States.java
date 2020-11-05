package com.revature.beans;

import java.io.Serializable;

import com.revature.util.Files;
import com.revature.util.LogThis;
import com.revature.util.Roster;

public class States implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3405412236181757466L;
	public String name;
	public String capital;
	public int population;
	//StateProperties population;
	public States() {
		super();
		Roster.stateList.add(this);
		Files.writeStateFile(Roster.stateList);
	}
	public States(String name, String capital, int population) {
		super();
		this.name = name;
		this.capital = capital;
		this.population = population;
		//this.population= population;
		Roster.stateList.add(this);
		Files.writeStateFile(Roster.stateList);
		LogThis.LogIt("info", "A new state "+this.name+" has been added");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "States [name=" + name + ", capital=" + capital + ", population=" + population + "]";
	}
	public StateProperties getStateProperties() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
