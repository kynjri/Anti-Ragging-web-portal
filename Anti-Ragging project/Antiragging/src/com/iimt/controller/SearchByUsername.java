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
 * Servlet implementation class SearchByUsername
 */
@WebServlet("/SearchByUsername")
public class SearchByUsername extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchByUsername() {
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
		String username=request.getParameter("username");
		FacultyDAO dao=new FacultyDAOImpl();
		Faculty faculty=dao.getByUsername(username);
		System.out.println(faculty.getName());
		System.out.println(faculty.getUsername());
		RequestDispatcher rd=request.getRequestDispatcher("updatefaculty.jsp");
		request.setAttribute("faculty", faculty);
		rd.forward(request, response);
	}

}
