package com.revature.beans;

public class Pokemon {

	public int pid;
	public String pname;
	public Pokemon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pokemon(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Pokemon [pid=" + pid + ", pname=" + pname + "]";
	}
	
	
}
