package com.revature.menu;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.Customer;
import com.revature.dao.CustomerDAO;
import com.revature.daoimpl.AccountsDAOImpl;
import com.revature.daoimpl.AdminDAOImpl;
import com.revature.daoimpl.CustomerDAOImpl;
import com.revature.util.ConnFactory;





public class Menu {
	static int option;
	static Scanner ans = new Scanner(System.in);
	static CustomerDAOImpl cdi = new CustomerDAOImpl();
	static AdminDAOImpl adi = new AdminDAOImpl();
	static AccountsDAOImpl bdi = new AccountsDAOImpl();
	static ConnFactory cf = ConnFactory.getInstance();
	static Connection conn = cf.getConnection();
	
	public static void mainMenu()  {
		System.out.println("\n**************************************************************************************"
				+ "\n                                 Welome to Bank 2.0"
				+ "\n**************************************************************************************");
		System.out.println("How can I help you?"
				+ "\nPlease select from the options displayed below"
				+ "\n1. New Customer Registration"
				+ "\n2. Customer Login" 
				+ "\n3. Admin Login" 
				+ "\n**************************************************************************************");
		option = ans.nextInt();
		
		switch (option) {
		case 1:
			CustomerMenu.addCustomer();
			mainMenu();
			break;
		case 2:

			System.out.println("Welcome back!");
			customerLogin();
			break;
		case 3:
			adminLogin();
			AdminMenu.adminFunction();
			mainMenu();
			break;
		default:
			System.out.println("Try again");
			mainMenu();
			break;
		}
	}



	private static void adminLogin() {
		System.out.println("Please enter your username:");
		String username = ans.next();
		System.out.println("Please enter your password:");
		String password = ans.next();
		
	}



	public static void customerLogin()  {
		System.out.println("Please enter your username:");
		String username = ans.next();
		System.out.println("Please enter your password:");
		String password = ans.next();
		//Customer c= new Customer (username, password);
		CustomerDAO cdi = new CustomerDAOImpl();
	        try {
	        	Customer c= new Customer (username, password);
	        	cdi.checkLogin(c);
	     
	                    if(username.equals(username)&&password.equals(password)) {

	                  CustomerMenu.customerOptions(c);


	                }else
	                	System.out.println("Invalid username/password. Try again.");
	                    customerLogin();
	            

	        } catch (SQLException e) {
				e.printStackTrace();
			} 

	    }
}
