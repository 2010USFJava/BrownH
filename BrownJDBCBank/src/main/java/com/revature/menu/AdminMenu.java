package com.revature.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.Customer;
import com.revature.dao.CustomerDAO;
import com.revature.daoimpl.CustomerDAOImpl;
import com.revature.util.LogThis;

public class AdminMenu {
	static int option;
	static Scanner ans = new Scanner(System.in);
	
	public static void adminFunction() {
		System.out.println("Please choose an option:" 
				+ "\n1. View Customer Information" 
				+ "\n2. Create New User"
				+ "\n3. Update Last Name Existing User" 
				+ "\n4. Delete User");
		option = ans.nextInt();
		switch (option) {
		case 1:
			getCustomerByName();
			adminFunction();
			break;
		case 2:
			CustomerMenu.addCustomer();
			adminFunction();
			break;
		case 3:
			updateCustomer();
			break;
		case 4:
			deleteCustomer();
			adminFunction();
			break;
		default:
			System.out.println("Invalid Input. Try Again");
			adminFunction();
			break;

		}

	}
	private static void updateCustomer() {

		System.out.println("Please enter your last name: ");
		String lastName = ans.next();
		
		System.out.println("Enter the account number to update customer information");
		int accountNum = ans.nextInt();


		Customer a = new Customer(lastName,accountNum);
		LogThis.LogIt("info", Customer.getFirstName() + " was updated in customer database");
		System.out.println(a.toString());
		CustomerDAO cd = new CustomerDAOImpl();
		try {
			cd.updateCustomerLastName(lastName, accountNum);
			System.out.println(a.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Update complete.");
	
	}
	public static Customer getCustomerByName() {
		System.out.println("Enter the name of the customer you want to view.");
		String name = ans.next();


		Customer a = new Customer();
		CustomerDAO cd = new CustomerDAOImpl();
		try {
			cd.getCustomerByName(name);
			System.out.println(a.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}
	public static void deleteCustomer() {
		
		System.out.println("Please enter the username of the customer you want to delete:");
		String a=ans.next();
		
		CustomerDAO cd = new CustomerDAOImpl();
		try {
			//Customer a = new Customer();
			cd.deleteCustomer(a);
			System.out.println(a.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		LogThis.LogIt("info", "Customer has been deleted");
		
	}
}
