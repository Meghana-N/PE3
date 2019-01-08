import main.java.StudentMarks;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks studObj;
    @Before
    public void setUp()  {
        studObj = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        studObj = null;
    }

    @Test
    public void testCheckForGradeSuccess() {
        int[] stuGrades = {30,20,80};
        String actualStr = studObj.checkStudGrade(3,stuGrades);
        String expectedStr = "Valid grades";
        assertEquals(expectedStr,actualStr);
    }

    @Test(expected = ArithmeticException.class)
    public void testCheckForGradeFailure(){
        int[] stuGrades = {30,101,80};
        studObj.checkStudGrade(3,stuGrades);
    }

}