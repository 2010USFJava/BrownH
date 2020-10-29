package BankingApp;

import java.util.Scanner;

public class User {

	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private int accountNum;
	
	Scanner in = new Scanner(System.in);
			String ans=in.nextLine();
	public User() {
				
	}
	
	public User(String firstName,String lastName,String username,String password, int accountNum) {
		this.firstName= firstName;
		this.lastName= lastName;
		this.username= username;
		this.password= password;
		this.accountNum= accountNum;
	}
	public void createNewCustomer() {
		System.out.println("Choose a username:"); 
		User apply = new User();
		ans=apply.getUsername();
		apply.setUsername(ans);
		Account.createAccountNum();
		in.next();
		
		System.out.println("Choose a password:");
		ans=apply.getPassword();
		apply.setPassword(ans);
		in.next();
		
		User customer= new User();
		System.out.println("Welcome. Please enter your first name:");
		ans=customer.getFirstName();
		customer.setFirstName(ans);
		in.next();
		
		System.out.println("Welcome "+firstName+"! Please enter your last name: ");
		ans=customer.getLastName();
		customer.setLastName(ans);
		
		
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", password="
				+ password + ", accountNum=" + accountNum + ", in=" + in + ", ans=" + ans + "]";
	}



	
}
