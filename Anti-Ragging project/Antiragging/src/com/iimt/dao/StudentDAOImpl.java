package com.iimt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.iimt.dbutil.MyConnection;
import com.iimt.model.Student;

public class StudentDAOImpl implements StudentDAO {
	private Connection conn = new MyConnection().getConn();

	@Override
	public String insert(Student anti) {
		String res = "FAIL";
		String sql = "INSERT INTO RAGGING(NAME,GENDER,NATIONALITY,MOBNO,EMAILID,ADDRESS1,ADDRESS2,CITY,STATE,UGORPG,COURSENAME,ROLLNO,YEAROFSTUDY,PASSWORD,USERNAME) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			// Statement Creation
			PreparedStatement ps = conn.prepareStatement(sql);
			// Set The parameter value7
			ps.setString(1, anti.getName());
			ps.setString(2, anti.getGender());
			ps.setString(3, anti.getNationality());
			ps.setString(4, anti.getMobNo());
			ps.setString(5, anti.getEmailId());
			ps.setString(6, anti.getAddress1());
			ps.setString(7, anti.getAddress2());
			ps.setString(8, anti.getCity());
			ps.setString(9, anti.getState());
			ps.setString(10, anti.getUgorpg());
			ps.setString(11, anti.getCourseName());
			ps.setString(12, anti.getRollNo());
			ps.setString(13, anti.getYearOfstudy());
			ps.setString(14, anti.getPassword());
			ps.setString(15, anti.getUserName());

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

	public String isValidUser(Student anti) {
		String res = null;
		try {
			PreparedStatement pst = conn
					.prepareStatement("Select Name,userName,password from ragging where UserName=? and password=?");
			pst.setString(1, anti.getUserName());
			pst.setString(2, anti.getPassword());
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {

				res = rs.getString("Name");
			}

		} catch (SQLException e) {
			System.out.println("IsValid " + e);
		}

		return res;

	}

	@Override
	public String update(Student student) {
		String res = "FAIL";
		String sql = "UPDATE Ragging SET Name =?, Gender=?,MobNo=?,EmailId=?,"
				+ "Address1=?,Address2=?,City =?, State=?,UgorPg =?,CourseName=?"+
				",YearOfStudy=?, Password=?,UserName=? WHERE Rollno =?";

		PreparedStatement stmt;
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, student.getName());
			stmt.setString(2, student.getGender());
			stmt.setString(3, student.getMobNo());
			stmt.setString(4, student.getEmailId());
			stmt.setString(5, student.getAddress1());
			stmt.setString(6, student.getAddress2());
			stmt.setString(7, student.getCity());
			stmt.setString(8, student.getState());
			stmt.setString(9, student.getUgorpg());
			stmt.setString(10, student.getCourseName());
			stmt.setString(11, student.getYearOfstudy());
			stmt.setString(12, student.getPassword());
			stmt.setString(13, student.getUserName());
			stmt.setString(14, student.getRollNo());

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
	public String delete(Student anti) {
		String res = "FAIL";
		String sql = "DELETE FROM Ragging WHERE rollno=?";
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, anti.getRollNo());
			int x = ps.executeUpdate();

			if (x > 0)
				res = "SUCCESS";
		} catch (SQLException e) {
			System.out.println(e);
		}
		return res;
	}

	@Override
	public List<Student> getAll() {
		List<Student> list = new ArrayList<Student>();
		String sql = "SELECT * FROM Ragging";
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
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				String nationality = rs.getString("nationality");
				String mobno = rs.getString("mobNo");
				String emailid = rs.getString("emailId");
				String address1 = rs.getString("address1");
				String address2 = rs.getString("address2");
				String city = rs.getString("city");
				String state = rs.getString("state");
				String ugorpg = rs.getString("ugorpg");
				String coursename = rs.getString("courseName");
				String rollno = rs.getString("rollNo");
				String yearofstudy = rs.getString("yearOfstudy");
				String password = rs.getString("password");
				String username = rs.getString("userName");

				Student s = new Student(name, gender, nationality, mobno, emailid, address1, address2, city, state,
						ugorpg, coursename, rollno, yearofstudy, password, username);
				list.add(s);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return list;
	}

	@Override
	public Student getByRollNo(String rollNo) {
		Student student = null;
		String sql = "SELECT * FROM Ragging where rollno=?";
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			// Create the statement ---2
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, rollNo);
			// Execute the statement ---3
			rs = stmt.executeQuery();
			// Process The Result
			if (rs.next()) {
				// Read the column value
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				String nationality = rs.getString("nationality");
				String mobno = rs.getString("mobNo");
				String emailid = rs.getString("emailId");
				String address1 = rs.getString("address1");
				String address2 = rs.getString("address2");
				String city = rs.getString("city");
				String state = rs.getString("state");
				String ugorpg = rs.getString("ugorpg");
				String coursename = rs.getString("courseName");
				String rollno = rs.getString("rollNo");
				String yearofstudy = rs.getString("yearOfstudy");
				String password = rs.getString("password");
				String username = rs.getString("userName");

				student = new Student(name, gender, nationality, mobno, emailid, address1, address2, city, state,
						ugorpg, coursename, rollno, yearofstudy, password, username);

			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return student;
	}
}
