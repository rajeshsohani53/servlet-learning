package com.rajesh.ticketbooking;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayTicket
 */
//@WebServlet("/DisplayTicket")
public class DisplayTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;
 @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
	 HttpSession session = request.getSession(false);

     String uname = (String) session.getAttribute("uname");
     String passenger = (String) session.getAttribute("passenger");
     String starting = (String) session.getAttribute("starting");
     String destination = (String) session.getAttribute("destination");
     String transport = (String) session.getAttribute("transport");

     response.setContentType("text/html");

     response.getWriter().println("<h2>Your Ticket </h2>");
     response.getWriter().println("Welcome " + uname + "<br>");
     response.getWriter().println("From: " + starting + "<br>");
     response.getWriter().println("To: " + destination + "<br>");
     response.getWriter().println("Transport: " + transport);
	}

}
