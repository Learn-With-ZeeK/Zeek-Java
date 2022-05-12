/*
 --> Date in java is stored in form of a long number.
 
 --> This long number[currentTimeMillis()] holds the number of milliseconds passed 
     since 1 January 1970 till now .
  
*/



package com.company;

public class Zeek_96_DateAndTime {

	public static void main(String[] args) {
		
		System.out.print("Number of milliseconds passed since 1 January 1970: ");
		System.out.println(System.currentTimeMillis());

		System.out.println(".........................................");
		
		System.out.print("Number of seconds passed since 1 January 1970: ");
		System.out.println(System.currentTimeMillis()/1000);
		
		System.out.println(".........................................");
		
		System.out.print("Number of minutes passed since 1 January 1970: ");
		System.out.println(System.currentTimeMillis()/1000/60);
		
		System.out.println(".........................................");
		
		System.out.print("Number of hours passed since 1 January 1970: ");
		System.out.println(System.currentTimeMillis()/1000/3600);
		
		System.out.println(".........................................");
		
		System.out.print("Number of days passed since 1 January 1970: ");
		System.out.println(System.currentTimeMillis()/1000/3600/24);
		
		System.out.println(".........................................");
		
		System.out.print("Number of years passed since 1 January 1970: ");
		System.out.println(System.currentTimeMillis()/1000/3600/24/365);
		
		System.out.println(".........................................");
		
		System.out.print("Number of decades passed since 1 January 1970: ");
		System.out.println(System.currentTimeMillis()/1000/3600/24/3650);
	 }

}
