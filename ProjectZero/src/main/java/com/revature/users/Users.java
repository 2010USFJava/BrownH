package com.revature.users;

public class Users {
	public String username;
	public String password;
	public String accessType;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String username, String password, String accessType) {
		super();
		this.username = username;
		this.password = password;
		this.accessType = accessType;
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
	public String getAccessType() {
		return accessType;
	}
	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}
	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + ", accessType=" + accessType + "]";
	}
	
	
}
