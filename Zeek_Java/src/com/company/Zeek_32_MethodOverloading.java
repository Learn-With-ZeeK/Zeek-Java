/*
If a class
has multiple methods having same name but different in parameters, 
it is known as Method Overloading.

void: Method that returns nothing.Return type-null,(cannot use return statement )

static: All object in a class shares static method.
*/


package com.company;

public class Zeek_32_MethodOverloading {
	public static void hello() {
		System.out.println("Hello Zeek");	
	}
	
	public static void hello(int a) {
		System.out.println("Hello Zeek"+a);	
		}
	
	public static void hello(int a,int b) {
		System.out.println("Hello Zeek"+a+", ID:"+b);	
	}
	
	
	public static void main(String[] args) {
		//METHOD OVERLOADING
		hello();         //Method name hello with no parameter
		hello(91490);    //Method name hello with one integer parameter
		hello(91490,20); //Method name hello with two integer parameters
	}
}
