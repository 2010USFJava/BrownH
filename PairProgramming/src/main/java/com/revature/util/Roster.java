package com.revature.util;

import java.util.ArrayList;
import java.util.List;

import com.revature.beans.States;

import com.revature.menu.Menu;

public class Roster {
	public static List<States> stateList= new ArrayList<States>();

	public static States findStateByName(String inputName) {
		for (int i = 0; i < stateList.size(); i++) {
			String name= stateList.get(i).getName();
			if(inputName.equals(name)) {
				return stateList.get(i);
				
			}
		}
		System.out.println("State not found");
		Menu.mainMenu();
		return null;
	}
}
