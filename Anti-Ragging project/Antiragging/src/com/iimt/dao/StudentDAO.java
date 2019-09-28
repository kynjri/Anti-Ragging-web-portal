package com.iimt.dao;

import java.util.List;

import com.iimt.model.Student;

public interface StudentDAO {
	public String isValidUser(Student anti);
	
	public String insert(Student anti);
	public String update(Student anti);
	public String delete(Student anti);
	
	public List<Student>getAll();
	
	public Student getByRollNo(String rollNo);

}
