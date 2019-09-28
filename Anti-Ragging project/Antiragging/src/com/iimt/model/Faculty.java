package com.iimt.model;

public class Faculty {
	
	private String username;
	private String password;
	private String name;
	private String gender;
	private String mobNo;
	private String emailId;
	private String department;
	
	public Faculty(String username, String password, String name, String gender, String mobNo, String emailId,
			String department) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.mobNo = mobNo;
		this.emailId = emailId;
		this.department = department;
	}
	
	public Faculty() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	

}
