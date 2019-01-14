/*Create a class called StudentMarks, which prompts user for the number of students, reads it from the
 keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the grades of each
 of the students and saves them in an int array called stuGrades. Your program shall check that the grade is between
 0 and 100 else has to trow an error message.*/

package com.stackroute.pe3;

public class StudentMarks {

    public String checkStudentGrade(int numOfStudents,int[] grades)
    {
        for(int i=0;i<numOfStudents;i++)
        {
            if(grades[i] < 0 || grades[i] > 100)
            {
                throw new ArithmeticException("Invalid grade");
            }
        }
        return ("Valid grades");
    }
}
