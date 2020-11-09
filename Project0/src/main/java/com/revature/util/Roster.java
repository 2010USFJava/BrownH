package com.revature.util;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

import com.revature.beans.Accounts;
import com.revature.beans.Admin;
import com.revature.beans.Customer;
import com.revature.beans.Employee;
//import com.revature.functions.Transactions;
import com.revature.menu.Menu;

public class Roster {
	public static List<Customer> customerList = new ArrayList<Customer>();
	public static List<Employee> employeeList = new ArrayList<Employee>();
	public static Map<String, String> umap = new HashMap<>();
	public static Map<String, String> empMap = new HashMap<>();
	public static List<Accounts> accountList = new ArrayList<>();
	public static List<Admin> adminList = new ArrayList<Admin>();
	public static Map<String, String> aMap = new HashMap<>();

	public static Customer findCustomerByName(String first) {
		for (int i = 0; i < customerList.size(); i++) {
			customerList.get(i);
			String name = Customer.getFirstName();
			if (first.equals(name)) {
				return customerList.get(i);
			}
		}
		System.out.println("Customer not found");
		Menu.selectOption();
		return null;
	}

	public static Accounts deleteAccount(int a) {
		for (int i = 0; i < accountList.size(); i++) {
			accountList.get(a);
			int num = Accounts.getAccountNum();
			if (a == num) {
				accountList.remove(a);
				System.out.println("Account Deleted");
				Menu.adminFunction();
			}
		}
		System.out.println("Account not found");
		Menu.adminFunction();
		return null;
	}

	public static Accounts findAccount(Integer num) {
		for (int i = 0; i < accountList().size(); i++) {
			accountList.get(i);
			Integer accountNum = Accounts.getAccountNum();
			if (num == accountNum) {
				return accountList().get(i);

			}

		}
		System.out.println("Account not found");
		Menu.selectOption();
		return null;

	}

	public static Customer findUsername(String username) {
		for (int i = 0; i < customerList.size(); i++) {
			String user = customerList.get(i).getUsername();
			if (username.equals(user)) {
				return customerList.get(i);
			}
		}
		System.out.println("Customer not found");
		Menu.selectOption();
		return null;
	}

	public static Admin findAUsername(String username) {
		for (int i = 0; i < adminList.size(); i++) {
			String user = adminList.get(i).getUsername();
			if (username.equals(user)) {
				return adminList.get(i);
			}
		}
		System.out.println("Admin not found");
		Menu.selectOption();
		return null;
	}

	public static Employee findEmpUsername(String username) {
		for (int i = 0; i < employeeList.size(); i++) {
			String user = employeeList.get(i).getUsername();
			if (username.equals(user)) {
				return employeeList.get(i);
			}
		}
		System.out.println("Employee not found");
		Menu.selectOption();
		return null;
	}

	public static Customer findPassword(String password) {
		for (int i = 0; i < customerList.size(); i++) {
			String pw = customerList.get(i).getPassword();
			if (password.equals(pw)) {
				return customerList.get(i);
			}

		}
		System.out.println("Customer not found");
		Menu.selectOption();
		return null;
	}

	public static Admin findAPassword(String password) {
		for (int i = 0; i < adminList.size(); i++) {
			String pw = adminList.get(i).getPassword();
			if (password.equals(pw)) {
				return adminList.get(i);
			}

		}
		System.out.println("Admin not found");
		Menu.selectOption();
		return null;
	}

	public static Employee findEmpPassword(String password) {
		for (int i = 0; i < employeeList.size(); i++) {
			String pw = employeeList.get(i).getPassword();
			if (password.equals(pw)) {
				return employeeList.get(i);
			}

		}
		System.out.println("Employee not found");
		Menu.selectOption();
		return null;
	}

	public static Customer findByAccount(int num) {
		for (int i = 0; i < customerList.size(); i++) {
			customerList.get(i);
			int an = Customer.getAccountNum();
			if (num == an) {
				return customerList.get(i);
			}

		}
		System.out.println("Account not found");
		Menu.adminFunction();
		return null;
	}

	private static List<Accounts> accountList() {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean deleteAccount(Customer a) {
		return customerList.remove(a);
	}

	public static void approveAccount(int input) {
		for (int i = 0; i < customerList.size(); i++) {
			customerList.get(i);
			int anum = Customer.getAccountNum();
			if (input == anum) {
				customerList.get(i);
				Customer.setApproved(true);
			}
			CustomerFile.writeCustomerFile(Roster.customerList);

		}

	}

	public static void transfer(int num1, Accounts a, Accounts b) {
		double aBalance= Accounts.getBalance();
		double bBalance= Accounts.getBalance();
		if(aBalance<=num1) {
			System.out.println("You do not have enough to transfer");
			Menu.customerOptions();
		} else {
			double newBalance = aBalance - num1;
			Accounts.setBalance(newBalance);
			Accounts.setBalance(bBalance+num1);
			System.out.println("Transfer complete");
			CustomerFile.writeAccountList(Roster.accountList);
			}
		}
		
		
	}

	
