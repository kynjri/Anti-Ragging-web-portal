package com.iimt.controller;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class FacultyMainpageController
 */
@WebServlet("/FacultyMainpageController")
public class FacultyMainpageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FacultyMainpageController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ComplainDAO comp = new ComplainDAOImpl();
		// display all records
		List<Complain> list = comp.getAll();
		RequestDispatcher rd = null;

		request.setAttribute("list", list);
		rd = request.getRequestDispatcher("faculty.jsp");

		rd.forward(request, response);
	}

}
