//Check whether the number you have input is integer or not

package com.company;

import java.util.Scanner;
public class Zeek_Ch01_PractiseSet2 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Number:");
		
		boolean b1= sc.hasNextInt();
		System.out.println(b1);
		
		//If else is Optional you don't need it but you can use it to make code better
		if (b1==true) {
			System.out.println("Your number is  an integer");	
		}
		else{
			System.out.println("Your number is not an integer");	
		}
		
	}

}
