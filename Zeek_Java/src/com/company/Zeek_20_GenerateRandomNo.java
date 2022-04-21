package com.company;

import java.util.Scanner;

public class Zeek_20_GenerateRandomNo {
	 public static void main(String[] args) {
				
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter\n0 for Rock,\n1 for Paper,\n2 for Scissor:");
				int x= sc.nextInt();
				switch(x) {
				  case 0:
				     {System.out.println("You have chosen rock");}
				     break;
				  case 1:
				     {System.out.println("You have chosen paper");}
				     break;
				  case 2:
				     {System.out.println("You have chosen scissor");}
				     break;  
			     default:
			     {System.out.println("ERROR:You can enter 0,1 or 2 only");}
			     break;
				}
				System.out.println("\nNow computer chooses");
				
				
				int x2= (int) Math.floor((Math.random()*100)%3);
				
				switch(x2) {
				  case 0:
				     {System.out.println("Computer has chosen rock");}
				     break;
				  case 1:
				     {System.out.println("Computer has chosen paper");}
				     break;
				  case 2:
				     {System.out.println("Computer has chosen scissor");}
				     break;  
			     default:
			     {System.out.println("ERROR");}
			     break;
					}
			
				
				if((x==0 && x2==2)|(x==2 && x2==1)|(x==1&& x2==0)){
					System.out.println("\n  You Win ");
					}
				
			    else if((x==0 && x2==1)|(x==2 && x2==0)|(x==1&&x2==2)){
			    	System.out.println("\n  Computer  Wins ");
			    	}
				
				else if((x==0 && x2==0)|(x==2 && x2==2)|(x==1&&x2==1)){
					System.out.println("\n  This is draw");
					}
				
				else {System.out.println("Error");}
					
}}
