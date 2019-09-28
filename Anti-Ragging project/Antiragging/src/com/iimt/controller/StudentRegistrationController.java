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
 * Servlet implementation class StudentRegistrationController
 */
@WebServlet("/StudentRegistrationController")
public class StudentRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegistrationController() {
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
	

		System.out.println("Registration Controller");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String nationality = request.getParameter("nationality");
		String mobno = request.getParameter("mobNo");
		String emailid = request.getParameter("emailId");
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String ugorpg = request.getParameter("ugorpg");
		String coursename = request.getParameter("courseName");
		String rollno = request.getParameter("rollNo");
		String yearofstudy = request.getParameter("yearOfstudy");
		String password = request.getParameter("password");
		String username = request.getParameter("userName");

		// Create the user Object
		Student anti = new Student();
		// Set The data to user Object
		anti.setName(name);
		anti.setGender(gender);
		anti.setNationality(nationality);
		anti.setMobNo(mobno);
		anti.setEmailId(emailid);
		anti.setAddress1(address1);
		anti.setAddress2(address2);
		anti.setCity(city);
		anti.setState(state);
		anti.setUgorpg(ugorpg);
		anti.setCourseName(coursename);
		anti.setRollNo(rollno);
		anti.setYearOfstudy(yearofstudy);
		anti.setPassword(password);
		anti.setUserName(username);
		// Create the DAO object
		StudentDAO dao = new StudentDAOImpl();
		String res = dao.insert(anti);
		// Dispatch
		RequestDispatcher rd = null;
		if (res.equals("SUCCESS")) {
			request.setAttribute("msg", "Registration Success");
			rd = request.getRequestDispatcher("studentregistration.jsp");
		} else {
			request.setAttribute("msg", "Registration Failure please try again");
			rd = request.getRequestDispatcher("studentregistration.jsp");
		}
		rd.forward(request, response);
	}

}
