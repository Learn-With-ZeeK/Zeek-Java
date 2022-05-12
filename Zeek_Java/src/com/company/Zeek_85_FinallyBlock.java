/*

--> Java finally block is a block used to execute important code such as closing the connection, etc.

--> Java finally block is always executed whether an exception is handled or not. 
--> Therefore, it contains all the necessary statements that need to be printed
    regardless of the exception occurs or not.

--> The finally block follows the try-catch block.

 Why use Java finally block?
 
--> finally block in Java can be used to put "cleanup" code
    such as closing a file, closing connection, etc.
    
--> The important statements to be printed can be placed in the finally block.


--> Write a code and show whether an exception is handled or not finally block is executed either way
  */




package com.company;

import java.util.Scanner;

public class Zeek_85_FinallyBlock {

	public static void main(String[] args) throws ArithmeticException  {
		
	int a=200;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a number:");
	int b=sc.nextInt();	

	try {
		System.out.println("Integer Value of 200 divided by number is: "+  a/b);
		}
	catch(Exception e) {
		System.out.println(e);	
	}
	finally {
		System.out.println("....CODE ENDS HERE...");	
	}
    }
}
