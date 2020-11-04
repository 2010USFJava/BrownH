package com.revature.menu;

import java.util.Scanner;

import com.revature.function.Actions;
import com.revature.function.Search;
import com.revature.users.Account;
import com.revature.users.Customers;
import com.revature.util.Log;
import com.revature.util.Records;


public class Menu {
	static Account account= new Account();
	static Actions trans= new Actions();
	static int option;
	static Scanner ans = new Scanner(System.in);
		public static void selectOption() {
			System.out.println("How can I help you?"
					+ "\nPlease select from the option displayed below"
					+ "\n1. Apply for a new account"
					+ "\n2. Customer login"
					+ "\n3. Employee login"
					+ "\n4. Admin login"
					+ "\n5. Other");
			option = ans.nextInt();
			switch(option) {
			case 1: 
				createNewCustomer();
				
				selectOption();
				break;
			case 2:
				userLogin();
				transactions();
				System.out.println("Welcome back!");
				break;
			case 3:
				System.out.println("Another day, another dollar");
				userLogin();
				System.out.println("login successful. Employee access level granted");
				employeeFunctions();
				break;
			case 4:
				System.out.println("Cha-Ching!");
				userLogin();
				System.out.println("login successful. Admin access level granted");
				break;
			case 5:
				System.out.println("No other options available. Goodbye!");
				break;
				default: 
					System.out.println("Try again");
			}
		
	}
		private static void transactions() {
			System.out.println("What would you like to do?"
					+ "\n1. Check Balance"
					+ "\n2. Make a Deposit"
					+ "\n3. Withdraw"
					+ "\n4. Logout");
			switch(option) {
			case 1:
			Account.getBalance();
			break;
			case 2:
				trans.makeDeposit();
			case 3:
				trans.makeWithdraw();
				default:
					System.out.println("Invalid Input");
			}	
			}
		public static void userLogin() {
		String username;
		String password;
		
		System.out.println("Please enter your username:");
		username=ans.next();
		System.out.println("Please enter your password:");
		password=ans.next();
		if(username.equals(username)&& password.equals(password))
			System.out.println("Login Succesful");
		
		
	}
		public static void createNewCustomer() {
			System.out.println("Great! Let's get started");
			
			System.out.println("Please enter your first name:");
			String firstName=ans.next();
			
			System.out.println("Please enter your last name: ");
			String lastName=ans.next();
			
			System.out.println("Choose a username:"); 
			String username=ans.next();
			
			System.out.println("Choose a password:");
			String password=ans.next();
			
			System.out.println("You've created a new account. Here is your new account number");
			String accountNum=ans.next();
			
			Customers a= new Customers(firstName,lastName,username,password,accountNum);
			Log.LogIt("info", a.getFirstName()+" was added to customer database");
			System.out.println("Great! You've just created a new account."
					+ "\nYou will be redirected back to the main menu to login");
	
		
			
		}
		public static void employeeFunctions() {
			System.out.println("Please choose an option:"
					+ "\n1. Approve/Deny applications"
					+ "\n2. View customer information");
			option=ans.nextInt();
			switch(option) {
			case 1: 
				//create approve/deny method
				employeeFunctions();
				break;
			case 2: 
				viewCustomerInfo();
				employeeFunctions();
				break;
			}
			
		}
		public static void viewCustomerInfo() {
			System.out.println("Please enter customer name");
			String first=ans.next();
			Customers a=Records.findCustomerByName(first);
			Search search=new Search();
			search.viewCustomerDetails(a);
			//Log.LogIt("info", a.getName()+" was searched");
			System.out.println("Customer name: "+a.getFirstName() + a.getLastName()
			+"\nCustomer Username: "+a.getUsername()
			+"\nCustomer Password: "+a.getPassword()
			+"\nCustomer Account Numer: "+a.getAccountNum());
	System.out.println("Would you like to search again?"
			+ "\na. yes"
			+ "\nb. no");
	String input=ans.nextLine();
			switch(input.toLowerCase()) {
			case "a":
				viewCustomerInfo();
				break;
			case "b":
				selectOption();
				break;
				default:
				System.out.println("Invalid input. Redirecting to main menu");
				selectOption();
				break;
				
			}
		}
}

		

