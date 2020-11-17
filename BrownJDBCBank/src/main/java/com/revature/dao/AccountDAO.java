package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Accounts;

public interface AccountDAO {

	public List<Accounts> getAllAccounts() throws SQLException;
	public Accounts getAccount(int accountNum) throws SQLException;
	public Accounts makeDeposit(double amount, int accountNum) throws SQLException;
	public Accounts makeWithdraw(double amount, int accountNum) throws SQLException;
	public Accounts getBalance(double balance) throws SQLException;
	public void closeAccount(int accountNum) throws SQLException;
	public void addAccount(Accounts account) throws SQLException;
}
