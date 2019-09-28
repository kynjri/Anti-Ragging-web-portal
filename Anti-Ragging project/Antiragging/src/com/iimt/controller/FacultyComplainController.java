package com.iimt.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
 * Servlet implementation class FacultyComplainController
 */
@WebServlet("/FacultyComplainController")
public class FacultyComplainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyComplainController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request, response);}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actiontakenby = request.getParameter("actiontakenby");
		String dateofaction = request.getParameter("dateofaction");
		String actiontaken = request.getParameter("actiontaken");
		String studentrollno = request.getParameter("studentrollno");


	

		// Create the user Object
		Complain complain = new Complain();
		// Set The data to user Object
	
		complain.setActiontakenby(actiontakenby);
		//Parse The date
		
		Date d=null;
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			d = sdf.parse(dateofaction);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		complain.setDateofaction(d);
		complain.setActiontaken(actiontaken);
		complain.setStudentrollno(studentrollno);

		
		// Create the DAO object
		ComplainDAO dao = new ComplainDAOImpl();
		String res = dao.addaction(complain);
		// Dispatch
		RequestDispatcher rd;
		if (res.equals("SUCCESS")) {
			request.setAttribute("msg", "you have replied sucessfully ");
			rd = request.getRequestDispatcher("facultyreply.jsp");
		} else {
			request.setAttribute("msg", "replying failed");
			rd = request.getRequestDispatcher("facultyreply.jsp");
		}
		rd.forward(request, response);
	}
	}


