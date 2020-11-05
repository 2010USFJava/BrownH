package com.revature.functions;

import com.revature.beans.States;
import com.revature.util.Files;
import com.revature.util.Roster;

public class Search {
		public void searchDetails(States a) {
			Files.writeStateFile(Roster.stateList);
		}
		
}
