 //Calculate Board percentage using user user input for 5 subjects...

 //Use float or double because percentage can be in decimals
package com.company;

import java.util.Scanner;

public class Zeek_06_BoardPercentage {
	public static void main(String[] args) {
		
		System.out.println("5 subjects with maximum 100 marks for each subject");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks of 1st subject:");
		float a= sc.nextInt();
		
		System.out.println("Enter Marks of 2nd subject:");
		float b= sc.nextInt();
		
		System.out.println("Enter Marks of 3rd subject:");
		float c= sc.nextInt();
		
		System.out.println("Enter Marks of 4th subject:");
		float d= sc.nextInt();
		
		System.out.println("Enter Marks of 5th subject:");
		float e= sc.nextInt();
		
		float f=a+b+c+d+e;
		float g= (f*100)/500;
		System.out.println("Your total marks out of 500 is  "+f);
		System.out.println("Your overall percentage is  "+g);
	}
	
}
