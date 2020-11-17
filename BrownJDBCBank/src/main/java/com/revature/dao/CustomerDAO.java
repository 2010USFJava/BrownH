package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Customer;

public interface CustomerDAO {

	public List<Customer> getAllCustomers() throws SQLException;
	public Customer getCustomerByName(String name) throws SQLException;
	public void addCustomer(Customer customer) throws SQLException;
	public void updateCustomerLastName(String lastName, int accountNum) throws SQLException;
	public void deleteCustomer(String username) throws SQLException;
	public Customer checkLogin(Customer c) throws SQLException;


}
