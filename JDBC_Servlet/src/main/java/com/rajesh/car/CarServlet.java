package com.rajesh.car;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CarServlet", urlPatterns = { "/CarServlet" })
public class CarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		Car car=CarMapper.getCar(request);
		response.getWriter().println(car);
		CarDataBase c=new CarDataBase();
		int i=c.save(car);
		if(i>1)
		{
			response.getWriter().println("Car Data Saved");
		}else
		{
			response.getWriter().println("Car Data Saved");
		}
	}

}
