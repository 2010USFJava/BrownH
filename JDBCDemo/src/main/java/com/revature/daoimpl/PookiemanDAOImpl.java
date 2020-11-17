package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.beans.Pookieman;
import com.revature.dao.PookiemanDAO;
import com.revature.util.ConnFactory;

public class PookiemanDAOImpl implements PookiemanDAO {
public static ConnFactory cf = ConnFactory.getInstance();
	@Override
	public void catchNewPookieman(Pookieman p) throws SQLException {
		Connection conn=cf.getConnection();
		//using a statement object 
		//String sql= "insert into pookiemans values("+p.getPid()+", "+p.getPname()+")";
		//prepared statement 
		String sql= "insert into pookiemans values(?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, p.getPid());
		ps.setString(2, p.getPname());
		ps.executeUpdate();
	}

	@Override
	public Pookieman getPookiemanByID(int id) throws SQLException {
		Connection conn=cf.getConnection();
		String sql = "select * from pookiemans where pid=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs= ps.executeQuery();
		Pookieman a=null;
		//if(rs!=null) {
		while(rs.next()) {
			a=new Pookieman(rs.getInt(1),rs.getString(2));
		}
		
		return a;
		//} else {
			//return null;
		//}
	}

}
