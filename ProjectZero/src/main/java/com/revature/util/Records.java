package com.revature.util;

import java.util.ArrayList;
import java.util.List;

import com.revature.users.Customers;

import com.revature.menu.*;
public class Records {

	public static List<Customers> customerList= new ArrayList<Customers>();
	
	public static Customers findCustomerByName(String inputName) {
		for (int i=0; i < customerList.size(); i++) {
			String name= customerList.get(i).getFirstName();
			if(inputName.equals(name)) {
				return customerList.get(i);
			}
		}
		System.out.println("Customer not found");
		Menu.selectOption();
		return null;
		
	
	}
}
