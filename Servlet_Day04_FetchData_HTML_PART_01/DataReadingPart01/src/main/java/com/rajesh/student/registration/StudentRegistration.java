package com.rajesh.student.registration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.rajesh.student.model.Student;
import com.rajesh.student.util.StudentMapper;
import com.rajesh.student.util.StudentValidator;


@WebServlet("/StudentRegistration")
public class StudentRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// request
		// map with thestudent object
		Student student=StudentMapper.mapFromRequest(req);
		//step validate the data 
		String error=validate(student);
		
		// Step 3: If invalid, send back to form with error
        if (error != null) {
            req.setAttribute("errorMessage", error);
            req.setAttribute("student", student);  // so form can pre-fill
            req.getRequestDispatcher("StudentForm.html").forward(req, res);
            return;
        }
     // Step 4: If valid → (later) save to DB via service/DAO
        // For now, just show success
        res.getWriter().println("Registered: " + student);

}
	public String validate(Student s)
	{
		if (!StudentValidator.isValidName(s.getStudentName())) 
            return "Name must be at least 2 characters";
        if (!StudentValidator.isValidPhone(s.getStudentPh())) 
            return "Phone must be 10 digits starting with 6-9";
        if (!StudentValidator.isValidEmail(s.getStudentEmail())) 
            return "Email format is invalid";
        if (!StudentValidator.isValidGender(s.getStudentGender())) 
            return "Please select gender";
        if (!StudentValidator.isValidCourse(s.getStudentCourse())) 
            return "Please select a valid course";
        if (!StudentValidator.isValidElectiveSubjects(s.getElectiveSubjects())) 
            return "Please select at least one valid elective";
	   return null;	
	}
	}