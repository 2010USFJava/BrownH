package com.revature.driver;

import com.revature.beans.Warrior;
import com.revature.util.FileStuff;
import com.revature.util.Roster;

public class Driver {

	public static void main(String[] args) {
		FileStuff.readWarriorFile(); //can be added to scanner class "loading latest checkpoint" reads file to see where you left off 
		Warrior mikey=new Warrior("Hannah",200,4);
		Warrior steven= new Warrior("Sir",150,8);
		System.out.println(Roster.warriorList.toString()); 

	}

}
