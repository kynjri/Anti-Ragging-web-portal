package com.iimt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iimt.dao.StudentDAO;
import com.iimt.dao.StudentDAOImpl;
import com.iimt.model.Student;

/**
 * Servlet implementation class StudentLoginController
 */
@WebServlet("/StudentLoginController")
public class StudentLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentLoginController() {
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

		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		Student student = new Student();
		student.setUserName(userName);
        student.setPassword(password);
		
        StudentDAO dao = new StudentDAOImpl();
		String studentName = dao.isValidUser(student);
		RequestDispatcher rd = null;
		if (studentName != null && !studentName.isEmpty()) {
			HttpSession session = request.getSession();
			System.out.println("Session Id1 :" + session.getId());
			session.setAttribute("studentName", studentName);
			session.setMaxInactiveInterval(30);
			rd = request.getRequestDispatcher("student.jsp");
		} else {
			request.setAttribute("msg", "!!!!Incorrect User Name/Password");
			rd = request.getRequestDispatcher("studentlogin.jsp");
		}
		rd.forward(request, response);
	
	}

}
