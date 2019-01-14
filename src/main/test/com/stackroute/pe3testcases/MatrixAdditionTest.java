package com.stackroute.pe3testcases;

import com.stackroute.pe3.MatrixAddition;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition matrixObject;
    @Before
    public void setUp()  {
        matrixObject = new MatrixAddition();
    }

    @After
    public void tearDown() throws Exception {
        matrixObject = null;
    }

    @Test
    public void testCheckForGradeSuccess() {
        Integer[][] first = {{6,6},{6,6}};
        Integer[][] second = {{6,6},{6,6}};
        Integer[][] actualString = matrixObject.addMatrix(2,2,first,second);
        Integer[][] expectedString = {{12,12},{12,12}};
        assertArrayEquals(expectedString,actualString);
    }

    @Test
    public void testCheckForGradeFailure() {
        Integer[][] first = {{6,6},{6,6}};
        Integer[][] second = {{6,6},{6,6}};
        Integer[][] actualString = matrixObject.addMatrix(2,2,first,second);
        Integer[][] expectedString = {{12,18},{12,12}};
        assertNotEquals(expectedString,actualString);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(matrixObject.addMatrix(null,null,null,null));
    }
}