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
	
	static Customer a;
	static Customer b;
	static Accounts acc1;
	static Accounts acc2;
	@Mock static ArrayList<Customer> mockRoster;
	@Mock static ArrayList<Accounts> mockRoster2;
	@Before
	static void viewAccounnt() {
		System.out.println("loading mockRoster");
		a = new Customer("John","Doe","jdoe", "1234", 1, true);
		b = new Customer("Jane","Doe","jdoe", "1234", 2, true);
		acc1 = new Accounts(accountType.CHECKING,true, 500, 12,null);
		acc2 = new Accounts(accountType.SAVING,true, 500, 15,null);	
		mockRoster.add(a);
		mockRoster.add(b);
		Mockito.verify(mockRoster).add(a);
		  Mockito.verify(mockRoster).add(b);
		  Mockito.verify(mockRoster2).add(acc1);
		  Mockito.verify(mockRoster2).add(acc2);
		  System.out.println(mockRoster.toString());
		  System.out.println(mockRoster2.toString());
	}
	
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
	
	
}
