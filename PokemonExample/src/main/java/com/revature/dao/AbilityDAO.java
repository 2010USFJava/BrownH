package com.revature.dao;

import java.sql.SQLException;

import com.revature.beans.Ability;

public interface AbilityDAO {

	public Ability getAbility() throws SQLException;
	
}
