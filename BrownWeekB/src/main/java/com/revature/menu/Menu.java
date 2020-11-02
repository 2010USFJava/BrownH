package com.revature.menu;

import java.util.Scanner;

import com.revature.beans.Company;
import com.revature.service.Search;
import com.revature.util.LogThis;
import com.revature.util.Roster;

public class Menu {
	static Scanner scan=new Scanner(System.in);
	public static void mainMenu() {
		System.out.println("Welcome! Please select an option"
				+ "\na. Create New Company"
				+ "\nb. View company details"
				+ "\nc. Exit");
		String ans=scan.nextLine();
		switch(ans.toLowerCase()) {
		case "a":
			createMenu();
			mainMenu();
			break;
		case "b":
			searchMenu();
			break;
		case "c":
			System.out.println("Goodbye.");
			break;
		default:
				System.out.println("Invalid Input");
				mainMenu();
				break;
		}
	}
	public static void createMenu() {
		System.out.println("Create New Company"
				+ "\n Please enter the name of the Company");
		String companyName=scan.nextLine();
		System.out.println("Please enter Company's location");
		String companyLocation=scan.nextLine();
		System.out.println("Please enter the number of employees the company employs");
		int companyNumOfEmployees=Integer.parseInt(scan.nextLine());
		System.out.println("Please enter the number of departments the company contains");
		int companyNumOfDepartments= Integer.parseInt(scan.nextLine());
		
		Company a= new Company(companyName,companyLocation,companyNumOfEmployees,companyNumOfDepartments);
		LogThis.LogIt("info", a.getName()+ " was added");
		System.out.println(Roster.companyList.toString());
		System.out.println("New company added. You will be redirected back to the main menu");
		
	}
	public static void searchMenu() {
		System.out.println("Enter the name of the company");
			String first=scan.nextLine();
			Company a=Roster.findCompanyByName(first);
			Search search= new Search();
			search.searchDetails(a);
			//LogThis.LogIt("info", a.getName()+" was searched");
			System.out.println("Company name: "+a.getName()
					+"\nCompany Location: "+a.getLocation()
					+"\nNumber of Employees: "+a.getNumOfEmployees()
					+"\nNumber of Departments: "+a.getNumOfDepartments());
			System.out.println("Would you like to search again?"
					+ "\na. yes"
					+ "\nb. no");
			String input=scan.nextLine();
					switch(input.toLowerCase()) {
					case "a":
						searchMenu();
						break;
					case "b":
						mainMenu();
						break;
						default:
						System.out.println("Invalid input. Redirecting to main menu");
						mainMenu();
						break;
					}
	}
	
}
