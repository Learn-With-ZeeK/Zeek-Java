/*
 Creating your own Java class(Custom class)
 There can be only one public class(If public not written default class executed)
 In this program we created 
 ....Custom class (Employee)
 ....(id and name) are attributes
 ....printDetails() is a method
*/

package com.company;

 class Employee{
	//Creating properties or attributes
	  int id;
      String name;
      int salary;
   
    /*
    Creating methods to be used like......
    SYNTAX:   access-specifier  return-type method-name(){...........}.
     return type can be void(no return),int,string,etc
    acess specifier like public,private,etc
    */
    
      public void printDetails() {
	   System.out.println("My name is: "+ name); 
	   System.out.println("My ID is: "+ id); 
       }
      public void getSalary() {
    	 System.out.println("My salary is: "+ salary);	
      }
  }


public class Zeek_38_CustomClass {
	public static void main(String[] args) {
		System.out.println("This is my custom class");
		
		Employee Zeeshan = new Employee(); //Instantiating(Executing) a new employee
		
		Employee Kashif = new Employee();
		
		//Setting properties(Attributes) for Zeeshan and Kashif
		Zeeshan.id=23;
		Zeeshan.name="Zeeshan Ahmad Khan";
		Zeeshan.salary=50000;
		
		Kashif.id=22;
		Kashif.name="Kashif Ahmad Khan";
		Kashif.salary=600;
		
		
		
		/*Printing Attributes 1st method
		  
		  System.out.println(Zeeshan.id);
		  System.out.println(Zeeshan.name);
		  */
		
		Zeeshan.printDetails();    //Calling The method
		Zeeshan.getSalary();       //Calling The method
		Kashif.printDetails();     //Calling The method
		Kashif.getSalary();        //Calling The method
	}
}
