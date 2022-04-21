/*
In Java, using a try block inside another try block is permitted. 
It is called as nested try block.


For example, the inner try block can be used to handle ArrayIndexOutOfBoundsException while 
             the outer try block can handle the ArithemeticException (division by zero).

Write a code in which the inner block handles ArithemeticException and ArrayIndexOutOfBoundsException
But outer block NumberFormatException

 */

package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zeek_82_NestedTryBlock {

	public static void main(String[] args) {
		int[] marks=new int[5];
		 
	      marks[0]=23;
	      marks[1]=45;
	      marks[2]=64;
	      marks[3]=89;
	      
	    Scanner sc=new Scanner(System.in);
	  	
	    System.out.println("Enter the array-index: ");
		int a=sc.nextInt();
		
		 System.out.println("Enter the number: ");
		 int b=sc.nextInt();
    //Outside Try Block	
    try {
		 //Inside Try Block
		 try {
		 System.out.println("The value of array-index is: "+marks[a]);
		 System.out.println("The integer value of array-index divided by number is: "+marks[a]/b);
		 }
		//Inside Catch Block
		 catch(ArithmeticException e1 ) {
			System.out.println("The computer cannot divide array-index-value by 0.");	
			System.out.println(e1);
		 }
}

   //Outside Catch Block	 
    catch(ArrayIndexOutOfBoundsException e2) {
	     System.out.println("The computer does not have array-value with that index");	
	     System.out.println(e2);
    }

   }
}
