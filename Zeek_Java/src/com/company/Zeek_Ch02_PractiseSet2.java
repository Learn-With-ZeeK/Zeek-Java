//Calculate uniform acceleration(a)  by taking value v,u, and s from user.

package com.company;

import java.util.Scanner;
 
public class Zeek_Ch02_PractiseSet2 {
	public static void main(String[] args) {
				
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of final velocity in m/s, V: ");
		float v= sc.nextFloat();
		
		System.out.println("Enter value of initial velocity in m/s, U: ");
		float u= sc.nextFloat();
		
		System.out.println("Enter value of distance covered in m, S: ");
		float s= sc.nextFloat();

		float a= (v*v-u*u)/(2*s);
		 
		System.out.println("The value of uniform acceleration is:   "+ a +" m/s^2");
   }
 }

