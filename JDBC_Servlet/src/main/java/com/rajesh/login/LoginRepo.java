package com.rajesh.login;

public class LoginRepo {
  public static boolean check(Login login)
  {
	  String username="rajesh";
	  String password="Raj@123";
	  if(username.equals(login.getUserName()) && password.equals(login.getPassword()))
	  {
		  return true;
	  }
	  return false;
  }
}
