//Write a code which satisfies centain conditions
//3 subjects(Physics,Chemistry,Maths) each subject maximum marks 100
//For passing- Each subject marks atleast 33% and overall atleast 40%


package com.company;

import java.util.Scanner;

public class Zeek_Ch04_PractiseSet1 {
	 public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Physics marks:");
			int p= sc.nextInt();
			
			System.out.println("Enter your Chemistry marks:");
			int c= sc.nextInt();
			
			System.out.println("Enter your Mathematics marks:");
			int m= sc.nextInt();
			
			int t= p+c+m;
			int x= 120; //40% of 300(Total maximum marks)
			
			if(p>32 && c>32 && m>32 && t>=x) {
				System.out.println("You Passed");	
			}
			else if(p>32 && c>32 && m>32 && t<x) {
				System.out.println("You Failed because your overall is less than 40%");
			}
			else {
				System.out.println("You Failed ");
			}
			
			}
}



