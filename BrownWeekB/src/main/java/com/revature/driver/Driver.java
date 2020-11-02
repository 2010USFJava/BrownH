package com.revature.driver;

import com.revature.menu.Menu;
import com.revature.util.FileStuff;

public class Driver {

	static {FileStuff.readCompanyFile();}
	public static void main(String[] args) {
		Menu.mainMenu();
	}
}
