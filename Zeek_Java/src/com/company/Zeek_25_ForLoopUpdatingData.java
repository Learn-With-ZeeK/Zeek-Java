//Use for loop and updating data to find factorial of a number.

package com.company;

import java.util.Scanner;
public class Zeek_25_ForLoopUpdatingData {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n= sc.nextInt();
	
		int factorial=1;
		
		for(int i=n;i>0;i--) {
			factorial=factorial*i;
		}
	
		System.out.println("The value of n factorial is:"+factorial);
	}

}