package com.revature.beans;

import java.io.Serializable;

import com.revature.util.CustomerFile;
import com.revature.util.LogThis;
import com.revature.util.Roster;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9034860264018131186L;
	public String username;
	public String password;

	
	public Employee() {
		super();
		Roster.empMap.put(username, password);
		CustomerFile.writeEmployeeMap(Roster.empMap);
		
		 Roster.employeeList.add(this);
		 CustomerFile.writeEmployeeFile(Roster.employeeList);
	}

	public Employee(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		
		
		Roster.employeeList.add(this);
		CustomerFile.writeEmployeeFile(Roster.employeeList);
		LogThis.LogIt("info", "A new employee login has been added");
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
		return "Employee [username=" + username + ", password=" + password + "]";
	}
	
	
}
