package com.revature.functions;


import com.revature.beans.Accounts;
import com.revature.beans.Customer;
import com.revature.util.CustomerFile;
import com.revature.util.Roster;

public class Search {
	public void viewCustomerDetails(Customer a) {
		CustomerFile.writeCustomerFile(Roster.customerList);
		
	}
	public void viewAccountDetails(Accounts a) {
		CustomerFile.writeAccountList(Roster.accountList);
	}
}
