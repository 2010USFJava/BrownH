package com.revature.beans;

import java.io.Serializable;

import com.revature.util.FileStuff;
import com.revature.util.LogThis;
import com.revature.util.Roster;

public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1621278149083237127L;
	private String name;
	private String location;
	private int numOfEmployees;
	private int numOfDepartments;
	
	public Company() {
		 super();
		 Roster.companyList.add(this);
		 FileStuff.writeCompanyFile(Roster.companyList);
	 }

	public Company(String name, String location, int numOfEmployees, int numOfDepartments) {
		super();
		this.name = name;
		this.location = location;
		this.numOfEmployees = numOfEmployees;
		this.numOfDepartments = numOfDepartments;
		Roster.companyList.add(this);
		FileStuff.writeCompanyFile(Roster.companyList);
		LogThis.LogIt("info", "A new company "+this.name+" has been added");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNumOfEmployees() {
		return numOfEmployees;
	}

	public void setNumOfEmployees(int numOfEmployees) {
		this.numOfEmployees = numOfEmployees;
	}

	public int getNumOfDepartments() {
		return numOfDepartments;
	}

	public void setNumOfDepartments(int numOfDepartments) {
		this.numOfDepartments = numOfDepartments;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + ", numOfEmployees=" + numOfEmployees
				+ ", numOfDepartments=" + numOfDepartments + "]";
	}
	
}
