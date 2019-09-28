package com.iimt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.iimt.dao.StudentDAO;
import com.iimt.dao.StudentDAOImpl;
import com.iimt.model.Student;

/**
 * Servlet implementation class StudentDeleteController
 */
@WebServlet("/StudentDeleteController")
public class StudentDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doPost(request, response);		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String rollno=request.getParameter("rollno");
		 
		
		 Student f1=new  Student();
		  f1.setRollNo(rollno);
		  
		  StudentDAO dao=new  StudentDAOImpl();

		  String res1=dao.delete(f1);
		  
		  RequestDispatcher rd = null;

		  if(res1.equals("SUCCESS")) {
			  request.setAttribute("msg", "Delete Sucessfull.");
		  rd = request.getRequestDispatcher("StudentDisplayController");}
		  else {
			  request.setAttribute("msg", "Delete not Sucessfull");
		  rd = request.getRequestDispatcher("StudentDisplayController");
		  }
		  rd.forward(request, response);
	}

}
