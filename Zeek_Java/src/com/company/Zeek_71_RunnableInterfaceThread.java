/*
--> In Zeek_70_JavaThread we inherited(EXTEND) class Thread for seeing concurrency by threads

Here  ,
--> We inherit(IMPLEMENT) an interface Runnable and then use Thread class to see concurrency by threads. 
 */


package com.company;

class RunnableInterfaceThread1 implements Runnable{
	@Override
	public void run() {
		int i=0;
		while(i<5000) {
		System.out.println("Thread 1 is live");
		i++;
		}
	}
}
class RunnableInterfaceThread2 implements Runnable{
	@Override
	public void run() {
		int i=0;
		while(i<5000) {
		System.out.println("Thread 2 is running");
		i++;
		}
	}
}

public class Zeek_71_RunnableInterfaceThread {

	public static void main(String[] args) {
	
		RunnableInterfaceThread1 bullet1= new RunnableInterfaceThread1();
		RunnableInterfaceThread2 bullet2= new RunnableInterfaceThread2();
		
		Thread gun1= new Thread(bullet1);
		Thread gun2= new Thread(bullet2);
		
		gun1.start();
		gun2.start();
		
	}

 }
