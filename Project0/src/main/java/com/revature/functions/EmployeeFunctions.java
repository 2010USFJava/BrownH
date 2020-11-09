package com.revature.functions;

import java.util.Scanner;

import com.revature.beans.Customer;
import com.revature.util.Roster;


public class EmployeeFunctions {
	static int option;
	static Scanner ans = new Scanner(System.in);
	
	public static void reviewApplication() {
		System.out.println(Roster.customerList.toString() + "\n");
		System.out.println("What is the account number of the account you want to approve?");
		int input = ans.nextInt();
		Customer cust = Roster.findByAccount(input);
		Roster.approveAccount(input);
		System.out.println("Account has been approved");
		
	}
}
