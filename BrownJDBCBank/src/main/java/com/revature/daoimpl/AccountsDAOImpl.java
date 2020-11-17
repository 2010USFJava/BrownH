package com.revature.daoimpl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Accounts;
import com.revature.dao.AccountDAO;
import com.revature.util.ConnFactory;

public class AccountsDAOImpl implements AccountDAO {

		public static ConnFactory cf=ConnFactory.getInstance();
		@Override
		public List<Accounts> getAllAccounts() throws SQLException {
			List<Accounts> accountList= new ArrayList<Accounts>();
			Connection conn= cf.getConnection();
			Statement stmt= conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from accounts");
			Accounts a=null; 
			while(rs.next()) {
				a= new Accounts();
				accountList.add(a);
			}
			return accountList;
		}

	@Override
	public Accounts getAccount(int accountNum) throws SQLException {
		Connection conn=cf.getConnection();
		String sql = "select * from accounts where account_num=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, accountNum);
		ResultSet rs=ps.executeQuery();
		Accounts a=null;
		while(rs.next()) {
			a=new Accounts(rs.getInt(1),rs.getDouble(2));
		}
		return a;
	}

	@Override
	public Accounts makeDeposit(double amount, int accountNum) throws SQLException {
		Connection conn=cf.getConnection();
		Accounts a= new Accounts();
		double balance =a.getBalance();
		if(amount>0) {
			double updateBalance = balance+amount;
			if(updateBalance<0) {
				System.out.println("You cant do that");
		} else {
			System.out.println("Deposit Successful. New Balance:"+updateBalance);
			a.setBalance(updateBalance);
			String sql="update accounts set balance =? where account_num=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, accountNum);
			ps.setDouble(2, updateBalance);
			ps.executeUpdate();
			return a;
			
			
		}
		} else {
			System.out.println("Invalid Input. Try again.");
		}
		return null;
		
	}

	@Override
	public Accounts makeWithdraw(double amount, int accountNum) throws SQLException{
		Connection conn=cf.getConnection();
		Accounts a =new Accounts();
		double balance =a.getBalance();
		if(amount>0) {
			double updateBalance = balance-amount;
			if(updateBalance<0) {
				System.out.println("You dont have enough funds to withdraw "+amount+"Your current balance is "+a.getBalance());
		} else {
			System.out.println("Withdraw Successful. New Balance:"+updateBalance);
			a.setBalance(updateBalance);
			String sql="update accounts set balance =? where account_num=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, accountNum);
			ps.setDouble(2, updateBalance);
			ps.executeUpdate();
			return a;
			
			
		}
		} else {
			System.out.println("Invalid Input. Try again.");
		}
		return null;
		
		
	}



	@Override
	public Accounts getBalance(double balance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void closeAccount(int accountNum) throws SQLException {
		String sql = "DELETE FROM accounts WHERE account_num = ?";
		try (Connection conn = cf.getConnection(); 
				PreparedStatement ps = conn.prepareStatement(sql); ) {
			ps.setLong(1, Accounts.getAccountNum());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

	@Override
	public void addAccount(Accounts account) throws SQLException {
		Connection conn=cf.getConnection();
		String sql="insert into accounts values(DEFAULT,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setDouble(1, account.getBalance());
		ps.executeUpdate();
	}

}

