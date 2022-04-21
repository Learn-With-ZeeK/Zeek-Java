/*
 --> Getting Today's Date using Java  
 
 --> Methods like 
 --> getDate(),getDay(),getHours(),getMinutes(),getSeconds(),etc
 --> Are depricated in new Java Documentation but in elipse IDE somehow works 
 */

package com.company;

import java.util.Date;

public class Zeek_97_NewDateTime {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		
		System.out.println("Seconds: "+d.getSeconds());
	
		System.out.println("Minutes: "+d.getMinutes());
		System.out.println("Hours: "+d.getHours());
		System.out.println("Day: "+d.getDay());
		System.out.println("Date: "+d.getDate());
	}

}
