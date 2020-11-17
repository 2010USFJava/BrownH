package com.revature.dao;

import java.sql.SQLException;

import com.revature.beans.Admin;

public interface AdminDAO {

	//public Admin getAdmin(String username) throws SQLException;
	public void addAdmin(Admin admin) throws SQLException;
	public void deleteAdmin(Admin admin) throws SQLException;
	
}
