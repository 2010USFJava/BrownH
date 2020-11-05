package com.revature.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.States;

public class Files {
	public static final String stateFile = "stateList.txt";

	// write method
	public static void writeStateFile(List<States> sList) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(stateFile));
			objectOut.writeObject(sList);
			objectOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// read method
	@SuppressWarnings("unchecked")
	public static void readStateFile() {
		try {
			@SuppressWarnings("resource")
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(stateFile));
			Roster.stateList = (ArrayList<States>) objectIn.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

