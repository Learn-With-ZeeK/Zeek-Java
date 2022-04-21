/*
---Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object  
---The idea behind inheritance in Java is that you can create new classes that are built upon existing classes.  

---Inheritance represents the IS-A relationship which is also known as a parent-child relationship.
---The relationship between the two classes is Programmer IS-A Employee. It means that Programmer is a type of Employee.

--- The extends keyword indicates that you are making a new class that derives from an existing class.
    The meaning of "extends" is to increase the functionality.

---In the terminology of Java, a class which is inherited is called a parent or superclass,
   and the new class is called child or subclass.  
*/

package com.company;

class Base{
	int x;
  
	//Select int x and click on source and generate getter and setters.
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	public void printDetails() {
		System.out.println("This a method is in Base class only");	
		System.out.println(" but prints in Base and Derived both");
	}
}

class Derived extends Base{ 
	//Derived class has getter setter for int x and method printDetails()  [From class Base] 
	//And has getter setter for int y from its own class.
	int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

public class Zeek_45_Inheritance {
	public static void main(String[] args) {
		
		Base b=new Base();//Creating an object from base class.
		
		b.printDetails();
		
		b.setX(5);
		System.out.println(b.getX());
		
	//b.setY and b.getY will show error because int y does not exist in Base Class.
		
		Derived d=new Derived();   //Creating an object from Derived class.
		
	    d.printDetails();
	    
		d.setX(5);
		System.out.println(d.getX());
		
		d.setY(10);
		System.out.println(d.getY());
	}
}
