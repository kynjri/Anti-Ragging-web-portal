package com.iimt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FacultyLogoutController
 */
@WebServlet("/FacultyLogoutController")
public class FacultyLogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyLogoutController() {
        super();
       
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
	
		HttpSession session = request.getSession(false);
		RequestDispatcher rd = null;
		System.out.println("Logout Controller");
		System.out.println("Session Id2 :" + session.getId());
		if (session != null) {
		session.removeAttribute("facultyName");
		session.invalidate();
		// Dispatch to login page
		request.setAttribute("msg", "You logout");
		rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);
		}
		// Dispatch to expire session jsp
		//request.setAttribute("msg", "Your Session Expires");
		//rd = request.getRequestDispatcher("home.jsp");
		//rd.forward(request, response);
		}

		/**
		* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
		*      response)
		*/
	}

		

