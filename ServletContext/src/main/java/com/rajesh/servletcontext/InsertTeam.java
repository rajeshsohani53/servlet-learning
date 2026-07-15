package com.rajesh.servletcontext;

import com.rajesh.TeamMapper;
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
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/InsertTeam")
public class InsertTeam extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private Connection connection;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ServletContext ctx = config.getServletContext();
        String driver   = ctx.getInitParameter("dbDriver");
        String url      = ctx.getInitParameter("url");
        String username = ctx.getInitParameter("username");
        String password = ctx.getInitParameter("password");
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            throw new ServletException("DB Not connected", e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String teamName = request.getParameter("teamName");
        String trophies = request.getParameter("trophies");
        String player   = request.getParameter("player");

        String sql = "insert into team (teamName, trophies, player) VALUES (?, ?, ?)";

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try{
        	PreparedStatement ps = connection.prepareStatement(sql); 
            ps.setString(1, teamName);
            ps.setString(2, trophies);
            ps.setString(3, player);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                out.println("<h3>Team inserted successfully!</h3>");
            } else {
                out.println("<h3>Insert failed.</h3>");
            }
        } catch (SQLException e) {
            throw new ServletException("Error inserting team", e);
        }
    }

    @Override
    public void destroy() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
