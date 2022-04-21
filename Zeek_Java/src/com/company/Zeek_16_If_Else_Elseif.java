//Write a program which asks for age and then tells you what you can drive at that age by using if_else conditionals
// and use logical operators for multiple conditions. && is AND Gate.

package com.company;

import java.util.Scanner;

public class Zeek_16_If_Else_Elseif {
	 public static void main(String[] args) {
			
            Scanner sc=new Scanner(System.in);
			
            System.out.println("Enter your age");
			int age= sc.nextInt();
			
			if(age<=3) {
				 System.out.println("You can drive children bicycle.");	
			}
			
			else if(age>3 && age<=10) {
				 System.out.println("You can drive a bicycle.");
			}
			//(age>3 && age<=10) means both conditons must be met for block to execute. 
			
			else if(age>10 && age<=16) {
				 System.out.println("You can drive a motorbicycle");
			}
			
			else if(age>16 && age<18) {
				 System.out.println("You can drive a motorbike");
			}
			
			else if(age==18) {
				 System.out.println("Congrats.You are an adult you can drive car under supervision");
			}
			
			else {
				 System.out.println("You can drive a car");
			}
}
}