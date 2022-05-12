//Ask the user to input a string and replace the space in string with an underscore and print

package com.company;
import java.util.Scanner;
public class Zeek_Ch03_PractiseSet1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your string:");
		String str= sc.nextLine();
		String str1= str.replace(" ", "_");
		
		System.out.println(str1);
	}  
}
