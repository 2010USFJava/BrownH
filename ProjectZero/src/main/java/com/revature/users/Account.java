package com.revature.users;

import java.util.Random;

public class Account {
	enum AccountType {
		checking,
		savings,
		joint,
		
	}
	
	private static int accountNum;
	private double balance;
	private double deposit;
	private double withdraw;
	
	
	public Account() {
	}
	public Account(int accountNum, double balance) {
		Account.accountNum=accountNum;
		this.setBalance(balance);
	}
	public static void createAccountNum() {
		Random random = new Random();
		accountNum=random.nextInt(5000);
	}
	public long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		Account.accountNum = accountNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}

	
}

