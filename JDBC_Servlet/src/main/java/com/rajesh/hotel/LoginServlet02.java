package com.rajesh.hotel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Servlet implementation class LoginServlet02
 */
@WebServlet("/LoginServlet02")
public class LoginServlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.getWriter().println("Login requires a POST request");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		String usrname=req.getParameter("usrname");
		String password=req.getParameter("password");
		Register log=new Register();
		log.setUsrname(usrname);
		log.setPassword(password);
		try {
			boolean flag=RegisterDatabase.login(log);
			if(flag)
			{
				RequestDispatcher dis=req.getRequestDispatcher("MyHotel.html");
				dis.forward(req, response);
			}else
			{
				out.println("<html>");
				out.println("<body>");
				out.println("<h1 style='color:red'>Invalid credential</h1>");
				out.println("</body>");
				out.println("</html>");
				RequestDispatcher dis=req.getRequestDispatcher("HotelLogin.html");
				dis.include(req, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
