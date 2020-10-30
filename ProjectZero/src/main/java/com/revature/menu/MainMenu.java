package com.revature.menu;

import java.util.Scanner;

import com.revature.util.Log;
import com.revature.users.*;
public class MainMenu {
	/**
	 * 
	 */
	public static void main(String [] args) {
		selectOption();
}
	private static final long serialVersionUID = -1602490447432325939L;
	static int option;
	static Scanner ans = new Scanner(System.in);
		private static void selectOption() {
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
				System.out.println("Great! Let's get started");
				createNewCustomer();
				System.out.println("You are being redirected back to the main menu to login");
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
		Login user= new Login();
		System.out.println("Please enter your username:");
		String username=ans.nextLine();
		
		
		System.out.println("Please enter your password:");
		String password=ans.nextLine();
		
	}
		public static void createNewCustomer() {
			Customers customer= new Customers();
			System.out.println("Please enter your first name:");
			String firstName=ans.nextLine();
			
			
			System.out.println("Please enter your last name: ");
			String lastName=ans.nextLine();
			
			System.out.println("Choose a username:"); 
			Customers apply = new Customers();
			String username=ans.nextLine();
			
			System.out.println("Choose a password:");
			String password=ans.nextLine();
			
			System.out.println("You will be assigned an Account Number");
			int accountNum= new int ;
			
			Customers a= new Customers(firstName,lastName,username,password, int);
			Log.LogIt("info", a.getFirstName()+" was added to customer database");
			System.out.println("Great! You've just created a new account."
					+ "You will be redirected back to the main menu to login");
			selectOption();
			break;
			
		}



}
