package com.iimt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iimt.dao.ComplainDAO;
import com.iimt.dao.ComplainDAOImpl;
import com.iimt.model.Complain;


/**
 * Servlet implementation class StudentComplainController
 */
@WebServlet("/StudentComplainController")
public class StudentComplainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentComplainController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String date = request.getParameter("dateofcomplain");
		String studentname = request.getParameter("studentname");
		String studentrollno = request.getParameter("studentrollno");
		String description = request.getParameter("description");

	

		// Create the user Object
		Complain complain = new Complain();
		// Set The data to user Object
	
		complain.setDateofcomplain(date);
		complain.setStudentname(studentname);
		complain.setStudentrollno(studentrollno);
		complain.setDescription(description);
		
		// Create the DAO object
		ComplainDAO dao = new ComplainDAOImpl();
		String res = dao.addcomplain(complain);
		// Dispatch
		RequestDispatcher rd;
		if (res.equals("SUCCESS")) {
			request.setAttribute("msg", "Your complain has been registered ");
			rd = request.getRequestDispatcher("student.jsp");
		} else {
			request.setAttribute("msg", "Registration Failure");
			rd = request.getRequestDispatcher("student.jsp");
		}
		rd.forward(request, response);
	}

}
