package com.revature.driver;

import com.revature.menu.Menu;
import com.revature.util.CustomerFile;

public class Driver {
	
	static {CustomerFile.readCustomerFile();}
	static {CustomerFile.readEmployeeFile();}
	static {CustomerFile.readAccountFile();}
	static {CustomerFile.readAccountFile();}
	
	public static void main(String[] args) {
		Menu.selectOption();
	}
}
