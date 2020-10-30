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
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(customerFile));
			try {
				Records.customerList =(ArrayList<Customers>) objectIn.readObject();
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
