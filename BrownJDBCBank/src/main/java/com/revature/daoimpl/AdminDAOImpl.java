package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.beans.Admin;
import com.revature.beans.Customer;
import com.revature.dao.AdminDAO;
import com.revature.util.ConnFactory;

public class AdminDAOImpl implements AdminDAO {
	public static ConnFactory cf=ConnFactory.getInstance();


	@Override
	public void addAdmin(Admin admin) throws SQLException {
		Connection conn=cf.getConnection();
		String sql="insert into admins values(?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1,admin.getUsername());
		ps.setString(2,admin.getPassword());
		
	}

	@Override
	public void deleteAdmin(Admin admin) throws SQLException {
		String sql = "DELETE FROM admins WHERE username = ?";
		try (Connection conn = cf.getConnection(); 
				PreparedStatement ps = conn.prepareStatement(sql); ) {
			ps.setString(1, Customer.getUsername());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
