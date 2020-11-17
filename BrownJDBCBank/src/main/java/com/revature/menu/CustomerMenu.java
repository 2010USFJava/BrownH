package com.revature.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.Accounts;
import com.revature.beans.Customer;
import com.revature.dao.AccountDAO;
import com.revature.dao.CustomerDAO;
import com.revature.daoimpl.AccountsDAOImpl;
import com.revature.daoimpl.CustomerDAOImpl;
import com.revature.util.LogThis;

public class CustomerMenu {
	static int option;
	static Scanner ans = new Scanner(System.in);
	
	public static void customerOptions(Customer c) throws SQLException {
		System.out.println("------------------------------------------------------------------------"
				+ "\nWhat would you like to do?"
				+ "\n 1. View Account Balance"
				+ "\n 2. Deposit"
				+ "\n 3. Withdraw"
				+ "\n 4. Open New Account"
				+ "\n 5. Close Account"
				+ "\n 6. Logout"
				+ "\n------------------------------------------------------------------------");
		option = ans.nextInt();
		switch(option) {
		case 1:
			getAccount();
			customerOptions(c);
			break;
		case 2:
			makeDeposit(); 
			customerOptions(c);
			break;
		case 3:
			makeWithdraw();
			customerOptions(c);
			break;
		case 4:
			openNewAccount();
			customerOptions(c);
			break;
		case 5:
			closeAccount();
			customerOptions(c);
			break;
		case 6:
			Menu.mainMenu();
			break;
			
			default:
				System.out.println("Invalid Input. Try Again");
				customerOptions(c);
				break;
		}
		
		
	}
	public static void addCustomer() {
		System.out.println("Great! Let's get started");

		System.out.println("Please enter your first name:");
		String firstName = ans.next();

		System.out.println("Please enter your last name: ");
		String lastName = ans.next();

		System.out.println("Please enter your social security number with no spaces/dashes");
		int ssn = ans.nextInt();

		System.out.println("Please enter your date of birth in 00/00/0000 format");
		String DOB = ans.next();

		System.out.println("Choose a username:");
		String username = ans.next();

		System.out.println("Choose a password:");
		String password = ans.next();


		Customer a = new Customer(firstName, lastName, ssn, DOB, username, password);
		LogThis.LogIt("info", Customer.getFirstName() + " was added to customer database");
		System.out.println(a.toString());
		CustomerDAO cd = new CustomerDAOImpl();
		try {
			cd.addCustomer(a);
			System.out.println(a.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Registration complete. Please login");
	}
	private static void openNewAccount() {
		System.out.println("Great! Let's get started");

		System.out.println("Please enter the amount you would like to deposit:");
		double balance = ans.nextInt();
		
		Accounts a = new Accounts(balance);
		AccountDAO cd = new AccountsDAOImpl();
		try {
			cd.addAccount(a);
			System.out.println(a.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Account Open");
	}
	public static void closeAccount() {
		System.out.println("Please enter the account number you want to delete:");
		int a=ans.nextInt();
		
		AccountDAO an = new AccountsDAOImpl();
		try {
			an.closeAccount(a);
			System.out.println("Account :"+a+" has been closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		LogThis.LogIt("info", "Account has been deleted");
		
	}
	public static Accounts getAccount() {
		System.out.println("Please verify your account number");
		int accountNum = ans.nextInt();


		Accounts a = new Accounts();
		AccountDAO acc = new AccountsDAOImpl();
		try {
			acc.getAccount(accountNum);
			System.out.println(a.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}
	public static Accounts makeDeposit() {
		System.out.println("How much would you like to deposit?");
		Double amount = ans.nextDouble();
		System.out.println("Please verify your account number");
		int accountNum = ans.nextInt();
		Accounts a =new Accounts();
		AccountDAO acc= new AccountsDAOImpl();
		try {
			acc.makeDeposit(amount, accountNum);
			LogThis.LogIt("info", "$"+amount+" was deposited into account number:"+accountNum);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
		
	}
	public static Accounts makeWithdraw() {
		System.out.println("How much would you like to withdraw");
		Double amount = ans.nextDouble();
		System.out.println("Please verify your account number");
		int accountNum = ans.nextInt();
		Accounts a =new Accounts();
		AccountDAO acc= new AccountsDAOImpl();
		try {
			acc.makeWithdraw(amount, accountNum);
			LogThis.LogIt("info", "$"+amount+" was withdrawn from account number:"+accountNum);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}
}
