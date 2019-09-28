package com.iimt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.iimt.dbutil.MyConnection;
import com.iimt.model.Admin;
import com.iimt.model.Faculty;
import com.iimt.model.Student;

public class AdminDAOImpl implements AdminDAO {
	private Connection conn = new MyConnection().getConn();

	public String isValidUser(Admin admin) {

		String res = null;
		try {
			PreparedStatement pst = conn.prepareStatement(
					"Select adminname,adminid,adminpassword from tbl_admin where adminid=? and adminpassword=?");
			pst.setString(1, admin.getAdminid());
			pst.setString(2, admin.getAdminpassword());
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {

				res = rs.getString("adminname");
			}

		} catch (SQLException e) {
			System.out.println("IsValid " + e);
		}

		return res;
	}

	@Override
	public String Update(Student student) {
		return null;
	}

	@Override
	public String Update(Faculty faculty) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Delete(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Delete(Faculty faculty) {
		// TODO Auto-generated method stub
		return null;
	}
}
