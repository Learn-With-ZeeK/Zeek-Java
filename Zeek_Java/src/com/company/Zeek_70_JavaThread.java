/*
--> Parallelism- Codes Run simultaneously(At a moment all codes running together).
 
--> Concurrency - Concurrency means multiple tasks which start, run, and complete in overlapping time periods,
                in no specific order(At a moment only one code running).
                
--> By default In Java when One code finishes then another gets started.
 
 Concurrency obtained by inheriting(extend) Thread class[it incudes run,start,etc].
 
 Write a code for concurrency and see the result on your console. 
 Extend the thread class
 
*/

package com.company;

/*

--> Thread1,Thread2,Thread3--Thread (1,2,3)[ You can create multiple classes & any name you want]

--> Extending Thread Class in classes Thread (1,2,3) and overriding run() method.
--> Creating an object of classes of Thread(1,2,3)
--> Invoking object of classes of Thread(1,2,3) and using start() method

*/

class MyThreads1 extends Thread{
	@Override
	public void run(){
		int i=0;
		while(i<5000) {
		System.out.println("Thread 1- Sleeping");
		System.out.println("I am dreaming");
		i++;
		}
	}
}

class MyThreads2 extends Thread{
	@Override
		public void run(){
			int i=0;
			while(i<5000) {
			System.out.println("Thread 2- Exercising");
			System.out.println("I am thirsty");
			i++;
			}
		}
}	
class MyThreads3 extends Thread{
	@Override
	public void run(){
		int i=0;
		while(i<5000) {
		System.out.println("Thread 3- Coding");
		System.out.println("I am understanding thread");
		i++;
		}
	}
}



public class Zeek_70_JavaThread {

	public static void main(String[] args) {
	

		MyThreads1 t1= new MyThreads1();
		MyThreads2 t2= new MyThreads2();
		MyThreads3 t3= new MyThreads3();
		
		t1.start();
		t2.start();
		t3.start();
		
   }
}
