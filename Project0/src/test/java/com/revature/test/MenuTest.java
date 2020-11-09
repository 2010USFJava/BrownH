package com.revature.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.revature.beans.Accounts;
import com.revature.beans.Accounts.accountType;
import com.revature.beans.Customer;
import com.revature.functions.Transactions;

public class MenuTest {
	@BeforeClass
	public static void intitialSetUp() {
		System.out.println("I run once before everything");
	}
	@Before
	public void runBeforeEachTest() {
		System.out.println("I run before each test");
	}
	@Test
	public void test() {
		assert(true);
	}
	@Test
	public void test2() {
		assertEquals(3,3);
	}
	@Test 
	public void approveAccount() {
	
	}
	@Test
	public void deleteAccount() {

	}
	@Test
	public void transfer() {

	}
	@Test
	public void makeDeposit() {
		
	}
	@Test
	public void makeWithdraw() {
		
	}
	@Test
	public void transferFunds() {
		
	}
	@Test
	public void viewBalance() {
		
	}
	@Test
	public void reviewApplication() {
		
	}
	@Test
	public void viewAccountDetails() {
		
	}
	@Test
	public void selectOption() {
		
	}
	@Test
	public void applyForNewAccount() {
		
	}
	@Test
	public void adminLogin() {
		
	}
	@Test
	public void employeeLogin() {
		
	}
	@Test
	public void customerLogin() {
		
	}
	@Test
	public void employeeFunctions() {
		
	}
	@Test
	public void adminFunctions() {
	}
	@Test
	public void customerOptions() {
		
	}
	@Test
	public void createNewCustomer() {
		
	}
	@Test
	public void addNewEmployee() {
		
	}
	@Test
	public void addNewAdmin() {
		
	}
	@Test
	public void viewCustomerInfo() {
		
	}
	
	@Mock static ArrayList<Accounts> mockRoster;
	
	@Before
	static void viewAccounnt() {
		System.out.println("loading mockRoster");
		Accounts a= new Accounts(accountType.CHECKING,true, 500, 12,null);
		Accounts b= new Accounts(accountType.SAVING,true, 500, 15,null);	
		mockRoster.add(a);
		mockRoster.add(b);
		Mockito.verify(mockRoster).add(a);
		  Mockito.verify(mockRoster).add(b);
		  System.out.println(mockRoster.toString());
	}
}
