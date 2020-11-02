package com.revature.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Company;

public class FileStuff {
	public static final String companyFile="companyList.txt";

	//write method
	public static void writeCompanyFile(List<Company> cList) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(companyFile));
		objectOut.writeObject(cList);
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
	public static void readCompanyFile() {
		try {
			ObjectInputStream objectIn= new ObjectInputStream(new FileInputStream(companyFile));
			Roster.companyList=(ArrayList<Company>)objectIn.readObject();
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