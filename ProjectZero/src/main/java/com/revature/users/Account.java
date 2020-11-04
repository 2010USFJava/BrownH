package com.revature.users;

import java.util.Random;
import java.util.Scanner;

public class Account {
	static Scanner input = new Scanner(System.in);
	int amt;
	
	private static int accountNum;
	private static double balance;
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
	public static double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		Account.balance = balance;
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
	int deposit () {
		System.out.println("How much do you want to deposit? \n$");
		amt = input.nextInt();
		if (amt < 0) {
			System.out.println("Invalid Input");
			return 1;
			
		}
		balance = balance + amt;
		System.out.println("Your new balance is: \n$"+balance);
		return 0;
		
	}

	
}

