package com.stackroute.pe3;

//Write a java program to calculate first and last date of a week.

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class DateCalculation {

    public String firstAndLastDay(){
        String firstLastDay = "";
        Calendar calender = Calendar.getInstance();
        calender.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy EEE");
        firstLastDay = dateformat.format(calender.getTime())+"\n";
        for (int i = 0; i <6; i++) {
            calender.add(Calendar.DATE, 1);
        }
        firstLastDay = firstLastDay + dateformat.format(calender.getTime());
        return firstLastDay;
    }

}