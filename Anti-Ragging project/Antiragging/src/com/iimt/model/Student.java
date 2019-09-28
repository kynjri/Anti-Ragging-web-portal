package com.iimt.model;

public class Student {
	private String name;
	private String gender;
	private String nationality;
	private String mobNo;
	private String emailId;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String ugorpg;
	private String courseName;
	private String rollNo;
	private String yearOfstudy;
	private String password;
	private String userName;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getUgorpg() {
		return ugorpg;
	}
	public void setUgorpg(String ugorpg) {
		this.ugorpg = ugorpg;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getYearOfstudy() {
		return yearOfstudy;
	}
	public void setYearOfstudy(String yearOfstudy) {
		this.yearOfstudy = yearOfstudy;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Student(String name, String gender, String nationality, String mobNo, String emailId,
			String address1, String address2, String city, String state, String ugorpg, String courseName,
			String rollNo, String yearOfstudy, String password, String userName) {
		super();
		this.name = name;
		this.userName = userName;
		this.gender = gender;
		this.nationality = nationality;
		this.mobNo = mobNo;
		this.emailId = emailId;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.ugorpg = ugorpg;
		this.courseName = courseName;
		this.rollNo = rollNo;
		this.yearOfstudy = yearOfstudy;
		this.password = password;
	}
}
