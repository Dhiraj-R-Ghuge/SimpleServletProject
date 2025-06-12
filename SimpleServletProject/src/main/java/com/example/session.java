package com.example;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class session
 */
@WebServlet("/session")
public class session extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("name");
		HttpSession session=request.getSession();
		ServletContext context=request.getServletContext();
		if (username !=""&& username !=null) {
			session.setAttribute("savedusername", username);
			context.setAttribute("savedusername", username);
		}
		
		//session.setAttribute("username", username);
		out.println("request parameter hsa username as"+username);
		out.println("sesssion  parameter hsa username as"+(String) session.getAttribute("savedusername")); 
		out.println("context  parameter hsa username as"+(String) context.getAttribute("savedusername")); 
		
	}

	private static void setAttribute(String string, String username) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
