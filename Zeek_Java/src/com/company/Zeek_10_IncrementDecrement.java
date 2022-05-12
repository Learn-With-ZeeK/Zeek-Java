package com.company;

public class Zeek_10_IncrementDecrement {
	public static void main(String[] args) {
		
		System.out.println("a++ and ++a working"); 
		
		System.out.println("..................."); 
		
		int a=10;
  //		 a++ means first value assigned then increment is done
		
		System.out.println("The value of a is:  "+  a);  
		System.out.println("The value of a++ is:  "+   a++);          //Will print a as it is {i.e(10 is printed)}
		System.out.println("The value of a after a++ is:  "+   a);    //Now print incremented value of a{i.e(11)}
		
		System.out.println("..................."); 
		
		int b=20;
//      ++b means first increment then value assigned
		
		System.out.println("The value of b is:  "+   b); 
		System.out.println("The value of ++b is:  "+   ++b);  //Will print incremented value of b{i.e(21)}
		
		System.out.println("..................."); 
		
		char ch='x';
		System.out.println("The value of ch is:  "+ ch); 
		System.out.println("The value of ++ch is:  "+  ++ch); //Will print incremented value of ch{i.e(y)}
	}

}
