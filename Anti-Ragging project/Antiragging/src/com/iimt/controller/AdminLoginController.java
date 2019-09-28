package com.iimt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iimt.dao.AdminDAO;
import com.iimt.dao.AdminDAOImpl;
import com.iimt.model.Admin;


/**
 * Servlet implementation class AdminCotroller
 */
@WebServlet("/AdminCotroller")
public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginController() {
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
		String adminid=request.getParameter("adminId");
		String adminpassword=request.getParameter("adminPassword");

		Admin admin = new Admin();
		admin.setAdminid(adminid);
		admin.setAdminpassword(adminpassword);
		
		AdminDAO dao = new AdminDAOImpl();
		String adminName = dao.isValidUser(admin);
		RequestDispatcher rd = null;
		if (adminName != null && !adminName.isEmpty()) {
			HttpSession session = request.getSession();
			session.setAttribute("adminname", adminName);
			session.setMaxInactiveInterval(30);
			rd = request.getRequestDispatcher("admin.jsp");
		} else {
			request.setAttribute("msg", "!!!!Incorrect Id/Password");
			rd = request.getRequestDispatcher("adminlogin.jsp");
		}
		rd.forward(request, response);
}
	}


