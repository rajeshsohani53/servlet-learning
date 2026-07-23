package com.rajesh.ticketbooking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class TicketBookingServlet
 */
//@WebServlet("/TicketBookingServlet")
public class TicketBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");

		String uname = req.getParameter("uname");
		String passenger = req.getParameter("passenger");
		String starting = req.getParameter("starting");
		String destination = req.getParameter("destination");
		String transport = req.getParameter("transport");
		
		res.getWriter().println("<h1>Ticket Booking Confirmation</h1>");
		res.getWriter().println("<p>Name: " + uname + "</p>");
		res.getWriter().println("<p>Passengers: " + passenger + "</p>");
		res.getWriter().println("<p>From: " + starting + "</p>");
		res.getWriter().println("<p>To: " + destination + "</p>");
		res.getWriter().println("<p>Mode of Transport: " + transport + "</p>");
		
		HttpSession session=req.getSession();
		session.setAttribute("uname", uname);
		session.setAttribute("passenger", passenger);
		session.setAttribute("starting", starting);
		session.setAttribute("destination", destination);
		session.setAttribute("transport", transport);
		res.sendRedirect("DisplayTicket");
		
		//res.getWriter().println();
	}

}
