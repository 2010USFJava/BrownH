package com.revature.menu;

import java.util.Random;
import java.util.Scanner;

import com.revature.users.Customers;
import com.revature.util.Log;
import com.revature.util.Records;


public class Menu {

	static int option;
	static Scanner ans = new Scanner(System.in);
		public static void selectOption() {
			System.out.println("How can I help you?"
					+ "\nPlease select from the option displayed below"
					+ "\n1. Apply for a new account"
					+ "\n2. Customer login"
					+ "\n3. Quick Deposit"
					+ "\n4. Quick Withdrawal"
					+ "\n5. Employee login"
					+ "\n6. Admin login"
					+ "\n7. Other");
			option = ans.nextInt();
			switch(option) {
			case 1: 
				createNewCustomer();
				
				selectOption();
				break;
			case 2:
				userLogin();
				System.out.println("Welcome back!");
				break;
			case 3:
				System.out.println("It's a great day to save money!");
			case 4:
				System.out.println("Going Shopping?");
			case 5:
				System.out.println("Another day, another dollar");
				userLogin();
				System.out.println("login successful. Employee access level granted");
				employeeFunctions();
				break;
			case 6:
				System.out.println("Cha-Ching!");
				userLogin();
				System.out.println("login successful. Admin access level granted");
				break;
			case 7:
				System.out.println("No other options available. Goodbye!");
				break;
				default: 
					System.out.println("Try again");
			}
		
	}
		public static void userLogin() {
		Menu user= new Menu();
		System.out.println("Please enter your username:");
		String username=ans.next();
		
		
		System.out.println("Please enter your password:");
		String password=ans.next();
		
		
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
			
			System.out.println("You will be assigned an Account Number");
			Random accountNum = new Random();
			
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
			
		}



}
