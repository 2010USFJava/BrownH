package com.revature.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.revature.beans.Accounts;
import com.revature.beans.Admin;
import com.revature.beans.Customer;
import com.revature.beans.Employee;



public class CustomerFile {
	public static final String customerFile = "customerList.txt";

	// write method
	public static void writeCustomerFile(List<Customer> cList) {
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

	// read method
	@SuppressWarnings("unchecked")
	public static void readCustomerFile() {
		try {
			@SuppressWarnings("resource")
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(customerFile));
			Roster.customerList = (ArrayList<Customer>) objectIn.readObject();
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

	public static final String employeeFile = "employeeList.txt";

	// write method
	public static void writeEmployeeFile(List<Employee> eList) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(employeeFile));
			objectOut.writeObject(eList);
			objectOut.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// read method
	@SuppressWarnings("unchecked")
	public static void readEmployeeFile() {
		try {
			@SuppressWarnings("resource")
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(employeeFile));
			Roster.employeeList = (ArrayList<Employee>) objectIn.readObject();
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

	public static final String userMap = "userMap.txt";
	//write
	public static void writeUserMap(Map<String, String> umap) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(userMap));
			objectOut.writeObject(umap);
			objectOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//read
	@SuppressWarnings("unchecked")
	public static void readUserMap() {
		try {
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(userMap));
			Roster.umap = (Map<String,String>)objectIn.readObject();
			objectIn.close();
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
	public static final String employeeMap = "employeeMap.txt";
	//write
	public static void writeEmployeeMap(Map<String, String> empMap) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(employeeMap));
			objectOut.writeObject(empMap);
			objectOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//read
	@SuppressWarnings("unchecked")
	public static void readEmployeeMap() {
		try {
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(employeeMap));
			Roster.empMap = (Map<String,String>)objectIn.readObject();
			objectIn.close();
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
	public static final String accountFile = "accountList.txt";
	//write
	public static void writeAccountList(List<Accounts> aList) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(accountFile));
			objectOut.writeObject(aList);
			objectOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//read
	@SuppressWarnings("unchecked")
	public static void readAccountFile() {
		try {
			@SuppressWarnings("resource")
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(accountFile));
			Roster.accountList = (ArrayList<Accounts>) objectIn.readObject();
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
	public static final String adminFile = "adminList.txt";

	// write method
	public static void writeAdminFile(List<Admin> aList) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(adminFile));
			objectOut.writeObject(aList);
			objectOut.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// read method
	@SuppressWarnings("unchecked")
	public static void readrAdminFile() {
		try {
			@SuppressWarnings("resource")
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(adminFile));
			Roster.adminList = (ArrayList<Admin>) objectIn.readObject();
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
	public static final String adminMap = "adminMap.txt";
	//write
	public static void writeAdminMap(Map<String, String> amap) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(adminMap));
			objectOut.writeObject(adminMap);
			objectOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//read
	@SuppressWarnings("unchecked")
	public static void readAdminMap() {
		try {
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(adminMap));
			Roster.aMap = (Map<String,String>)objectIn.readObject();
			objectIn.close();
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

