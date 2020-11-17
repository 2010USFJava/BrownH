package com.revature.beans;

public class Customer {

	public static String firstName;
	public static String lastName;
	public static int ssn;
	public static String DOB;
	public static String username;
	public static String password;
	public static int accountNum;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String firstName, String lastName, int ssn, String DOB, String username, String password) {
		super();
		Customer.firstName = firstName;
		Customer.lastName = lastName;
		Customer.ssn = ssn;
		Customer.DOB = DOB;
		Customer.username = username;
		Customer.password = password;
		// Customer.accountNum = accountNum;
	}

	public Customer(String firstName, String lastName, String username, String password) {
		Customer.firstName = firstName;
		Customer.lastName = lastName;
		Customer.username = username;
		Customer.password = password;
	}

	public Customer(String lastName, int accountNum) {
		Customer.lastName = lastName;
		Customer.accountNum = accountNum;
	}


	public Customer(String username, String password) {
		Customer.username = username;
		Customer.password = password;
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

	public static int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		Customer.ssn = ssn;
	}

	public static String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public static String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		Customer.username = username;
	}

	public static String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		Customer.password = password;
	}

	public static int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		// Customer.accountNum = accountNum;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + ", DOB=" + DOB
				+ ", username=" + username + ", password=" + password + "]";
	}

}
