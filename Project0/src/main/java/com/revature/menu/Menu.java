package com.revature.menu;


import java.util.Scanner;

import com.revature.beans.Accounts;
import com.revature.beans.Accounts.accountType;
import com.revature.beans.Admin;
import com.revature.beans.Customer;
import com.revature.beans.Employee;
import com.revature.functions.Search;
import com.revature.functions.Transactions;

import com.revature.functions.EmployeeFunctions;
import com.revature.util.CustomerFile;
import com.revature.util.LogThis;
import com.revature.util.Roster;

public class Menu {

	static int option;
	static Scanner ans = new Scanner(System.in);

	public static void selectOption() {
		System.out.println("\n-------------------------------------------------------------------------------"
				+ "\nWelome to Basic Bank"
				+ "\n-------------------------------------------------------------------------------");
		System.out.println("How can I help you?" + "\nPlease select from the option displayed below"
				+ "\n1. Apply for a new account" + "\n2. Customer login" + "\n3. Employee login"+"\n4. Admin login"
				+ "\n5. Other");
		option = ans.nextInt();
		switch (option) {
		case 1:
			createNewCustomer();
			applyForNewAccount();
			selectOption();
			break;
		case 2:

			System.out.println("Welcome back!");
			customerLogin();
			customerOptions();
			break;
		case 3:
			System.out.println("Another day, another dollar");
			employeeLogin();
			employeeFunctions();
			break;
		case 4:
			adminLogin();
			adminFunction();
		case 5:
			System.out.println("No other options available. Goodbye!");
			break;
		default:
			System.out.println("Try again");
			selectOption();
			break;
		}

	}

		

	private static void applyForNewAccount() {
		System.out.println("-------------------------------------------------------------------------------"
				+ "\nWhat type of account would you like to open?"+"\n1. Checking"+"\n2. Savings"+"\n3. Joint Account");
		int input =ans.nextInt();
		accountType type = null;
		switch(input) {
		case 1:
			type=accountType.CHECKING;
			new Accounts(type, false,0, Customer.accountNum, null);
			break;
		case 2:
		type=accountType.SAVING;
		new Accounts(type, false,0, Customer.accountNum, null);
		break;
		case 3:
			System.out.println("Enter the username of the customer you would like to share this account with.");
			String customer2 = ans.next();
			type=accountType.JOINT;
			new Accounts(type,false,0, Customer.accountNum, customer2);
			
			break;
		default:
			System.out.println("Invalid Input. Please select an option:"+"\n1. Apply for a new account"+"\n2.Return to main menu");
			input =ans.nextInt();
			switch(input) {
			case 1:
				applyForNewAccount();
				break;
			case 2:
				selectOption();
				break;
			default:
				System.out.println("Invalid Input. Redirecting to main menu");
				selectOption();
			}
			
			
		}
		
		System.out.println("-------------------------------------------------------------------------------"
		+"\nGreat! You've just submitted your application to open a new account."
				+ "\nYour application is under review."
		+"\n-------------------------------------------------------------------------------");
		new Accounts(type, false, 0,Customer.accountNum, null );
		LogThis.LogIt("info", "New application submitted for review");
		System.out.print(Roster.accountList.toString());
	}

	public static void adminLogin() {
		System.out.println("Please enter your username:");
		String username = ans.next();
		System.out.println("Please enter your password:");
		String password = ans.next();
		if (Roster.findAUsername(username) !=null) {
			if(Roster.findAPassword(password) !=null) {
			System.out.println("Login Succesful");
			adminFunction();
		} else {
			System.out.println("Invalid password");
			adminFunction();
		}
			

	}
		else {
			System.out.println("Invalid username");
			adminLogin();
		}
	}
	public static void employeeLogin() {
		System.out.println("Please enter your username:");
		String username = ans.next();
		System.out.println("Please enter your password:");
		String password = ans.next();
		if (Roster.findEmpUsername(username) !=null) {
			if(Roster.findEmpPassword(password) !=null) {
			System.out.println("Login Succesful");
			employeeFunctions();
		} else {
			System.out.println("Invalid password");
			employeeFunctions();
		}
			

	}
		else {
			System.out.println("Invalid username");
			employeeLogin();
		}
	}

	public static void createNewCustomer() {
		System.out.println("Great! Let's get started");

		System.out.println("Please enter your first name:");
		String firstName = ans.next();

		System.out.println("Please enter your last name: ");
		String lastName = ans.next();

		System.out.println("Choose a username:");
		String username = ans.next();
		if (Roster.umap.containsKey(username) == true) {
			System.out.println("Username is taken. Try again");
			createNewCustomer();
		} else {
			System.out.println("Username available");
		}
		System.out.println("Choose a password:");
		String password = ans.next();

		System.out.println("You will be assigned an account number");
		int accountNum = getUniqueAccountNum();
		System.out.println("Your new account number is "+accountNum);
		boolean approved=false;
		Customer a = new Customer(firstName, lastName, username, password, accountNum, approved);
		LogThis.LogIt("info", Customer.getFirstName() + " was added to customer database");
		System.out.println(Roster.customerList.toString());

	}

