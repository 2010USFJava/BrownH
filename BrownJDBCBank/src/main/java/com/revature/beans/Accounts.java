package com.revature.beans;

public class Accounts {

	public static int accountNum;
	public static double balance;
	public Accounts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Accounts(int accountNum,double balance) {
		super();
		Accounts.accountNum = accountNum;
		Accounts.balance = balance;
	}
	
	public Accounts(double balance) {
		Accounts.balance = balance;
	}
	public static int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		Accounts.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		Accounts.balance = balance;
	}

	@Override
	public String toString() {
		return "Accounts [accountNum=" + accountNum + ", balance=" + balance + "]";
	}
	
	
}
