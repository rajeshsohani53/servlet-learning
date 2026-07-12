package com.rajesh;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Temp")
public class Demo extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Demo() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        response.getWriter().println("<h1>Hello from Demo Servlet</h1>");
        response.getWriter().println("<p>Context Path: " + request.getContextPath() + "</p>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doGet(request, response);
    }
}