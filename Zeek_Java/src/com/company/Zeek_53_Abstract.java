/*
--> Abstract in English means existing in thought or as an idea without concrete existance.
 
--> Abstract method is a method that is declared without an implementation.
--> Abstraction is a process of hiding the implementation details and showing only
    functionality to the user.

--> A class may have one or more than one method 
--> But even if one method is abstract then entire class becomes abstract.

--> If you are inheriting an abstract class then there are 2 possibilities

-->   1st__The Sub class(Child class) inheriting Super Class(Parent Class) should
      override all the abstract methods that exists in Super Class.

-->   2nd__The Sub class(Child class) inheriting Super Class(Parent Class) should
      become abstract class itself
*/

package com.company;

abstract class Parent{
	 Parent(){
		 System.out.println("I am a constructor in Base1");
	 }
	 public void hello() {
		 System.out.println("Hello Zeeshan!"); 
	 }
	 abstract void greet();  //This void is an abstract because implementation is incomplete.
	 abstract void greet2();
}


class firstChild extends Parent {
	//If you do not override greet() and greet2() then firstChild class becomes abstract. 
	
	public  void greet() {
		 System.out.println("Good Morning");
	}
	
	public  void greet2() {
		 System.out.println("Good Afternoon");
	}
}


abstract class secondChild extends Parent{
	
}

public class Zeek_53_Abstract {

	public static void main(String[] args) {
		
		firstChild f = new firstChild();
		
		f.greet();
		f.greet2();
		
		//secondChild s= new secondChild();    
		
		//Will throw ERROR Since secondChild is an abstract class
     }
 }
