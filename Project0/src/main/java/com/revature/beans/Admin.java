package com.revature.beans;

import java.io.Serializable;

import com.revature.util.CustomerFile;
import com.revature.util.LogThis;
import com.revature.util.Roster;

public class Admin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7950979553303052952L;
	public String username;
	public String password;

	
	public Admin() {
		super();
		Roster.aMap.put(username, password);
		CustomerFile.writeAdminMap(Roster.aMap);
		
		 Roster.adminList.add(this);
		 CustomerFile.writeAdminFile(Roster.adminList);
	}

	public Admin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		
		Roster.adminList.add(this);
		CustomerFile.writeAdminFile(Roster.adminList);
		LogThis.LogIt("info", "A new admin login has been added");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Admin [username=" + username + ", password=" + password + "]";
	}
	
	
}


