package com.iimt.dao;

import java.util.List;

import com.iimt.model.Complain;

public interface ComplainDAO {
	public String addcomplain(Complain complain);
	public String addaction(Complain complain);
	public String delete(Complain complain);
	
	public List<Complain>getAll();

}
