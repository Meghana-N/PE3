package com.stackroute.pe3testcases;

import com.stackroute.pe3.StudentMarks;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks studentObject;
    @Before
    public void setUp()  {
        studentObject = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        studentObject = null;
    }

    @Test
    public void testCheckForGradeSuccess() {
        int[] studentGrades = {30,20,80};
        String actualString = studentObject.checkStudentGrade(3,studentGrades);
        String expectedString = "Valid grades";
        assertEquals(expectedString,actualString);
    }

    @Test
    public void testCheckForGradeFAilure() {
        int[] studentGrades = {30,20,80};
        String actualString = studentObject.checkStudentGrade(3,studentGrades);
        String expectedString = "Invalid grades";
        assertNotEquals(expectedString,actualString);
    }

    @Test(expected = ArithmeticException.class)
    public void testCheckForGradeFailure(){
        int[] studentGrades = {30,101,80};
        studentObject.checkStudentGrade(3,studentGrades);
    }

}