package com.revature.enums;

import com.revature.users.Customers;

public class AccessType {
	public enum accessType {
		CUSTOMER,
		EMPLOYEE,
		ADMIN
	} public static void accessType(Customers a, AccessType aType) {
		if(aType.equals(accessType.CUSTOMER)) {
			
		}
	}
	
}

