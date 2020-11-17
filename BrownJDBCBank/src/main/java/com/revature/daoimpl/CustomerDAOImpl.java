package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Customer;
import com.revature.dao.CustomerDAO;
import com.revature.util.ConnFactory;

public class CustomerDAOImpl implements CustomerDAO {

	public static ConnFactory cf = ConnFactory.getInstance();

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		List<Customer> customerList = new ArrayList<Customer>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from customers");
		Customer a = null;
		while (rs.next()) {
			a = new Customer(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5),
					rs.getString(6));
			customerList.add(a);
		}
		return customerList;
	}

	@Override
	public Customer getCustomerByName(String firstName) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "select * from customers where first_name=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, firstName);
		ResultSet rs = ps.executeQuery();
		Customer a = null;
		while (rs.next()) {
			a = new Customer(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5),
					rs.getString(6));
		}
		return a;
	}

	@Override
	public void updateCustomerLastName(String lastName, int accountNum) {
		ConnFactory.getInstance();
		String sql = "update customers "
				+ "set last_name=? "
				+ "where account_num=?";
	    try (Connection conn = cf.getConnection(); 
	    		PreparedStatement ps = conn.prepareStatement(sql);) {
	      ps.setString(1, lastName);
	      ps.setInt(2, accountNum);
	      ps.executeUpdate();
	      
	      System.out.println("Database updated successfully ");
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	}

	@Override
	public void deleteCustomer(String username) throws SQLException {
		String sql = "DELETE FROM customers WHERE username = ?";
		try (Connection conn = cf.getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setString(1, Customer.getUsername());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addCustomer(Customer c) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "insert into customers values(?,?,?,?,?,?,DEFAULT)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, Customer.getFirstName());
		ps.setString(2, Customer.getLastName());
		ps.setInt(3, Customer.getSsn());
		ps.setString(4, Customer.getDOB());
		ps.setString(5, Customer.getUsername());
		ps.setString(6, Customer.getPassword());
		ps.executeUpdate();
	}
	public Customer checkLogin(Customer c) throws SQLException {
		 Connection conn = cf.getConnection();
        String sql = "select  username, pw from customers where username=? and pw=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, Customer.getUsername());
         ps.setString(2, Customer.getPassword());
         ResultSet rs = ps.executeQuery();
         while (rs.next()) {
        	c=new Customer (rs.getString(1),rs.getString(2));
        	 }
         return c;
         }
	}


