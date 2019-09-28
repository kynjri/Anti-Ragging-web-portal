package com.iimt.model;

public class Admin {
	private String adminid;
	private String adminname;
	private String  adminpassword;

	public Admin() {
		
	}

	public Admin(String adminid, String adminname, String adminpassword) {
		super();
		this.adminid = adminid;
		this.adminname = adminname;
		this.adminpassword = adminpassword;
	}

	public String getAdminid() {
		return adminid;
	}

	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getAdminpassword() {
		return adminpassword;
	}

	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	

}
