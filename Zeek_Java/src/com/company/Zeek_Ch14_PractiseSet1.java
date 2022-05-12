/*
--> Create an array of index 6.

--> Write a code  which allows user to keep accessing an array
    until a valid index is given.

--> If user accesses a valid index make sure code finishes. 
    
--> You have 5 chances to access an array.

--> After 5 chances make sure Code throws a custom exception error.

*/



package com.company;

import java.util.Scanner;

class OutOfChances extends Exception{
	public String toString() {
		return "You had 5 chances. Out of Chances Now";
	}
}

public class Zeek_Ch14_PractiseSet1 {

	public static void main(String[] args) {
		int[] score= new int[6];
		
		score[0]=90;
		score[1]=34;
		score[2]=23;
		score[3]=68;
		score[4]=97;
		score[5]=96;
		
		boolean flag=true;
		
	 int index;
	 int i=0;
	 
	 Scanner sc=new Scanner(System.in);
	 
	  while(flag && i<5) {
		
			try {
			System.out.println("Enter value for index of array:");
			int a=sc.nextInt();
			System.out.println("Value Stored in array at this index is: "+score[a]);
			
			break;
			}
			
			catch(Exception e) {
				System.out.println("Invalid Index Value");
				i++;
			}
			
	  }
	  
	  if(i>=5) {
		 try {
			 throw new OutOfChances();
		  }
		 
		 catch(Exception e){
			 System.out.println(e.toString());	 
		  }
		 
		 finally {
				System.out.println("....CODE ENDS HERE...");	
	     }
	  }
     }

}
