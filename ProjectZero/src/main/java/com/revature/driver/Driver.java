package com.revature.driver;

import com.revature.menu.Menu;
import com.revature.util.Files;
import com.revature.util.TransFiles;
public class Driver {
	
	static {Files.readCustomerFile();}
	static {TransFiles.readTransactionsFile();}
	public static void main(String[] args) {
		Menu.selectOption();
	}
	
}
