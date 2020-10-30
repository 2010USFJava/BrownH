package com.revature.users;
import java.util.Scanner;

public class Login extends Customers{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7293701364525481737L;

	public static void main(String [] args) {
		selectOption();
}
	static int option;
	static Scanner login = new Scanner(System.in);
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
			option = login.nextInt();
			switch(option) {
			case 1: 
				System.out.println("Great! Let's get started");
				createNewCustomer();
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
		ans=user.getUsername();
		user.setUsername(ans);
		in.next();
		
		System.out.println("Please enter your password:");
		ans=user.getPassword();
		user.setPassword(ans);
		in.next();
		
	}


}
