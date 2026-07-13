package com.rajesh.menu;

import com.rajesh.car.Car;

import jakarta.servlet.http.HttpServletRequest;

public class MenuMapper {
  public static Menu getMenu(HttpServletRequest request)
  {
	  Menu menu = new Menu();

	  menu.setItem(request.getParameter("item"));
	  menu.setPrice(request.getParameter("price"));
	  menu.setDesc(request.getParameter("desc"));
      

	  return menu;
  }
}
