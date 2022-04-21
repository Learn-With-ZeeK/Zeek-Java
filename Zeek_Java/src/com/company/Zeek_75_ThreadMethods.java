/*
      Thread Methods:
--> start() – Starts the thread.
--> getState() – It returns the state of the thread.
--> getName() – It returns the name of the thread.
--> getPriority() – It returns the priority of the thread.
--> sleep() – Stop the thread for the specified time.
--> Join() – Stop the current thread until the called thread gets terminated.

Work we can do on threads are Thread Methods.

Write a code using properties from thread class 
So that the Second thread is executed after 
             First thread is terminated
*/


package com.company;

class Myth1 extends Thread{
	public void run() {
		int i=0;
		while(i<3000) {
			System.out.println("Thread 1- Live");
			i++;
		}
	}
}
class Myth2 extends Thread{
	public void run() {
		int i=0;
		while(i<3000) {
		System.out.println("Thread 2 is running.");
		i++;
		}
	}
}



public class Zeek_75_ThreadMethods {
	public static void main(String[] args) {
	   
		Myth1 t1=new Myth1();
		Myth2 t2=new Myth2();
		
		t1.start();
		
		try {
		
			t1.join();
		} 
		catch (Exception e) {
			System.out.println(e);	
		}
		
		t2.start();
	}
}
