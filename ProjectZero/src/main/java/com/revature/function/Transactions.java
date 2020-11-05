package com.revature.function;

import java.io.Serializable;
import java.util.Scanner;
import com.revature.util.*;
import com.revature.util.TransFiles;
public class Transactions implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -512879665713333151L;
	public int accountNum;
	public double balance;
	public double deposit;
	public double withdraw;
	public double transfer;
	public double newBalance=balance+deposit;
	
	
	Scanner input= new Scanner(System.in);
	double money=input.nextDouble();
	Transactions trans=new Transactions();
	public Transactions() {
		Records.transList.add(this);
		TransFiles.writeTransactionsFile(Records.transList);
	}
	
	public Transactions(int accountNum, double balance, double deposit, double withdraw, double transfer,
			double newBalance, Scanner input, double money, Transactions trans) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.transfer = transfer;
		this.newBalance = newBalance;
		this.input = input;
		this.money = money;
		this.trans = trans;
	}


	public void makeDeposit() {
		System.out.println("How much do you want to deposit?\n$");
		money=getDeposit();
		setDeposit(money);
		System.out.println("New balance: \n$"+newBalance);

	}

	public void makeWithdraw() {
		System.out.println("How much would you like to withdraw?\n$");
		money=trans.getWithdraw();
		trans.setWithdraw(money);
		if(money<=balance) {
			System.out.println("Withdrawing $"+money+"\nNew Balance: $"+balance);
			
		} else {
			System.out.println("You cant withdraw more than you have. \nYou currently have: $"+balance);
		}
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
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

	public double getTransfer() {
		return transfer;
	}

	public void setTransfer(double transfer) {
		this.transfer = transfer;
	}

	public double getNewBalance() {
		return newBalance;
	}

	public void setNewBalance(double newBalance) {
		this.newBalance = newBalance;
	}

	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public Transactions getTrans() {
		return trans;
	}

	public void setTrans(Transactions trans) {
		this.trans = trans;
	}
	
}
