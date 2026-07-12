package com.rajesh.student.util;
import com.rajesh.student.model.Student;


import jakarta.servlet.http.HttpServletRequest;
public class StudentMapper {

	private StudentMapper() {
		
		// TODO Auto-generated constructor stub
	}
	public static Student mapFromRequest(HttpServletRequest req)
	{
		Student student=new Student();
		student.setStudentName(req.getParameter("studentName"));// this returns the student name 
		student.setStudentPh(req.getParameter("studentPh"));// this returns the student ph no
		student.setStudentEmail(req.getParameter("studentMail"));// this returns the student email
		student.setStudentGender(req.getParameter("studentGender"));// this returns the student gender
		student.setStudentCourse(req.getParameter("studentCourse"));// this returns the student course
		student.setElectiveSubjects(req.getParameterValues("ElectiveSubject"));// this returns the student elective subject
		return student;
	}
    /*
     * so first 
     * we create the student object bacause we want to store the store the student data na 
     * so wthout contain that contain how we can store the value and also we want to retuen the student object thats why w first 
     * create the student object oka and the next qustiojn 
     * we have both option to set the data inside the student object by using the setter methods and patameterized constructor and i like 
     * the setter method because that make my code more readible and as you said if the student not fill any value then it contain the default value 
     * of object like for object type it is null
     * */
	
	/*
	 * Q2 — WRONG. This is critical
	 *  student not fill any value then it contain the default value like null."
		No. This is a very common misconception that ships real bugs. Here's the truth
		ScenariogetParameter("studentMail") returns
		Form has <input name="studentMail">, user leaves it blank"" (empty string) — NOT null
		Form has no input with name="studentMail" at allnull
	 * */
	
}
