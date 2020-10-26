package BankingApp;
import java.util.Scanner;

public class Login {
	@SuppressWarnings("resource")
	public static void main(String [] args) {

		Scanner User = new Scanner(System.in);
		System.out.println("Enter username");
		
		String username = User.nextLine();
		System.out.println("Welcome" + username);
		
	}
}
