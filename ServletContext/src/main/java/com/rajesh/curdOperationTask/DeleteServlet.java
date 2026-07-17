package com.rajesh.curdOperationTask;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		try
    	{
    		ConnectionProvider c1 = new ConnectionProvider();
            Connection con = c1.getConnection();

            PreparedStatement ps = con.prepareStatement(
            	    "DELETED from cartoon WHERE channel = ?"
            	);

            ps.setString(1,request.getParameter("delete"));
            
            int rows = ps.executeUpdate();
            if(rows>0)
            {
            	response.getWriter().println("Record deleted");
            }else
            {
            	response.getWriter().println("Record not deleted");
            }
            //0 rows;
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
		
		
		
	}

}
