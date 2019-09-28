package com.iimt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.iimt.dbutil.MyConnection;
import com.iimt.model.Complain;

public class ComplainDAOImpl implements ComplainDAO {
	private Connection conn = new MyConnection().getConn();

	@Override
	public String addcomplain(Complain complain) {
		String res = "FAIL";
		String sql = "INSERT INTO TBL_COMPLAINT(DATEOFCOMPLAIN,STUDENTNAME,STUDENTROLLNO,DESCRIPTION) VALUES(?,?,?,?)";

		try {
			// Statement Creation
			System.out.println(conn);
			PreparedStatement ps = conn.prepareStatement(sql);
			// Set The parameter value7
			ps.setString(1, complain.getDateofcomplain());
			ps.setString(2, complain.getStudentname());
			ps.setString(3, complain.getStudentrollno());
			ps.setString(4, complain.getDescription());

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
	public String addaction(Complain complain) {
		String res = "FAIL";
		String sql = "UPDATE tbl_complaint SET actiontakenby=?, dateofaction=?,actiontaken=? WHERE studentrollno =?";

		PreparedStatement pstmt = null;

		try {
			// Statement creation
			pstmt = conn.prepareStatement(sql);
			// set the parameter value
			pstmt.setString(1, complain.getActiontakenby());
			pstmt.setDate(2, new java.sql.Date(complain.getDateofaction().getTime()));
			pstmt.setString(3, complain.getActiontaken());
			pstmt.setString(4, complain.getStudentrollno());
			// Execute the statement
			System.out.println(pstmt);
			int r = pstmt.executeUpdate();

			if (r > 0) {
				res = "SUCCESS";
			}

		} catch (SQLException e) {
			System.out.println(e);
		}

		return res;
	}

	@Override
	public List<Complain> getAll() {
		List<Complain> list = new ArrayList<Complain>();
		String sql = "SELECT * FROM tbl_complaint";
		Statement stmt = null;
		ResultSet res = null;
		// Create Statement-----2
		try {
			stmt = conn.createStatement();
			// Execute the statement-----3
			res = stmt.executeQuery(sql);
			// process the result
			while (res.next()) {
				String dateofcomplain = res.getString("dateofcomplain");
				String studentname = res.getString("studentname");
				String studentrollno = res.getString("studentrollno");
				String description = res.getString("description");
				String actiontakenby = res.getString("actiontakenby");
				Date dateofaction = res.getDate("dateofaction");
				String actiontaken = res.getString("actiontaken");

				// create student
				Complain com = new Complain(dateofcomplain, studentname, studentrollno, description, actiontakenby,
						dateofaction, actiontaken);
				// add to the list
				list.add(com);

			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return list;
	}

	@Override
	public String delete(Complain complain) {
		// TODO Auto-generated method stub
		return null;
	}
}