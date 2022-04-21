/*
--> Anonymous class is an inner class without a name, which means that
    we can declare and instantiate class at the same time. 

--> A lambda expression is a short form for writing an anonymous class. 
--> By using a lambda expression, we can declare methods without any name 
 
 Write a code using two interfaces similar in working but
 --> Use anonymous class to implement first interface  &
 --> Use lambda expression to implement another interface
 */



package com.company;

interface Run{
	void speed(int a);
	
}
interface Walk{
	void walking(int b);
}


public class AdvanceJava_AnonymousClass_LambdaExpression {

	public static void main(String[] args) {
	
    //Using Anonymous Class without lambda expression 
	  Walk w= new Walk() {  
		     public void walking(int b) {
			 System.out.println("You are running at: "+b+" m/s");
		      }
	    };
	w.walking(2);	
		  
		
	//Using Anonymous Class WITH lambda expression 	
	Run r1 = (a)->{System.out.println("You are running at: "+a+" m/s");};
	
	 r1.speed(13);
	
	
	}
}
