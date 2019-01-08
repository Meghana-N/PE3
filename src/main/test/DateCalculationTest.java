import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateCalculationTest {

    DateCalculation dayOfWeek;

    @Before
    public void setUp()
    {
        dayOfWeek=new DateCalculation();
    }

    @After
    public void tearDown()
    {
        dayOfWeek=null;
    }

    @Test
    public void testDayOfWeekSuccess()
    {
        String expectedlValue="07/01/2019 Mon"+"\n"+"13/01/2019 Sun";
        String actualValue=dayOfWeek.firstAndLastDay();
        assertEquals(expectedlValue,actualValue);
    }

    @Test
    public void testDayOfWeekFailure()
    {
        String expectedlValue="27/01/2019 Mon"+"\n"+"13/01/2019 Sun";
        String actualValue=dayOfWeek.firstAndLastDay();
        assertNotEquals(expectedlValue,actualValue);
    }

    @Test
    public void testDayOfWeekNeutral()
    {
        String expectedlValue="07/01/2019 Mon"+"\n"+"13/01/2019 Sun";
        String actualValue=dayOfWeek.firstAndLastDay();
        assertNotNull(expectedlValue,actualValue);
    }

}