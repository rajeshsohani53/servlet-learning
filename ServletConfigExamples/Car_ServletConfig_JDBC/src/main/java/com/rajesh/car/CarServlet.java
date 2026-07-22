package com.rajesh.car;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;


//@WebServlet("/Car")
public class CarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private ConnectionProvider connectionProvider; 
	
	public void init(ServletConfig config) throws ServletException {
	 super.init(config);
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 String url      = config.getInitParameter("url");
     String username = config.getInitParameter("username");
     String password = config.getInitParameter("password");
     this.connectionProvider =
             new ConnectionProvider(url, username, password);
	}

	public void destroy() {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

	    
	    try
	    {
	    	Connection con=connectionProvider.getConnection();
	    	 response.getWriter().println("<h1>Connection OK</h1>");
		     response.getWriter().println("<p>" + con.getCatalog() + "</p>");
	    	
	    }catch(Exception e)
	    {
	    	response.getWriter().println("<h1>Connection FAILED</h1>");
	        response.getWriter().println("<pre>" + e.getMessage() + "</pre>");
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            Car car=CarMapper.getCar(request);
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().println(car);
            CarDataBase database=new CarDataBase(connectionProvider);
            try {
				int i=database.save(car);
				response.getWriter().println("<h1>Data Sucessfully saved</h1>");
			     response.getWriter().println("<p>" +i+ "</p>");
			} catch (SQLException e) {
				response.getWriter().println("<h1>Connection FAILED</h1>");
		        response.getWriter().println("<pre>" + e.getMessage() + "</pre>");
			}
            
	}

}
