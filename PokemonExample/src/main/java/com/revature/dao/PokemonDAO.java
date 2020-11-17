package com.revature.dao;

import java.sql.SQLException;


import com.revature.beans.Ability;
import com.revature.beans.Pokemon;

public interface PokemonDAO {

	
	public Ability getAbilitiesByID(int aid) throws SQLException;
	public Pokemon getPokemonByID(int pid) throws SQLException;
}
