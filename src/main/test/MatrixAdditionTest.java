import main.java.MatrixAddition;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition matrixObj;
    @Before
    public void setUp()  {
        matrixObj = new MatrixAddition();
    }

    @After
    public void tearDown() throws Exception {
        matrixObj = null;
    }

    @Test
    public void testCheckForGradeSuccess() {
        int[][] first = {{6,6},{6,6}};
        int[][] second = {{6,6},{6,6}};
        int[][] actualStr = matrixObj.addMatrix(2,2,first,second);
        int[][] expectedStr = {{12,12},{12,12}};
        assertArrayEquals(expectedStr,actualStr);
    }

    @Test
    public void testCheckForGradeFailure() {
        int[][] first = {{6,6},{6,6}};
        int[][] second = {{6,6},{6,6}};
        int[][] actualStr = matrixObj.addMatrix(2,2,first,second);
        int[][] expectedStr = {{12,18},{12,12}};
        assertNotEquals(expectedStr,actualStr);
    }
}