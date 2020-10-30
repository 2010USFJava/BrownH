package com.revature.driver;

import com.revature.menu.Menu;
import com.revature.util.Files;

public class Driver {
	static {Files.readCustomerFile();}
	public static void main(String[] args) {
		Menu.selectOption();
	}
	
}
