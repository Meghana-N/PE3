import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class DateCalculation {

    public String firstAndLastDay(){
        String firstLastDay = "";
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEE");
        firstLastDay = df.format(cal.getTime())+"\n";
        for (int i = 0; i <6; i++) {
            cal.add(Calendar.DATE, 1);
        }
        firstLastDay = firstLastDay + df.format(cal.getTime());
        return firstLastDay;
    }

}