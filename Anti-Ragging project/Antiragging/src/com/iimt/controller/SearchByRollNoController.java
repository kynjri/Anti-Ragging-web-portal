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
 * Servlet implementation class SearchByRollNoController
 */
@WebServlet("/SearchByRollNoController")
public class SearchByRollNoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchByRollNoController() {
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
		String rollno=request.getParameter("rollno");
		StudentDAO dao=new StudentDAOImpl();
		Student student=dao.getByRollNo(rollno);
		System.out.println(student.getName());
		System.out.println(student.getRollNo());
		RequestDispatcher rd=request.getRequestDispatcher("updatestudent.jsp");
		request.setAttribute("student", student);
		rd.forward(request, response);
	}

	
}
