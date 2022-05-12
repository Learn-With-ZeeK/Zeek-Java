//Print sum of first n even integers.Take value of n from user

package com.company;

import java.util.Scanner;

public class Zeek_Ch05_PractiseSet1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n= sc.nextInt();
		
		int sum=0;
		
		for(int i=0;i<n;i++) {
			sum=sum + 2*i;
		}
		System.out.printf("Sum(Starting from 0) of first %d  even integers is: ",n);
		System.out.println(sum);
	 }
}



			
		
