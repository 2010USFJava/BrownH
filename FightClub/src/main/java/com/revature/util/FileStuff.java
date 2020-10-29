package com.revature.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Warrior;

public class FileStuff {
	public static final String warriorFile="warriorList.txt";

	//write method
	public static void writeWarriorFile(List<Warrior> wList) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(warriorFile));
		objectOut.writeObject(wList);
		objectOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//read method
	@SuppressWarnings("unchecked")
	public static void readWarriorFile() {
		
		try {
			@SuppressWarnings("resource")
			ObjectInputStream objectIn= new ObjectInputStream(new FileInputStream(warriorFile));
			try {
				Roster.warriorList =(ArrayList<Warrior>) objectIn.readObject();
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	
}
