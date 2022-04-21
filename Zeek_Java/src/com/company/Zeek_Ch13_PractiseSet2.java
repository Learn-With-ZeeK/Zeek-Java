/*
--> Write a code which gives us the state of the thread(i.e -if thread is new or runnable) 
  */

package com.company;
class WelcomeThread1 extends Thread{
	public void run() {
		
		System.out.println("........."); 
	}
}

public class Zeek_Ch13_PractiseSet2 {

	public static void main(String[] args) {
		
		
			WelcomeThread1 w1= new WelcomeThread1();
			
			System.out.println("State before w1.start(): "+  w1.getState());
			
			w1.start();

			System.out.println("State after  w1.start(): "+  w1.getState());

	}

}
