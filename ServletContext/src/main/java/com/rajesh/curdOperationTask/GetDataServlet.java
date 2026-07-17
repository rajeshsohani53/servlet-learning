package com.rajesh.curdOperationTask;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GetDataServlet
 */
@WebServlet("/GetDataServlet")
public class GetDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		 Cartoon[] data=GetData.getAllData();
		 System.out.println(data[0]);
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();//.println("");
		 out.println("<html>");
		 out.println("<body>");

		 out.println("<table border='1'>");

		 out.println("<tr>");
		 out.println("<th>cname</th>");
		 out.println("<th>facCharacter</th>");
		 out.println("<th>channel</th>");
		 out.println("</tr>");

		 for (int i = 0; i < data.length; i++)
		 {
		     Cartoon d = data[i];

		     out.println("<tr>");
		     out.println("<td>" + d.getCname() + "</td>");
		     out.println("<td>" + d.getFacCharacter() + "</td>");
		     out.println("<td>" + d.getCname() + "</td>");
		     out.println("</tr>");
		 }

		 out.println("</table>");

		 out.println("</body>");
		 out.println("</html>");

	}

}
