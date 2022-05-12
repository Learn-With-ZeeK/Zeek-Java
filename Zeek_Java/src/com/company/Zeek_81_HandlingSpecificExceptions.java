/*
Write a code which deals with specific unchecked exceptions specifically.
For eg-  If Arithmetic Exceptions occurs print an instruction.
         If ArrayIndexOutOfBoundsException  occurs print different instruction ,etc
*/

package com.company;

import java.util.Scanner;

public class Zeek_81_HandlingSpecificExceptions {

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
	
	 try {
	 System.out.println("The value of array-index is: "+marks[a]);
	 System.out.println("The integer value of array-index divided by number is: "+marks[a]/b);
	 }
	
	 catch(ArithmeticException e1 ) {
		System.out.println("The computer cannot divide array-index-value by 0.");	
		System.out.println(e1);
	 }
	
	 catch(ArrayIndexOutOfBoundsException e2) {
		System.out.println("The computer does not have array-value with that index");	
		System.out.println(e2);
	 }
	 
	 catch(Exception e3) {	
			System.out.println(e3);
	}
 }

}


			
			
			
			
		
