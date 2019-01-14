package com.stackroute.pe3testcases;

import com.stackroute.pe3.VowelRemoval;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class VowelRemovalTest {
    VowelRemoval vowelObject;
    @Before
    public void setUp() {
        vowelObject = new VowelRemoval();
    }

    @After
    public void tearDown() throws Exception {
        vowelObject = null;
    }

    @Test
    public void testVowelRemovalSuccess() {
        String[] input = {"India","Germany","United States"};
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("Ind");
        expectedOutput.add("Grmny");
        expectedOutput.add("Untd Stts");
        assertEquals(expectedOutput,vowelObject.removeVowel(input));
    }

    @Test
    public void testVowelRemovalFailure() {
        String[] input = {"iaa","ieu","uei"};
        assertNotNull(vowelObject.removeVowel(input));
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(vowelObject.removeVowel(null));
    }
}