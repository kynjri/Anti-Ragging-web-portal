package com.iimt.controller;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class FacultyDisplayController
 */
@WebServlet("/FacultyDisplayController")
public class FacultyDisplayController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyDisplayController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

RequestDispatcher dispatcher = request.getRequestDispatcher("facultydisplay.jsp");
 //Call the DAO
 FacultyDAO dao=new FacultyDAOImpl();
  List<Faculty> list=dao.getAll();

  request.setAttribute("list", list);
  System.out.println("list " + list);
  
  dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
