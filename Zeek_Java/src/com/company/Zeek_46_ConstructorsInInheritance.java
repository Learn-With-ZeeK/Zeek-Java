/*
 * INHERITANCE HIERARCHY-The constructors are executed in order 1 -> 2 -> 3
 *   [1]Parent --> [2]Child --> [3]Grandchild
 *    i.e- When you create object of Grandchild class
 *    --> parent class constructor executed first
 *    --> child class constructor executed second
 *    -->grand-child class constructor executed third and so on.
 *    --> super keyword used to choose between constructors when more than 1 overloaded constructors
 * */


package com.company;
 

class Base1{
	public static void SectionSepartion(){        //Helps by becoming border in console
		System.out.println("...................");
		
	}
	
	//Constructor in Base1 class 
	Base1(){
		System.out.println("I am a constructor from class Base1 ");
	}
	Base1(int a){
		System.out.println("I am an overloaded constructor from class Base1 with a as value: "+a);
	}
}
   
   class Derived1 extends Base1{
	  
	 //Constructor in Derived1  class with super keyword 
	   Derived1(){
		   super(0);
           //super(0)-Used to take constructor with integer a as parameter with 0 value.
		   System.out.println("I am a constructor from class Derived1 ");
	   }
	   Derived1(int x){
		   System.out.println("I am an overloaded constructor from class Derived1 with x as: "+x); 
	   }
	}
 

public class Zeek_46_ConstructorsInInheritance {
   public static void main(String[] args) {
	    
	   System.out.println("This is output of class Base1: \n");
		Base1 b= new Base1();
		
		b.SectionSepartion();
		
		System.out.println("This is output of class Derived1(super used): \n");
		Derived1 d= new Derived1();
		//Constructor in class Base1 is also printed on class Derived1
		//Constructor from class Base1 is printed first and Derived1 constructor later
		//When more than 1 overloaded constructor use super keyword to choose constructor.
		//Here super keyword takes integer a as constructor from base class
		
		d.SectionSepartion();

		System.out.println("This is output of class Base1 with parameter a: \n");
		Base1 b1= new Base1(10);
		
		b1.SectionSepartion();
		
		System.out.println("This is output of class Derived1 with parameter a (no super): \n");
		Derived1 d1 = new Derived1(6);
		
		
	}
}
