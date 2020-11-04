package com.revature.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


import com.revature.users.Customers;

public class Files {
	public static final String customerFile="customerList.txt";
	//write method
	public static void writeCustomerFile(List<Customers> cList) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(customerFile));
			objectOut.writeObject(cList);
			objectOut.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//read method 
	@SuppressWarnings("unchecked")
	public static void readCustomerFile() {
		try {
			ObjectInputStream objectIn= new ObjectInputStream(new FileInputStream(customerFile));
			Records.customerList=(ArrayList<Customers>)objectIn.readObject();
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