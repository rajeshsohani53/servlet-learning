package com.rajesh.login;

import jakarta.servlet.http.HttpServletRequest;

public class LoginMapper {
	public static Login getMapping(HttpServletRequest request)
	{
		Login login=new Login();
		login.setUserName(request.getParameter("username"));
		login.setPassword(request.getParameter("password"));
		return login;
	}
}
