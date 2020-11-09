package com.revature.beans;

import java.io.Serializable;

import com.revature.util.CustomerFile;
import com.revature.util.LogThis;
import com.revature.util.Roster;

public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9219214699664399244L;
	public static String firstName;
	public static String lastName;
	public static String username;
	public static String password;
	public static int accountNum;
	public static boolean approved;

	public Customer() {
		super();
		Roster.umap.put(username, password);
		CustomerFile.writeUserMap(Roster.umap);
		Roster.customerList.add(this);
		CustomerFile.writeCustomerFile(Roster.customerList);
	}

	public Customer(String firstName, String lastName, String username, String password, int accountNum, boolean approved) {
	
		Customer.firstName = firstName;
		Customer.lastName = lastName;
		Customer.username = username;
		Customer.password = password;
		Customer.accountNum = accountNum;
		Customer.approved = false;

		Roster.customerList.add(this);
		CustomerFile.writeCustomerFile(Roster.customerList);
		LogThis.LogIt("info", "A new customer "+Customer.firstName+""+Customer.lastName+" has been added");
	}



	public static String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		Customer.firstName = firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		Customer.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		Customer.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		Customer.password = password;
	}


	public static int getAccountNum() {
		return accountNum;
	}

	public static void setAccountNum(int accountNum) {
		Customer.accountNum = accountNum;
	}
	

	public static boolean isApproved() {
		return approved;
	}

	public static void setApproved(boolean approved) {
		Customer.approved = approved;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", password="
				+ password + ", accountNum=" + accountNum + "]";
	}



	

	

	
	

	
	
}
