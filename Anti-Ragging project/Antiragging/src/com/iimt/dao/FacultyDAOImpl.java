package com.iimt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.iimt.dbutil.MyConnection;

import com.iimt.model.Faculty;

public class FacultyDAOImpl implements FacultyDAO {
	private Connection conn = new MyConnection().getConn();

	@Override
	public String insert(Faculty faculty) {
		String res = "FAIL";
		String sql = "INSERT INTO TBL_FACULTY(USERNAME,PASSWORD,NAME,GENDER,MOBNO,EMAILID,DEPARTMENT) VALUES(?,?,?,?,?,?,?)";

		try {
			// Statement Creation
			System.out.println(conn);
			PreparedStatement ps = conn.prepareStatement(sql);
			// Set The parameter value7
			ps.setString(1, faculty.getUsername());
			ps.setString(2, faculty.getPassword());
			ps.setString(3, faculty.getName());
			ps.setString(4, faculty.getGender());
			ps.setString(5, faculty.getMobNo());
			ps.setString(6, faculty.getEmailId());
			ps.setString(7, faculty.getDepartment());

			// Execute the statement
			int r = ps.executeUpdate();
			if (r > 0) {
				res = "SUCCESS";
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return res;
	}

	@Override
	public String update(Faculty faculty) {
		String res = "FAIL";
		String sql = "UPDATE tbl_faculty SET  PASSWORD=?,NAME=?,GENDER=?,MOBNO=?,EMAILID=?,DEPARTMENT=? WHERE username =?";

		PreparedStatement stmt;
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, faculty.getPassword());
			stmt.setString(2, faculty.getName());
			stmt.setString(3, faculty.getGender());
			stmt.setString(4, faculty.getMobNo());
			stmt.setString(5, faculty.getEmailId());
			stmt.setString(6, faculty.getDepartment());
			stmt.setString(7, faculty.getUsername());

			int r = stmt.executeUpdate();
			if (r > 0) {
				res = "SUCCESS";

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public String delete(Faculty faculty) {
		String res = "FAIL";
		String sql = "DELETE FROM tbl_faculty WHERE Username=?";
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, faculty.getUsername());
			int x = ps.executeUpdate();

			if (x > 0)
				res = "SUCCESS";
		} catch (SQLException e) {
			System.out.println(e);
		}
		return res;
	}

	@Override
	public List<Faculty> getAll() {
	
		List<Faculty> list = new ArrayList<Faculty>();
		String sql = "SELECT * FROM tbl_faculty";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// Create the statement ---2
			stmt = conn.createStatement();
			// Execute the statement ---3
			rs = stmt.executeQuery(sql);
			// Process The Result
			while (rs.next()) {
				// Read the column value
				String username = rs.getString("username");
				String password = rs.getString("password");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				String mobNo = rs.getString("mobNo");
				String emailId = rs.getString("emailId");
				String department = rs.getString("department");
			Faculty	 f = new Faculty(username,password,name,gender,mobNo,emailId,
					department);
				list.add(f);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return list;
	}

	@Override
	public String isValidUser(Faculty faculty) {

		String res = null;
		try {
			PreparedStatement pst = conn
					.prepareStatement("Select name,username,password from tbl_faculty where username=? and password=?");
			pst.setString(1, faculty.getUsername());
			pst.setString(2, faculty.getPassword());
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {

				res = rs.getString("name");
			}

		} catch (SQLException e) {
			System.out.println("IsValid " + e);
		}

		return res;
	}

	@Override
	public Faculty getByUsername(String username) {
	Faculty faculty = null;
		String sql = "SELECT * FROM tbl_faculty where username=?";
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			// Create the statement ---2
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, username);
			// Execute the statement ---3
			rs = stmt.executeQuery();
			// Process The Result
			if (rs.next()) {
				// Read the column value
				String username1 = rs.getString("username");
				String password = rs.getString("password");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				String mobNo = rs.getString("mobNo");
				String emailId = rs.getString("emailId");
				String department = rs.getString("department");
			

				faculty = new Faculty(username1, password, name, gender, mobNo,
						emailId,department);

			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return faculty;
	}
}
