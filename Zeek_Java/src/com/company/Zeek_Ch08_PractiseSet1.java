/*
  Create a class Employee1 with following method and propertites:
 >>> salary ..........(property)(int)
 >>> getSalary.........(method returning  int)
 >>> name..............(property)(String)
 >>> getName...........(method returning  string)
 >>> setName............(method changing name )
*/
package com.company;

class Employee1{
	//Properties Present
	int salary;
	String name;
	
	
	
	//Setting Methods.
	public int getSalary(){
		return salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
	//Methods are Set now.
} 



public class Zeek_Ch08_PractiseSet1 {
	public static void main(String[] args) {
		Employee1 Zeeshan= new Employee1();
		
		//Setting properties
		Zeeshan.salary=4000;
		Zeeshan.setName("Zeeshan");
		
		//Calling and printing methods
		System.out.println(Zeeshan.getSalary());
		System.out.println(Zeeshan.getName());
		
	}
}
