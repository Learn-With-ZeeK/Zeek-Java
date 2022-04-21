/*The varrags(VariableArguments) allows the method to accept zero or multiple arguments
If we don't know how many argument we will have to pass in the method.*/

/*Create a method that can 
Take sum of any no of integer using array and for each loop(VariableArguments)*/


package com.company;
public class Zeek_33_VariableArguments {
	
	//int...arr- Creates an array that stores integer.
	
	public static int sum(int...arr) {
		int result=0;
		for(int e:arr) {
		result=result+e;       // you can also write (result+=e)
		    }
		return result;
	   }

	public static void main(String[] args) {
		
		System.out.println("Sum of 1 and 2 is:"+sum(1,2));	
		System.out.println("Sum of 1,2 and 5 is:"+sum(1,2,5));
		System.out.println("Sum of 1,2,4 and 5 is:"+sum(1,2,4,5));
		System.out.println("Sum of 1,2,4,6 and 5 is:"+sum(1,2,4,6,5));
        }
}
