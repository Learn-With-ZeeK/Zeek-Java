package com.company;

import java.util.Scanner;

public class Zeek_05_UserInput {
	 public static void main(String[] args) {
			System.out.println("Calculator");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Number-1:");
			int a=sc.nextInt();
			
			System.out.println("Enter Number-2:");
			int b=sc.nextInt();
			
			int sum=a+b;
			int minus=a-b;
			int multiply= a*b;
			int divide= a/b;
			
			System.out.println("The sum of two numbers is:"+sum);
			System.out.println("The subtraction of two numbers is:"+minus);
			System.out.println("The multiplication of two numbers is:"+multiply);
			System.out.println("The quotient of division of two numbers is:"+divide);
			
			
		}
	}
//Importing scanner class by import java.util.Scanner;
//System.in means read from keybord i.e take input from user
// nextInt to input and assign integer value 
