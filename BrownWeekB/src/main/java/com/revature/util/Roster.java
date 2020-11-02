package com.revature.util;

import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Company;
import com.revature.menu.Menu;

public class Roster {

	public static List<Company> companyList= new ArrayList<Company>();
	
	public static Company findCompanyByName(String inputName) {
		for (int i = 0; i < companyList.size(); i++) {
			String name= companyList.get(i).getName();
			if(inputName.equals(name)) {
				return companyList.get(i);
				
			}
		}
		System.out.println("Company not found");
		Menu.mainMenu();
		return null;
	}
}
