package com.revature.menu;

import java.util.Scanner;


import com.revature.beans.States;
import com.revature.functions.Search;
import com.revature.util.LogThis;
import com.revature.util.Roster;

public class Menu {
 static Scanner input=new Scanner(System.in);
		 public static void mainMenu() {
	 System.out.println("Welcome! Please select an option"
				+ "\na. Create New State"
				+ "\nb. View State details"
				+ "\nc. Exit");
	 String ans=input.nextLine();
		switch(ans.toLowerCase()) {
		case "a":
			createState();
			mainMenu();
			break;
		case "b":
			viewState();
			mainMenu();
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
		private static void viewState() {
			System.out.println("Enter the name of the state");
			String first=input.nextLine();
			States a=Roster.findStateByName(first);
			Search search= new Search();
			search.searchDetails(a);
			LogThis.LogIt("info", a.getName()+" was searched");
			System.out.println("State name: "+a.getName()
					+"\nState Capital: "+a.getCapital()
					+"\nState Population: "+a.getPopulation());
			System.out.println("Would you like to search again?"
					+ "\na. yes"
					+ "\nb. no");
			String ans=input.nextLine();
					switch(ans.toLowerCase()) {
					case "a":
						viewState();
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
		private static void createState() {
			System.out.println("Create New State"
					+ "\n Please enter the name of the State");
			String stateName=input.nextLine();
			System.out.println("Please enter the States Capital");
			String stateCapital=input.nextLine();
			System.out.println("Please enter the States population");
			int population=Integer.parseInt(input.nextLine());
			
			States a= new States(stateName, stateCapital, population);
			LogThis.LogIt("info", a.getName()+ " was added");
			System.out.println(Roster.stateList.toString());
			System.out.println("New state added. You will be redirected back to the main menu");
			}
		
		 
}
