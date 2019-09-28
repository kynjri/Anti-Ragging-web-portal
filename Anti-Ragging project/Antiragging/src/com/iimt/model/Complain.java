package com.iimt.model;

import java.util.Date;

public class Complain {
	private String dateofcomplain;
	private String studentname;
	private String studentrollno;
	private String description;
	private String actiontakenby;
	private Date dateofaction;
	private String actiontaken;

	public Complain() {
		// TODO Auto-generated constructor stub
	}

	public String getDateofcomplain() {
		return dateofcomplain;
	}

	public void setDateofcomplain(String dateofcomplain) {
		this.dateofcomplain = dateofcomplain;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentrollno() {
		return studentrollno;
	}

	public void setStudentrollno(String studentrollno) {
		this.studentrollno = studentrollno;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getActiontakenby() {
		return actiontakenby;
	}

	public void setActiontakenby(String actiontakenby) {
		this.actiontakenby = actiontakenby;
	}

	public Date getDateofaction() {
		return dateofaction;
	}

	public void setDateofaction(Date dateofaction) {
		this.dateofaction = dateofaction;
	}

	public String getActiontaken() {
		return actiontaken;
	}

	public void setActiontaken(String actiontaken) {
		this.actiontaken = actiontaken;
	}

	public Complain(String dateofcomplain, String studentname, String studentrollno, String description,
			String actiontakenby, Date dateofaction, String actiontaken) {
		super();
		this.dateofcomplain = dateofcomplain;
		this.studentname = studentname;
		this.studentrollno = studentrollno;
		this.description = description;
		this.actiontakenby = actiontakenby;
		this.dateofaction = dateofaction;
		this.actiontaken = actiontaken;
	}
	
	
}
