/*
--> get Railway Time(24 hour clock time)
--> get 12hour clock time
--> get day and date 
 
  Use Gregorian Calendar.
  
 */


package com.company;

import java.util.Calendar;

public class Zeek_99_GregorianCalendar {

	public static void main(String[] args) {
		Calendar c= Calendar.getInstance();
		
		System.out.println(c.getTime());
	
System.out.println("________________________________");
		
System.out.println("Date: "+c.get(Calendar.DATE)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.YEAR));

System.out.println("________________________________");

System.out.print("12 hour Clock ");
System.out.println("Time- "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

System.out.println("________________________________");

System.out.print("24 hour Clock ");
System.out.println("Time- "+c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

	}

}
