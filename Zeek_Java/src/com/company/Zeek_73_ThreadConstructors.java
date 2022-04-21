/*
--> Below are commonly used constructors of Thread class
   (Runnable and String defined in Thread class[SEE ORACLE DOCUMENTATION].Hence use super keyword)
 
   Thread(){..........}
 
   Thread(String name){......}
 
   Thread(Runnable r){.........}
 
   Thread(Runnable r,String name){.........}
 
 */


package com.company;

class MyThr extends Thread{
	
	
	public MyThr(String name) {
		super(name);  //Get properties of constructor from inheriting Thread class.
	}
	
	public void run() {
		System.out.println("HII this thread is running.");
	}
}



public class Zeek_73_ThreadConstructors {

	public static void main(String[] args) {
		
		MyThr t1= new MyThr("Zeeshan");
		MyThr t2= new MyThr("Ahmad");
		MyThr t3= new MyThr("Khan");
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Id of thread 1 is "+  t1.getId());
		System.out.println("Id of thread 2 is "+  t2.getId());
		System.out.println("Id of thread 3 is "+  t3.getId());
		
		System.out.println("Name of thread 1 is "+  t1.getName());
		System.out.println("Name of thread 2 is "+  t2.getName());
		System.out.println("Name of thread 3 is "+  t3.getName());
		
	}

}
