package com.revature.function;

import com.revature.users.Customers;
import com.revature.util.Files;
import com.revature.util.Records;

public class Search {
public void viewCustomerDetails(Customers a) {
	Files.writeCustomerFile(Records.customerList);
	
}
}
