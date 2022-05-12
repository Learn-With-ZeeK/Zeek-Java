//Print Multiplication table of number. Get number from user. 

package com.company;

import java.util.Scanner;

public class Zeek_Ch05_PractiseSet2 {
	 public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the number whose multiplication you want:");
			int n=sc.nextInt();
			System.out.printf("Multiplication table of %d is",n);
			
			for(int i=0;i<21;i++) {
			System.out.printf("\n %d X %d = %d",n,i,n*i);	
			}

}
}
