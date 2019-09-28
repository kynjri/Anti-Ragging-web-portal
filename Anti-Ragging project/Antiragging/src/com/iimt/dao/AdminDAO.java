package com.iimt.dao;

import com.iimt.model.Admin;
import com.iimt.model.Faculty;
import com.iimt.model.Student;

public interface AdminDAO {
	public String isValidUser(Admin admin);
	public String Update(Student student);
	public String Update(Faculty faculty);
	public String Delete(Student student);
	public String Delete(Faculty faculty);

}
