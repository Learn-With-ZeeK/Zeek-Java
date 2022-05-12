//Write a code which tells us that the given number is greater than the number defined by user

package com.company;

import java.util.Scanner;

public class Zeek_Ch02_PractiseSet1 {
   public static void main(String[] args) {
		
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Your Number:");
	   int a= sc.nextInt();
	   
	   System.out.println("Number greater than User-Defined number then true, else false");
	   
	   System.out.println(a>18);//18 is user defined number
	   
	} 
}
