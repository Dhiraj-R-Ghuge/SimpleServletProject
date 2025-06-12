package org.Dhiraj;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.Dhiraj.dto.User;
import org.Dhiraj.service.Loginservice;

/**
 * Servlet implementation class Loginservlet
 */
@WebServlet("/Login")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	//}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId, Password;
		userId=request.getParameter("userId");
		Password=request.getParameter("Password");
		Loginservice login=new Loginservice();
		boolean result=login.authentic(userId, Password);
		
		if(result) {
			User user=login.getuserDetails(userId);
			request.setAttribute("user", user);
		
			RequestDispatcher dispatcher=request.getRequestDispatcher("Succes.jsp");
			dispatcher.forward(request, response);
			//response.sendRedirect("Succes.jsp");
			return;
		}
		else {
			response.sendRedirect("Login.jsp");
			return;
		}
	}

}
