package com.rajesh.student.model;

import java.util.Arrays;

public class Student {
       private String studentName;
       private String studentPh;
       private String studentEmail;
       private String studentGender;
       private String studentCourse;
	   private String[] electiveSubjects;
	   
	   
	   // default constructor 
	   public Student() {
			
			// TODO Auto-generated constructor stub
		   }


	   public Student(String studentName, String studentPh, String studentEmail, String studentGender,
			String studentCourse, String[] electiveSubjects) {
		super();
		this.studentName = studentName;
		this.studentPh = studentPh;
		this.studentEmail = studentEmail;
		this.studentGender = studentGender;
		this.studentCourse = studentCourse;
		this.electiveSubjects = electiveSubjects;
	   }


	   public String getStudentName() {
		   return studentName;
	   }


	   public void setStudentName(String studentName) {
		   this.studentName = studentName;
	   }


	   public String getStudentPh() {
		   return studentPh;
	   }


	   public void setStudentPh(String studentPh) {
		   this.studentPh = studentPh;
	   }


	   public String getStudentEmail() {
		   return studentEmail;
	   }


	   public void setStudentEmail(String studentEmail) {
		   this.studentEmail = studentEmail;
	   }


	   public String getStudentGender() {
		   return studentGender;
	   }


	   public void setStudentGender(String studentGender) {
		   this.studentGender = studentGender;
	   }


	   public String getStudentCourse() {
		   return studentCourse;
	   }


	   public void setStudentCourse(String studentCourse) {
		   this.studentCourse = studentCourse;
	   }


	   public String[] getElectiveSubjects() {
		   return electiveSubjects;
	   }


	   public void setElectiveSubjects(String[] electiveSubjects) {
		   this.electiveSubjects = electiveSubjects;
	   }
	   
	   
	   
	   
}
