package com.revature.users;

import java.io.Serializable;
import java.util.Scanner;

import com.revature.util.Files;
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
	private int accountNum;
	
	static Scanner in = new Scanner(System.in);
			static String ans=in.nextLine();
	public Customers() {
		Records.customerList.add(this);
		Files.writeCustomerFile(Records.customerList);
				
	}
	
	public Customers(String firstName,String lastName,String username,String password, int accountNum) {
		this.firstName= firstName;
		this.lastName= lastName;
		this.username= username;
		this.password= password;
		this.accountNum= accountNum;
	}
	public static void createNewCustomer() {
		Customers customer= new Customers();
		System.out.println("Welcome. Please enter your first name:");
		ans=customer.getFirstName();
		customer.setFirstName(ans);
		in.next();
		
		System.out.println("Please enter your last name: ");
		ans=customer.getLastName();
		customer.setLastName(ans);
		in.next();
		
		System.out.println("Choose a username:"); 
		Customers apply = new Customers();
		ans=apply.getUsername();
		apply.setUsername(ans);
		Account.createAccountNum();
		in.next();
		
		System.out.println("Choose a password:");
		ans=apply.getPassword();
		apply.setPassword(ans);
		in.next();
		
		System.out.println("Great! Congradulations you've just created a new account.");
		
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

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", password="
				+ password + ", accountNum=" + accountNum + ", in=" + in + ", ans=" + ans + "]";
	}



	
}
