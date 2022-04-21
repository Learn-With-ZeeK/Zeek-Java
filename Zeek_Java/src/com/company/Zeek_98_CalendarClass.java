/*
 Gregory calendar is calendar we use in our day to day life.
 It has 12 months from January to December
 30 or 31 days in each month except February.
 In February 28 days(not a leap year) or 29 days when its a leap year 
  */



package com.company;

import java.util.Calendar;

public class Zeek_98_CalendarClass {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getCalendarType());
		System.out.println(c.getTimeZone());
		
		System.out.println(c.getTimeInMillis());

	}

}
