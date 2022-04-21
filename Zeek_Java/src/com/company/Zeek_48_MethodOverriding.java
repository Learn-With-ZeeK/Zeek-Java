/*
----->Method Overriding- In Java If subclass (child class) has the same method as declared in the parent class
--->Method overriding is used for runtime polymorphism.

>>>  RULES FOR   Method Overriding IN JAVA
---> The method must have the same name as in the parent class
---> The method must have the same parameter as in the parent class.
---> There must be an IS-A relationship (inheritance).

--->  In this java file, method2() is overridden in ClassY from ClassX
*/
package com.company;

class ClassX{
	public  void method1(){
		System.out.println("Method 1 of ClassX");	
	}
	public  void method2(){
		System.out.println("Method 2 of ClassX");	
	}
}
	
class ClassY extends ClassX {
	@Override
	public  void method2(){
		System.out.println("Overriden Method 2 from ClassX into ClassY");	
	}
}
	


public class Zeek_48_MethodOverriding {
	public static void main(String[] args) {

		ClassX x=new ClassX();
		x.method2();
		
		ClassY y= new ClassY();
		y.method2();
	}
}
