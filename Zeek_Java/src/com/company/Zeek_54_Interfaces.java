/*
 Interface in english is a point where two systems meet and interact.
                 _______                             ________
  For example-  |  TV   |_ _ _ _ _ _ _ _ _ _ _ _ _ _| Human  |     ....Buttons is an interface.
                |_______|       Buttons             |________|
                
 --> An interface in Java is a blueprint of a class. It has static constants and abstract methods.
 --> In Java ,Interface is a group of related methods with empty bodies.
 
 --> In other words, you can say that interfaces can have abstract methods and variables.
     It cannot have a method body.
   
------> There are mainly three reasons to use interface. They are given below-
--> It is used to achieve abstraction.
--> By interface, we can support the functionality of multiple inheritance.
--> It can be used to achieve loose coupling.

--> A class that implements an interface must implement all the methods declared in the interface.

..........FEW DIFFERENCES BETWEEN ABSTRACT AND INTERFACE

--> In an abstract class.All the methods are not necessarily abstract.
--> In an Interface.All methods are abstract.

--> We cannot extend multiple abstract classes.
--> We can implement multiple interfaces at a time. 

>>>> Create an interface bicycle that have methods applyBrake() and speedUp() to  decrease and increase
    original speed of bicycle respectively As well as interface HornBicycle that prints horn noise.
    
>>>  Then implement both Bicycle and HornBicycle interface together.(Multiple Interfaces)
     At last execute code and get final speeds after brake and speeding
*/

package com.company;

interface Bicycle{
	int a=45;        
	//You can create static constants(values) in interface which are final and cannot be modified.
	
	int applyBrake(int decrement);
	int speedUp(int increment);
}


interface HornBicycle{
	void blowHorn();
}



class HeroCycle implements Bicycle,HornBicycle {
	int speed=7;
	
	public int applyBrake(int decrement) {
		speed= speed - decrement;
		return speed;
	}
	public int speedUp(int increment) {
		speed= speed + increment;
		return speed;
	}
	public void blowHorn() {
		System.out.println("Triiiiiiiing");	
	}
}

public class Zeek_54_Interfaces {

	public static void main(String[] args) {
		HeroCycle h= new HeroCycle();
		
		System.out.println("Original Speed of bicycle is:  "+ h.speed);
		
		System.out.println("Final Speed after applying brake is: "+ h.applyBrake(2));  
		
		System.out.println("Final Speed after speeding up  is: "+ h.speedUp(4));
		
		System.out.println("Value of a in interface is: "+  h.a);
		
		h.blowHorn();
		
		//h.a=454;  ( Will throw error since values in interfaces are final)
	}
}
