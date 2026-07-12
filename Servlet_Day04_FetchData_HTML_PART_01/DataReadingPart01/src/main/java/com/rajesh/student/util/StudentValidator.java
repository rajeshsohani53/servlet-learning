package com.rajesh.student.util;

import com.rajesh.student.model.Student;

public class StudentValidator {
    
    private StudentValidator() {}  // utility class - no instances
    
    // Individual field validators - each does ONE check
    public static boolean isValidName(String name) {
		
        // TODO: not null, not empty, at least 2 chars
		
		if(name == null || name.trim().isBlank() || name.trim().length() < 2)
		{
			return false;
		}
		return true;
    }
    
    public static boolean isValidEmail(String email) {
		if(email==null)
		{
			return false;
		}
		if(email.trim().isBlank())
		{
			return false;
		}
		return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
      
    }
    
    public static boolean isValidPhone(String phone) {
		
    	if(phone==null)
    	{
    		return false;
    	}
    	if(phone.strip().isBlank())
    	{
    		return false;
    	}
    	
    	

    	return phone.trim().matches("^[6-9][0-9]{9}$");
        
    }
    
    public static boolean isValidGender(String gender) {
		if(gender==null)
		{
			return false;
		}
    	return gender.equals("Male") || gender.equals("Female");
        
    }
    ///////////////
    
    private static final String[] VALID_COURSES = {
    	    "Core Java", "Advance Java", "Core Python", "Advance Python", "Java Full Stack"
    	};
    ///////////////
    
    public static boolean isValidCourse(String course) {
		if(course==null)
		{
			return false;
		}
		if(course.trim().isEmpty())
		{
			return false;
		}
		for(String select_courses:VALID_COURSES)
		{
			if(select_courses.equals(course))
			{
				return true;
			}
			
		}
    	return false;
    }
    
    private static final String[] VALID_ELECTIVES = {
    	    "Machine Learning", "Deep Learning","Generative Ai"};
    
    public static boolean isValidElectiveSubjects(String[] subjects) {

        if (subjects == null || subjects.length < 1) {
            return false;
        }

        for (int i = 0; i < subjects.length; i++) {

            boolean found = false;

            for (int j = 0; j < VALID_ELECTIVES.length; j++) {

                if (subjects[i].equals(VALID_ELECTIVES[j])) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
    
    
    
}