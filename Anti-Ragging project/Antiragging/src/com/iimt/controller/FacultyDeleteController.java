package com.iimt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iimt.dao.FacultyDAO;
import com.iimt.dao.FacultyDAOImpl;
import com.iimt.model.Faculty;


/**
 * Servlet implementation class FacultyDeleteController
 */
@WebServlet("/FacultyDeleteController")
public class FacultyDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyDeleteController() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String username=request.getParameter("username");
		 
		
		  Faculty f1=new Faculty();
		  f1.setUsername(username);
		  
		  FacultyDAO dao=new FacultyDAOImpl();

		  String res1=dao.delete(f1);
		  
		  RequestDispatcher rd = null;

		  if(res1.equals("SUCCESS")) {
			  request.setAttribute("msg", "Delete Sucessfull.");
		  rd = request.getRequestDispatcher("FacultyDisplayController");}
		  else {
			  request.setAttribute("msg", "Delete not Sucessfull");
		  rd = request.getRequestDispatcher("FacultyDisplayController");
		  }
		  rd.forward(request, response);

	}

}
