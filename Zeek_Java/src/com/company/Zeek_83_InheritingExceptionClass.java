/*
  (CUSTOM OR USER-DEFINED) EXCEPTIONS
 
 Sometimes in real life(or different scenarios) there are things that are not right or appropriate
 but computer has no issues with it.
 
 For example- Age of a person is not negative
              Age of a person is generally not more than 200 years.
              
 So we want computer to treat these circumstances as an Exception.
 
 Therefore we create our own custom Exception Class which inherits features of  Exception Class.
 
 Hence,Exception Class is----------> parent class
       Custom Exception Class is---> child class
       
 Some important methods we can override when we inherit Exception Class:
 
 toString();    -------> return type is String
                         Executed When... System.out.println();...is used
 
 printStackTrace();----> return type is void(i.e-null)
                         prints stack trace.
 
 getMessage();   -------> return type is string
                          prints exception message
                          Executed When... System.out.println();...is used
                          
 Write a code which takes age from user and throws exception if
 --> age is negative or age is more than 200  [i.e (age<0 | age>200)]
 
 Override getMessage() and toString()

 Check what printStackTrace() prints...
 
 */




package com.company;

import java.util.Scanner;

class MyExceptions extends Exception{
@Override
	public String toString() {
		return "Age should be between 0 to 200";
	}

@Override
    public String getMessage() {
        return "Enter realistic age.";
   }


}
public class Zeek_83_InheritingExceptionClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter age:");
		int age=sc.nextInt();
		
    if(age<0 |age>200) {
    	
    	try {
    		throw new MyExceptions();  //Throwing my custom Exception class
    	}
    	catch(Exception e)
    	{
    		System.out.println(e.getMessage());	
    		
    		System.out.println(e.toString());
    		
    		e.printStackTrace();
    		
    		System.out.println("GoodBye.");
    	}
    	
    }
   
    System.out.println("The END");
   }

}
