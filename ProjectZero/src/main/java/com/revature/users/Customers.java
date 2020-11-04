package com.revature.users;

import java.io.Serializable;
import java.util.Scanner;

import com.revature.util.Files;
import com.revature.util.Log;
import com.revature.util.Records;

public class Customers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1862896983436739908L;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String accountNum;

	
	protected static Scanner in = new Scanner(System.in);
			protected static String ans=in.nextLine();
	public Customers() {
		Records.customerList.add(this);
		Files.writeCustomerFile(Records.customerList);
				
	}
	
	public Customers(String firstName,String lastName,String username,String password, String accountNum) {
		this.firstName= firstName;
		this.lastName= lastName;
		this.username= username;
		this.password= password;
		this.accountNum= accountNum;
		Files.writeCustomerFile(Records.customerList);
		Log.LogIt("info","New customer "+this.firstName+" has been added");
		
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", password="
				+ password + ", accountNum=" + accountNum + ", in=" + in + ", ans=" + ans + "]";
	}



	
}
