/*

--> Each thread have a priority. 
--> Priorities are represented by a number between 1 and 10.
---> In most cases, thread schedular schedules the threads according to their priority
     (known as preemptive scheduling).
 
-->But it is not guaranteed because it depends on JVM specification that which scheduling it chooses.

3 constants defined in Thread class:
public static int MIN_PRIORITY
public static int NORM_PRIORITY
public static int MAX_PRIORITY

__ Default priority of a thread is 5 (NORM_PRIORITY).
__ The value of MIN_PRIORITY is 1.
__ The value of MAX_PRIORITY is 10.
  
  */


package com.company;

class MyTh extends Thread{
	public MyTh(String name) {
		super(name);
	}
	public void run() {
		int i=0;
		while(i<4000) {
		System.out.println("Name of Thread is: "+this.getName());
		i++;
		}
	}
}

public class Zeek_74_ThreadPriority {

	public static void main(String[] args) {
		MyTh t1= new MyTh("Zeeshan(MOST IMPORTANT)");
		MyTh t2= new MyTh("Ahmad");
		MyTh t3= new MyTh("Khan");
		MyTh t4= new MyTh("Smart");
		MyTh t5= new MyTh("Hard-Working");
		
		//SETTING PRIORITY IN ECLIPSE
		t1.setPriority(10);
		t2.setPriority(1);
		
		// t3 not set so default value is 5
		
		t4.setPriority(1);
		t5.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	 }
}
