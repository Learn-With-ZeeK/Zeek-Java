/*
 throw and throws is the concept of Exception Handling.
 
 throw -->  throw keyword throw the exception explicitly from a method or a block of code.
            (Usually inside try block)
       -->   throw is used within the method.
 
 throws-->  throws keyword is used in the method signature to declare an exception which might be
            thrown (by the function) while the execution of the code.
       -->  throws is used with the method signature.
  
  
--> Write a code to Calculate area of a circle of radius r
--> Take radius(r) as an input from user

--> Create a Custom  Exception class that  gives exception for Negative Radius
--> Use throw and throws keywords.

 */

package com.company;

import java.util.Scanner;

class NegativeRadiusException extends Exception{
	public String toString() {
		return "Radius of circle cannot be negative";
	}
}

class Area {
	public static void AreaCircle() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Radius:");
		int r=sc.nextInt();
		
   if (r<0) {
			try {
				throw new NegativeRadiusException();
			}
			
			catch(Exception e){
				System.out.println(e.toString());	
				e.printStackTrace();
			}
	}
    else {	
	      double Area= Math.PI* r*r;
	      System.out.println("Area of Circle: "+Area);  
	}
	}
}

public class Zeek_84_ThrowVSThrows {
    public static void main(String[] args) throws NegativeRadiusException {
    	Area x= new Area();
    	x.AreaCircle();
	}
} 
