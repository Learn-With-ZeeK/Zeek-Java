/*
Recursion in java is a process in which a method calls itself continuously till the end.
  A method in java that calls itself is called recursive method
  for example- return n* factorial(n-1); 
  */

package com.company;

public class Zeek_34_JavaRecursions {
	public static int factorial(int n){
		
		if(n==0|n==1) {
			return 1;	
		}
		else {
			return n* factorial(n-1); 
		}
	}

	public static void main(String[] args) {
		System.out.println("The value of 5 factorial is: "+factorial(5));	
	}
}
