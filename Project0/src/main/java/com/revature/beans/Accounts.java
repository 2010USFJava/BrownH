package com.revature.beans;

import java.io.Serializable;

import com.revature.util.CustomerFile;
import com.revature.util.LogThis;
import com.revature.util.Roster;

public class Accounts implements Serializable {




	/**
	 * 
	 */
	private static final long serialVersionUID = -1802356797400516717L;


	public enum accountType {
		CHECKING,
		SAVING,
		JOINT
	}
	public int accountNum= Customer.getAccountNum();
	public accountType type;
	public static boolean approved=false;
	public static double balance=0;
	public String customer2= Customer.username;
	
	
	public Accounts() {
		super();
		Roster.accountList.add(this);
		CustomerFile.writeAccountList(Roster.accountList);
	}


	public Accounts(accountType type, boolean approved, double balance, int accountNum, String customer2) {
		super();
		this.accountNum = accountNum;
		this.type = type;
		Accounts.approved = approved;
		Accounts.balance = balance;
		this.customer2 = customer2;
		Roster.accountList.add(this);
		CustomerFile.writeAccountList(Roster.accountList);
		LogThis.LogIt("info", "A new application was submitted.");
	}






	public Accounts(int accountNum) {
		this.accountNum=accountNum;
	}


	public static int getAccountNum() {
		return getAccountNum();
	}



	public static void setAccountNum(int accountNum) {
		Customer.accountNum = accountNum;
	}



	public static boolean isApproved() {
		return approved;
	}



	public static void setApproved(boolean approved) {
		Accounts.approved = approved;
	}



	public static double getBalance() {
		return balance;
	}



	public static void setBalance(double balance) {
		Accounts.balance = balance;
	}



	public accountType getType() {
		return type;
	}

	public void setType(accountType type) {
		this.type = type;
	}



	public String getCustomer2() {
		return customer2;
	}


	public void setCustomer2(String customer2) {
		this.customer2 = customer2;
	}


	@Override
	public String toString() {
		return "Accounts [type=" + type + ", Account Number = " + Customer.accountNum + ", Account Approved = " + approved +", Account Balance = " + balance+"]";
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
	
}
