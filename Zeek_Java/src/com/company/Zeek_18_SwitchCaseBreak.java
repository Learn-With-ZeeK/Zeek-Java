//We can use Switch case break for Strings, Integer and characters.
//In this code we used switch case for strings and integers.
//break statement is used to break the loop irrespective of where it is used

package com.company;
import java.util.Scanner;

public class Zeek_18_SwitchCaseBreak {
	 public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter first,middle or last part of my name:");
			String name= sc.nextLine();
			
		    System.out.println("Enter an age");
			int age= sc.nextInt();
			
	      switch(name) {
		    
		    case "Zeeshan":
		    {System.out.println("Zeeshan is  first part of my name ");}
		    break;
		    
		    case "Ahmad":
		    {System.out.println("Ahmad is  middle part of my name ");}
		    break;
		    
		    case "Khan":
		    {System.out.println("Khan is  last part of my name ");}
		    break;
		    
		    default:
		    {System.out.println("Your response is  not a part of my name ");}
		    break;
		     }
			
			
			switch(age) {
			
			   case 18:
			    {System.out.println("I have entered college at 18 ");}
			    break;
			    
			    case 23:
			    {System.out.println("I started a job at 23");}
			    break;
			    
			    case 60:
			    {System.out.println("I will be retired at 60 ");}
			    break;
			    
			    default:
			    {System.out.println("Enjoying my Life ");}
			    break;
			
			       }
	}
}



	