	public static int nextAccountNum = 1;

	private static int getUniqueAccountNum() {
		int accountNum = nextAccountNum;
		nextAccountNum++;

		return accountNum;
	}

	public static void employeeFunctions() {
		System.out.println("Please choose an option:" + "\n1. Approve/Deny applications"
				+ "\n2. View customer information");
		option = ans.nextInt();
		switch (option) {
		case 1:
			EmployeeFunctions.reviewApplication();
			employeeFunctions();
			break;
		case 2:
			viewCustomerInfo();
			employeeFunctions();
			break;
		case 3:
			adminFunction();
			break;
		default:
			System.out.println("Invalid Input. Try Again");
			employeeFunctions();
			break;

		}

	}

	public static void adminFunction() {
		System.out.println("Please choose an option:" + "\n1. Delete Customer Account" + "\n2. Employee Function Menu"
				+ "\n3. Add new employee"+"\n4. Add new admin"+"\n5. Customer Fuctions"+"\n6. Logout");
		option = ans.nextInt();
		switch (option) {
		case 1:
			deleteAccount();
			break;
		case 2:
			employeeFunctions();
			adminFunction();
			break;
		case 3:
			addNewEmployee();
			adminFunction();
			break;
		case 4:	
			addNewAdmin();
			adminFunction();
			break;	
		case 5:
			customerOptions();
			break;
		case 6:
			selectOption();
			break;
		default:
			System.out.println("Invalid Input. Try again");
			adminFunction();
			break;

		}

		
		
	}

	private static void addNewEmployee() {
		System.out.println("Enter a username:");
		String username=ans.next();
		if (Roster.empMap.containsKey(username) == true) {
			System.out.println("Username is taken. Try again");
			addNewEmployee();
		} else {
			System.out.println("Username available");
		}
		System.out.println("Choose a password:");
		String password = ans.next();
		Employee a = new Employee(username, password);
		LogThis.LogIt("info", "New Employee login was created");
		System.out.println(Roster.employeeList.toString());

		
		
	}
	private static void addNewAdmin() {
		System.out.println("Enter a username:");
		String username=ans.next();
		if (Roster.empMap.containsKey(username) == true) {
			System.out.println("Username is taken. Try again");
			addNewEmployee();
		} else {
			System.out.println("Username available");
		}
		System.out.println("Choose a password:");
		String password = ans.next();
		
		Admin a= new Admin(username, password);
		LogThis.LogIt("info", "New Admin login was created");
		System.out.println(Roster.adminList.toString());

		
		
	}

	private static void deleteAccount() {
		
		System.out.println("Please enter the account number of the account you want to delete:");
		int a=ans.nextInt();
		Customer A = Roster.findByAccount(a);
		Roster.deleteAccount(A);
		CustomerFile.writeCustomerFile(Roster.customerList);
		LogThis.LogIt("info", "Account has been deleted");
		
	}

	public static void viewCustomerInfo() {
		System.out.println("Please enter customer name");
		String first = ans.next();
		Customer a = Roster.findCustomerByName(first);
		// Log.LogIt("info", a.getName()+" was searched");
		Search search = new Search();
		search.viewCustomerDetails(a);
		System.out.println("Customer name: " + Customer.getFirstName() + Customer.getLastName() + "\nCustomer Username: "
				+ a.getUsername() + "\nCustomer Password: " + a.getPassword() + "\nApprove: "+Customer.isApproved());

		System.out.println("Would you like to search again?" + "\na. yes" + "\nb. no");
		String input = ans.next();
		switch (input.toLowerCase()) {
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

	public static void customerOptions() {
		
		System.out.println(
				"Please choose an option:" + "\na. View Balance" + "\nb. Deposit" + "\nc. Withdraw" + "\nd. Transfer"+"\ne. Return to Main Menu");
		String input = ans.next();
		switch (input.toLowerCase()) {
		case "a":
			Transactions.viewBalance();
			customerOptions();
			break;
		case "b":
			Transactions.makeDeposit();
			customerOptions();
			break;
		case "c":
			Transactions.makeWithdraw();
			customerOptions();
			break;
		case "d":
			Transactions.transferFunds();
			break;
		case "e":
			selectOption();
			break;
		default:
			System.out.println("Invalid Input. Try Again");
			customerOptions();
			break;
		}
	}

	public static void customerLogin() {
		System.out.println("Please enter your username:");
		String username = ans.next();
		System.out.println("Please enter your password:");
		String password = ans.next();
		if (Roster.findUsername(username) !=null) {
			if(Roster.findPassword(password) !=null) {
			System.out.println("Login Succesful");
			customerOptions();
		} else {
			System.out.println("Invalid password");
			customerLogin();
		}
			

	}
		else {
			System.out.println("Invalid username");
			customerLogin();
		}
	}
	
}
