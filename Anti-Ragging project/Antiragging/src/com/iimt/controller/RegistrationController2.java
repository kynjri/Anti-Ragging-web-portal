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
 * Servlet implementation class RegistrationController2
 */
@WebServlet("/RegistrationController2")
public class RegistrationController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController2() {
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
		// TODO Auto-generated method stub
		System.out.println("Registration Controller");
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String mobNo = request.getParameter("mobNo");
		String emailid = request.getParameter("emailId");
		String department = request.getParameter("department");
	

		// Create the user Object
		Faculty faculty = new Faculty();
		// Set The data to user Object
	
		faculty.setUsername(username);
		faculty.setPassword(password);
		faculty.setName(name);
		faculty.setGender(gender);
		faculty.setMobNo(mobNo);
		faculty.setEmailId(emailid);
		faculty.setDepartment(department);
		// Create the DAO object
		FacultyDAO dao = new FacultyDAOImpl();
		String res = dao.insert(faculty);
		// Dispatch
		RequestDispatcher rd;
		if (res.equals("SUCCESS")) {
			request.setAttribute("msg", "Registration Success");
			rd = request.getRequestDispatcher("registration1.jsp");
		} else {
			request.setAttribute("msg", "Registration Failure");
			rd = request.getRequestDispatcher("registration1.jsp");
		}
		rd.forward(request, response);
	}
	}

