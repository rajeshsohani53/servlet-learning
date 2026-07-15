package com.rajesh.servletcontext;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class ShowServlet
 */
@WebServlet("/ShowServlet")
public class ShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection con;
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		  ServletContext context=config.getServletContext();
		  String username=context.getInitParameter("username");
		  String password=context.getInitParameter("password");
		  String driver=context.getInitParameter("dbDriver");
		  String url=context.getInitParameter("url");
		  
		  try
		  {
			  Class.forName(driver);
			  con=DriverManager.getConnection(url,username,password);
		  }catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		  
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String sql="select * from team";
		try {
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs= stmt.executeQuery(sql);
			rs.last();
			int size=rs.getRow();
			rs.beforeFirst();
			Team t[]=new Team[size];
			int i=0;
			while(rs.next())
			{
				Team team=new Team();
				team.setTeamName(rs.getString(1));
				team.setTrophies(rs.getString(2));
				team.setPlayer(rs.getString(3));
				t[i]=team;
				i++;
			}
			out.println("<html>");
			out.println("<body>");
			out.println("<table border='1'>");
			
			out.println("<tr>");
			out.println("<th>team name</th>");
			out.println("<th>trophies</th>");
			out.println("<th>player</th>");
			out.println("</tr>");
			for(int j=0;j<t.length;j++)
			{
				Team t2=t[j];
				out.println("<tr>");
			     out.println("<td>" + t2.getTeamName() + "</td>");
			     out.println("<td>" + t2.getTrophies() + "</td>");
			     out.println("<td>" + t2.getPlayer() + "</td>");
			     out.println("</tr>");
			     
			}
			out.println("</table>");

			 out.println("</body>");
			 out.println("</html>");

			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void destroy() {
		// TODO Auto-generated method stub
	}

}
