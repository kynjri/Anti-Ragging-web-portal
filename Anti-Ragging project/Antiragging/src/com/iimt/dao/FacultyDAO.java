package com.iimt.dao;

import java.util.List;
import com.iimt.model.Faculty;
import com.iimt.model.Student;

public interface FacultyDAO {
	public String insert(Faculty faculty);
	public String update(Faculty faculty);
	public String delete(Faculty faculty);
	
	public String isValidUser(Faculty faculty);
	public List<Faculty>getAll();


	public Faculty getByUsername(String username);
}
