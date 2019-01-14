package com.stackroute.pe3testcases;

import com.stackroute.pe3.ConsecutiveCheck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveCheckTest {
    ConsecutiveCheck checkObject;
    @Before
    public void setUp() {
        checkObject = new ConsecutiveCheck();
    }

    @After
    public void tearDown() throws Exception {
        checkObject = null;
    }

    @Test
    public void testConsecutiveSeriesMethodSuccess() {
        assertEquals(true,checkObject.consecutiveSeriesMethod("54,53,52,51,50,49,48"));
    }

    @Test
    public void testConsecutiveSeriesMethodFailure() {
        assertNotEquals(true,checkObject.consecutiveSeriesMethod("98,96,95,94,93"));
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(checkObject.consecutiveSeriesMethod(null));
    }
}