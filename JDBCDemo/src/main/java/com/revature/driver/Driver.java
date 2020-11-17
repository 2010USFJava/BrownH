package com.revature.driver;

import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.beans.Album;
import com.revature.beans.Pookieman;
import com.revature.dao.PookiemanDAO;
import com.revature.daoimpl.AlbumDAOImpl;
import com.revature.daoimpl.PookiemanDAOImpl;

public class Driver {
	public static void main(String[] args) {
		AlbumDAOImpl adi=new AlbumDAOImpl();
		try {
			ArrayList<Album> aList= (ArrayList<Album>) adi.getAllAlbums();
		System.out.println(aList.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PookiemanDAO pd= new PookiemanDAOImpl();
		
		try {
			//pd.catchNewPookieman(new Pookieman(52,"Meowth"));
			//if no rows in result set, you will get a NullPointerException 
			Pookieman p=pd.getPookiemanByID(5);
			System.out.println(p.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
