/*
--> Write a code in which a thread is executed infinitely after 10 seconds of running the code .
  */


package com.company;

class WelcomeThread extends Thread{
	public void run() {
		
		try {
			sleep(10000);  //Will start run method in 10000 milliseconds which is 10 seconds
		} 
		catch (Exception e) {
			System.out.println(e);	
		}
		
		while(true) {
		System.out.println("Welcome");
		}
	}
}

public class Zeek_Ch13_PractiseSet1 {
	
	

	public static void main(String[] args) {
		WelcomeThread w= new WelcomeThread();
		w.start();

	}

}
