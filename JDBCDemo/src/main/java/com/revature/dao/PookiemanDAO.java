package com.revature.dao;

import java.sql.SQLException;

import com.revature.beans.Pookieman;

public interface PookiemanDAO {
//insert 
	public void catchNewPookieman(Pookieman p) throws SQLException;
		
	
	//retrieve by ID
	public Pookieman getPookiemanByID(int id) throws SQLException;
	
}
