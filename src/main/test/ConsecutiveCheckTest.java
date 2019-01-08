import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.TypeVariable;

import static org.junit.Assert.*;

public class ConsecutiveCheckTest {
    ConsecutiveCheck object;
    @Before
    public void setUp() {
        object = new ConsecutiveCheck();
    }

    @After
    public void tearDown() throws Exception {
        object = null;
    }

    @Test
    public void testConsecutiveSeriesMethodSuccess() {
        assertEquals(true,object.consecutiveSeriesMethod("54,53,52,51,50,49,48"));
    }

    @Test
    public void testConsecutiveSeriesMethodFailure() {
        assertNotEquals(true,object.consecutiveSeriesMethod("98,96,95,94,93"));
    }
}