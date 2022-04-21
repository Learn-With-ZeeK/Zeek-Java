/*
  Sometimes during writing codes.There are some parts that can throw runtime errors.
  Because of few runtime errors the entire code crashes(Entire Code cannot run).
  
  In order to make sure that the entire code does not crash we introduced concept of Exception Handling.
  
   IN OTHER WORDS-->  Exception Handling in Java is one of the powerful mechanism to handle the
                      runtime errors so that the normal flow of the application can be maintained.
  
 Java provides five keywords that are used to handle the exception. 
try , catch , finally , throw , throws
 
 In this java file we understand about try catch concept-	
	

--> try:  The "try" keyword is used to specify a block where we should place an exception code. 
          It means we can't use try block alone. 
          The try block must be followed by either catch or finally.

--> catch: The "catch" block is used to handle the exception. 
           It must be preceded by try block which means we can't use catch block alone.
           It can be followed by finally block later.

-->  Write a code using try catch  in such a way that the last line of code is executed 
-->  Even though it has a runtime error
-->  And Print the exception that we are handling.
*/

package com.company;

import java.util.Scanner;

public class Zeek_80_TryCatchBlock {

	public static void main(String[] args) {
		
		
		int a=6000;
		Scanner sc=new Scanner(System.in);
					
		System.out.println("Enter a number: ");
		int b=sc.nextInt();
		
		try {
		System.out.printf("Integer part of 6000 divided by %d is: ",b);
		System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("We failed because- ");
			System.out.println(e);
		}
		
		System.out.printf("End of Program...");
		
   }
}
