//Write code for following conditions
//(Physics, Chemistry ,Math)-Passing Marks in all 3 or else fail the exam.(compulsory Subjects)
//(English,Hindi)-Passing Marks in one or both to pass the exam.(optional subjects)
//Passing Marks-33
//Get marks by getting input from user

package com.company;
import java.util.Scanner;
public class Zeek_17_RelationalLogicalOperators {
	 public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Physics marks:");
            int p= sc.nextInt();
            
            System.out.println("Enter Chemistry marks:");
            int c= sc.nextInt();
            
            System.out.println("Enter Math marks:");
            int m= sc.nextInt();
            
            System.out.println("Enter English marks:");
            int e= sc.nextInt();
            
            System.out.println("Enter Hindi marks:");
            int h= sc.nextInt();
            
            if( p>32 && c>32 && m>32 && (e>32|h>32) ) {
            	System.out.println("You passed");	
            	
            }
            else {
            	System.out.println("You failed");
            }
            
}}

// ( p>32 && c>32 && m>32 && (e>32|h>32) )    For this block to run  

//Means  p should be true
//Means  c should be true
//Means  m should be true
//(e>32|h>32) should be true
//(e>32|h>32) will be true if any one of the two conditions are true

//   Code for Multiple Conditions, &&-AND gate,| -OR gate,!-NOT gate,
