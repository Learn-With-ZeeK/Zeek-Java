/*
 Write a method multiplication that gives multiplication table  and use it in main method

  Create a method for this pattern            Create a method for this pattern1
  *                                           **** 
  **                                          ***
  ***                                         **
  ****                                        *

 Create a method to find sum of first n natural numbers and use it in main method
 */

package com.company;
public class Zeek_Ch07_PractiseSet1 {

	public static void multiplication(int n) {
		System.out.printf("Multiplication table of n is:");
		System.out.println(" ");
		for(int i=0;i<11;i++) {
			System.out.printf("%d X %d = %d",n,i,n*i);
			System.out.println(" ");
		     }
		}
	
	 public static void pattern(int n) {
		for (int i=0;i<n;i++) {
			
			for (int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}	
	}
	 public static void pattern1(int n) {
		for (int i=n;i>0;i--) {
			
			for (int j=0;j<i;j++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}	
	}
	 public static int sumNatural(int n) {
		if(n==1) {
			return 1;
		}
		else {
			 	return n+ sumNatural(n-1);
		}
	}
	
	
	
	public static void main(String[] args) {
		multiplication(3);
		pattern(4);
		pattern1(4);
	     int c=	sumNatural(3);
	     System.out.print(c);
	}

}
