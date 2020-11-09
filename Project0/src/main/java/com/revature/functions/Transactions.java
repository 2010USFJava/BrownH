package com.revature.functions;

import java.io.Serializable;
import java.util.Scanner;

import com.revature.beans.Accounts;
import com.revature.beans.Customer;
import com.revature.menu.Menu;
//import com.revature.util.CustomerFile;
import com.revature.util.LogThis;
import com.revature.util.Roster;
//import com.revature.util.Roster;

public class Transactions implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3580395448939971143L;
	

	public static double deposit;
	public double withdraw;
	public double transfer;
	
	
	static Scanner input= new Scanner(System.in);
	static double money=input.nextDouble();
	static Transactions trans=new Transactions();
	public Transactions() {
		//Roster.transactionList.add(this);
		//CustomerFile.writeTransactionFile(Roster.transactionList);
	}
	
	public Transactions(int accountNum, double balance, double deposit, double withdraw, double transfer,
			double newBalance, Scanner input, double money, Transactions trans) {
		super();
		Transactions.deposit = deposit;
		this.withdraw = withdraw;
		this.transfer = transfer;
		Transactions.input = input;
		Transactions.money = money;
		Transactions.trans = trans;
		
		//Roster.transactionList.add(this);
		//CustomerFile.writeTransactionFile(Roster.transactionList);
		//LogThis.LogIt("info", "Transaction added to database");
	}


	public static void makeDeposit() {
		System.out.println("How much do you want to deposit?\n$");
		double deposit = input.nextDouble();
		if(deposit < 0) {
			System.out.println("Invalid Input. Perhaps you indended to select withdraw.\nYou'll be redirected back to the previous menu to select new transaction");
			
		} else {
			Accounts.setBalance(Accounts.getBalance()+ deposit);
			LogThis.LogIt("info", Customer.getFirstName() +" "+Customer.getLastName()+" just deposited $"+deposit);
			
		}
			
		System.out.println("New balance: \n$"+Accounts.getBalance());

	}

	public static void makeWithdraw() {
		System.out.println("How much would you like to withdraw?\n$");
		double withdraw=input.nextDouble();
		if(withdraw <0) {
			System.out.println("Invalid Input.");
			makeWithdraw();
		} else if(Accounts.getBalance()<withdraw) {
			System.out.println("Insufficient funds. Your current balance is: $"+Accounts.getBalance());
			makeWithdraw();
			
		} else if(Accounts.getBalance()>=withdraw) {
			Accounts.setBalance(Accounts.getBalance() - withdraw);
			LogThis.LogIt("info", Customer.getFirstName()+" "+Customer.getLastName()+" withdrew $"+withdraw);
		
		
		} 
		else {
			System.out.println("Invalid Input. Redirecting to Customer Menu");
		}
		System.out.println("New balance: \n$"+Accounts.getBalance());
	}
	public static void transferFunds() {
		System.out.println("Enter the account number to transfer money from:");
		int num1 =input.nextInt();
		Accounts a = Roster.findAccount(num1);
		System.out.println("Enter the account number to transfer money to:");
		int num2 =input.nextInt();
		Accounts b = Roster.findAccount(num2);
		System.out.println("How much would you like to transfer?");
		double num3=input.nextDouble();
		
		if(num3 >= 0) {
			Roster.transfer(num1, a, b);
		} else {
			System.out.println("Invalid input");
			transferFunds();
		}
		Menu.customerOptions();
		
		
		
		
		
		
	}


	public static void viewBalance() {
		System.out.println("Balance :$"+Accounts.getBalance());
		Menu.customerOptions();
	}

	public static double getDeposit() {
		return deposit;
	}

	public static void setDeposit(double deposit) {
		Transactions.deposit = deposit;
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

	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		Transactions.input = input;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		Transactions.money = money;
	}

	public Transactions getTrans() {
		return trans;
	}

	public void setTrans(Transactions trans) {
		Transactions.trans = trans;
	}

	
}