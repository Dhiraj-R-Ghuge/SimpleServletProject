package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class xmlservlet
 */
//@WebServlet("/xmlservlet")
public class webxml extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("Xml servlet called");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		out.println("Hello !"+username);
		out.println("this is form get method");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("Xml servlet called");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String fullname=request.getParameter("fullname");
		
		
		out.println("this is form post method Hello !"+username +"we know your full name is "+ fullname);
		String prof=request.getParameter("prof");
		out.println("you are a"+prof);
		String[] location=request.getParameterValues("location");
		out.println("you are "+location.length+"places");
		for(int i=0; i<location.length; i++) {
			out.println(location[i]);
		}
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
