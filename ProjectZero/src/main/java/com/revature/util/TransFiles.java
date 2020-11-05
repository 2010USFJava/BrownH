package com.revature.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.function.Transactions;

public class TransFiles {
	public static final String transFiles="transList.txt";

	public static void writeTransactionsFile(List<Transactions> transList) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream (new FileOutputStream(transFiles));
			objectOut.writeObject(transList);
			objectOut.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}


	
	@SuppressWarnings("unchecked")
	public static void readTransactionsFile() {
		try {
			@SuppressWarnings("resource")
			ObjectInputStream objectIn= new ObjectInputStream(new FileInputStream(transFiles));
			Records.transList=(ArrayList<Transactions>)objectIn.readObject();
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