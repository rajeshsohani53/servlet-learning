package com.rajesh.student.util;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentValidatorTest {

    @Test
    void testValidName() {
        assertTrue(StudentValidator.isValidName("Rajesh"));
    }

    @Test
    void testNullName() {
        assertFalse(StudentValidator.isValidName(null));
    }

    @Test
    void testBlankName() {
        assertFalse(StudentValidator.isValidName(" "));
    }

    @Test
    void testSmallName() {
        assertFalse(StudentValidator.isValidName("R"));
    }
    
    @Test
    void testValidEmail() {
        assertTrue(StudentValidator.isValidEmail("abc@gmail.com"));
    }

    @Test
    void testInvalidEmail() {
        assertFalse(StudentValidator.isValidEmail("abcgmail.com"));
    }

    @Test
    void testNullEmail() {
        assertFalse(StudentValidator.isValidEmail(null));
    }
    @Test
    void testValidPhone() {
        assertTrue(StudentValidator.isValidPhone("9876543210"));
    }

    @Test
    void testPhoneStartingWith1() {
        assertFalse(StudentValidator.isValidPhone("1876543210"));
    }

    @Test
    void testPhoneLength() {
        assertFalse(StudentValidator.isValidPhone("987654321"));
    }

    @Test
    void testNullPhone() {
        assertFalse(StudentValidator.isValidPhone(null));
    }
    @Test
    void testMale() {
        assertTrue(StudentValidator.isValidGender("Male"));
    }

    @Test
    void testFemale() {
        assertTrue(StudentValidator.isValidGender("Female"));
    }

    @Test
    void testOther() {
        assertFalse(StudentValidator.isValidGender("Other"));
    }
    @Test
    void testValidCourse() {
        assertTrue(StudentValidator.isValidCourse("Java"));
    }

    @Test
    void testBlankCourse() {
        assertFalse(StudentValidator.isValidCourse(" "));
    }

    @Test
    void testNullCourse() {
        assertFalse(StudentValidator.isValidCourse(null));
    }
}