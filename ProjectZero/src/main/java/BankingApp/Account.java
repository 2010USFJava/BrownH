package BankingApp;

public class Account {
	
	private int accountNum;
	private double balance;
	
	public Account() {
	}
	public Account(int accountNum, double balance) {
		this.setAccountNum(accountNum);
		this.setBalance(balance);
	}
	public long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
}

