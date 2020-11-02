package com.revature.service;

import com.revature.beans.Company;
import com.revature.util.FileStuff;
import com.revature.util.Roster;

public class Search {
public void searchDetails(Company a) {
	FileStuff.writeCompanyFile(Roster.companyList);
}
}
