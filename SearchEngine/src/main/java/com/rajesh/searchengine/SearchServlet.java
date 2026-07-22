package com.rajesh.searchengine;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		String search = req.getParameter("search");
		String engine = req.getParameter("engine");

		
		if(engine.equals("google"))
		{
			res.sendRedirect("https://www.google.com/search?q="+search);
		}
		if(engine.equals("bing"))
		{
			res.sendRedirect("https://www.bing.com/search?q="+search);
		}
		if(engine.equals("brave"))
		{
			res.sendRedirect("https://search.brave.com/search?q=" + search);
		}
		if(engine.equals("firefox"))
		{
			res.sendRedirect("https://www.firefox.com/search?q="+search);
		}
		res.getWriter().println("<h1> user </h1>" + engine + " " + search);
	}

}
