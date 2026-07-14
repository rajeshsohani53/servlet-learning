package com.rajesh.menu;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletGetData
 */
@WebServlet("/ServletGetData")
public class ServletGetData extends HttpServlet {
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
		 Menu data[]=MenuRepo.getdata();
		 System.out.println(data[0]);
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();//.println("");
		 out.println("<html>");
		 out.println("<body>");

		 out.println("<table border='1'>");

		 out.println("<tr>");
		 out.println("<th>Item</th>");
		 out.println("<th>Price</th>");
		 out.println("<th>Description</th>");
		 out.println("</tr>");

		 for (int i = 0; i < data.length; i++)
		 {
		     Menu d = data[i];

		     out.println("<tr>");
		     out.println("<td>" + d.getItem() + "</td>");
		     out.println("<td>" + d.getPrice() + "</td>");
		     out.println("<td>" + d.getDesc() + "</td>");
		     out.println("</tr>");
		 }

		 out.println("</table>");

		 out.println("</body>");
		 out.println("</html>");
	}

}
