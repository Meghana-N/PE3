import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class VowelRemovalTest {
    VowelRemoval object;
    @Before
    public void setUp() {
        object = new VowelRemoval();
    }

    @After
    public void tearDown() throws Exception {
        object = null;
    }

    @Test
    public void testVowelRemovalSuccess() {
        String[] input = {"India","Germany","United States"};
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("Ind");
        expectedOutput.add("Grmny");
        expectedOutput.add("Untd Stts");
        assertEquals(expectedOutput,object.removeVowel(input));
    }

    @Test
    public void testVowelRemovalFailure() {
        String[] input = {"iaa","ieu","uei"};
        assertNotNull(object.removeVowel(input));
    }
}