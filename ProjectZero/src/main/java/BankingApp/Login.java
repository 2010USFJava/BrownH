package BankingApp;
import java.util.Scanner;

public class Login {
	static Scanner login = new Scanner(System.in);
	public static void main(String [] args) {

		String name;

		System.out.println("Welcome New Customer!");
		System.out.println("Please enter your name");
		name=login.nextLine();
		System.out.println("Welcome " + name);
}
		private static void selectOption() {
			System.out.println("How can I help you? "
					+ "Please select from the option displayed below"
					+ "1. Create anew Account"
					+ "2. Login"
					+ "3. Quick Deposit"
					+ "4. Quick Withdrawal"
					+ "5. Employee login"
					+ "6. Admin login"
					+ "7. Other");
		
	}
	public void runLoginOptions() {
		selectOption();
		int option = input();
		optionSelected(option);
		
	
		
	}
	private int input() {
		// TODO Auto-generated method stub
		int option = -1;
				do {
					System.out.println("Enter number: ");
					try { 
						option = Integer.parseInt(login.nextLine());	
					}
					catch(NumberFormatException e) {
						System.out.println("Invalid Input");
						
					}
					if(option < 1 || option > 7) {
						System.out.println("That is not an avaiable option");
						
					}
				}
				while(option <=1 || option >= 7);
				
	
		return option;
	}
	
	private static void optionSelected(int option) {
		switch(option) {
		case 1:
			System.out.println("Great! Let's get started");
		case 2:
			System.out.println("Welcome back!");
		case 3:
			System.out.println("It's a great day to save money!");
		case 4:
			System.out.println("Going Shopping?");
		case 5:
			System.out.println("Another day, another dollar");
		case 6:
			System.out.println("Cha-Ching!");
		case 7:
			System.out.println("Goodbye!");
		}
	}

}
