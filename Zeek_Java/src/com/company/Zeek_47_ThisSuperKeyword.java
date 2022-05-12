/*
 ----> this is a reference keyword
 -->  i.e variable name in method and class parameter same then for convenience use this keyword for reference
 -->  for ex: this.a = a;  [a = a; is confusing and sometimes error]
 -->  this.a is reference of 'a' from parameter set in class.
 -->  'a' is parameter set in method.
   
------> super is a reference variable used to refer immediate parent class object.
 --> Can be used to invoke immediate parent class object  
 --> Can be used to invoke parent class methods.
 --> Can be used to invoke parent class constructors. 
  */


package com.company;

class ClassA{
	
	ClassA(){
		System.out.println("Original constructor ClassA");
	     }
	
	ClassA(int a){
		System.out.println("Overloaded constructor ClassA with a value as: "+a);
	     }
	
	ClassA(int a,int b){
		System.out.printf("Overloaded constructor ClassA with a as %d and b as %d",a,b);
		System.out.println(" ");
	      }
}
class ClassB extends ClassA{
	ClassB(){
		super(5,6);
		
	    System.out.println("Original constructor ClassB");
		/* ...................................................
		  If super not used- ClassA() constructor without parameters used.
		  
		  ClassA(){
		System.out.println("Original constructor ClassA");
	     }
		  ..........................................................
		  */
		
		/* ................................................................
		  If super(5,6) used- ClassA() constructor with  parameters a and b used.
		 
		 ClassA(int a,int b){
		System.out.printf("Overloaded constructor ClassA with a as %d and b as %d",a,b);
		System.out.println(" ");
	     }
		 ........................................................................
		  */
		}
		
	}


public class Zeek_47_ThisSuperKeyword {
	public static void main(String[] args) {
		ClassB Bclass= new ClassB();
	}
 }
