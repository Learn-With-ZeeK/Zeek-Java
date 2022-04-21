package com.company;

public class Zeek_24_ContinueInLoop {
public static void main(String[] args) {
		
		int i=20;
		while(i<=30) {
			System.out.println(i);
			i++;
			if(i==23) {System.out.println("23 is my roll no");
			continue;}
			
			System.out.println("Java is best");
		}
		
	}

}
//when 22 is printed the value of i is 23 then continue statement comes and "Java is best" String is ignore