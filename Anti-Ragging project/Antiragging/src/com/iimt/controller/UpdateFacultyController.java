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
 * Servlet implementation class UpdateFacultyController
 */
@WebServlet("/UpdateFacultyController")
public class UpdateFacultyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateFacultyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String mobNo = request.getParameter("mobNo");
		String emailId = request.getParameter("emailId");
		String department = request.getParameter("department");
		
		// Create the user Object
		Faculty faculty = new Faculty();
		// Set The data to user Object
		faculty.setUsername(username);
		faculty.setPassword(password);
		faculty.setName(name);
		faculty.setGender(gender);
		faculty.setMobNo(mobNo);
		faculty.setEmailId(emailId);
		faculty.setDepartment(department);
		

		// Create the DAO object
		FacultyDAO dao = new FacultyDAOImpl();
		String res = dao.update(faculty);
		// Dispatch
		RequestDispatcher rd = null;
		if (res.equals("SUCCESS")) {
			request.setAttribute("msg", "Update Success");
			rd = request.getRequestDispatcher("FacultyDisplayController");
		} else {
			request.setAttribute("msg", "Update Failure");
			rd = request.getRequestDispatcher("FacultyDisplayController");
		}
		rd.forward(request, response);
	}

}
