/*
 Explain examples of Syntax,Logical and Runtime errors while coding.
  */

package com.company;

import java.util.Scanner;

public class Zeek_79_Errors {

	public static void main(String[] args) {
	
		//int a =50      [ERROR- Syntax-Error(NO SEMICOLON)]
        // b=1 ;          [ERROR- Syntax-Error(NO Data-Type Declared)]
		
		
		//LOGICAL ERRORS
		//Print prime numbers between 1 to 10.
		
		System.out.println(2);
		for(int i=1;i<5;i++) {
			System.out.println(2*i+1);	// (9 is not prime number.Hence Logical Error)
		}
		
		//RUNTIME ERROR
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int k=sc.nextInt();
		
		System.out.println("Integer part when 1000  divided by k is: "+ 1000/k);
		
		//If you put value of k as zero(0) the error is runtime error
		
	}

}




		
			
		