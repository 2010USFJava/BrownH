package com.revature.test;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.beans.Accounts;
import com.revature.beans.Customer;
import com.revature.dao.CustomerDAO;
import com.revature.daoimpl.CustomerDAOImpl;

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
	public void updateLastName() throws SQLException {
		CustomerDAO cdi = new CustomerDAOImpl();
		Customer c = cdi.getCustomerByName("Hannah");
		c.setLastName("Stegemeier");
		@SuppressWarnings("static-access")
		String result = c.getLastName();
		assertEquals(result,"Stegemeier");
		
	}
	@Test
	public void deleteRow() throws SQLException {
		//CustomerDAO cdi = new CustomerDAOImpl();
		//Customer c = cdi.deleteCustomer(null);
		//String result = c.toString();
		//assertEquals(result, null);
	}
	@SuppressWarnings("deprecation")
	@Test
	public void testDeposit() {
		Accounts a = new Accounts(20,5000);
		double deposit = 200;
		double updateBalance= deposit+a.getBalance();
		a.setBalance(updateBalance);
		double expected = 5200;
		double actual = updateBalance;
		assertEquals(expected, actual);
		
		
	}
	
}

