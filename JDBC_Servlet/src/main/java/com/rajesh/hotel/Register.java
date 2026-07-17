package com.rajesh.hotel;

public class Register {
	private String usrname;//=req.getParameter("usrname");
	private String email;//=req.getParameter("email");
	private String password;//=req.getParameter("password");
	public Register() {
	//	O Auto-generated constructor stub
	}
	public Register(String usrname, String email, String password) {
		super();
		this.usrname = usrname;
		this.email = email;
		this.password = password;
	}
	public String getUsrname() {
		return usrname;
	}
	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
