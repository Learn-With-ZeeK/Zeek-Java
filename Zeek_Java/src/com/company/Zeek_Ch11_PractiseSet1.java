/*
 --> Create a Monkey class that jumps() and bite() and 
 -->  An interface of BasicAnimals that eat() and sleep()
  
 --> Create a class Human Class that inherits both Monkey and BasicAnimals
 */

package com.company;

abstract class Monkey{
	abstract void jumps();
	abstract void bite();
}
interface BasicAnimals{
	void eat();
	void sleep();
}

class Humans extends Monkey implements BasicAnimals{
	public void jumps() {
		System.out.println("This method is jump from class Monkey");
	}
	public void bite() {
		System.out.println("This method is bite from class Monkey");
	}
	public void eat() {
		System.out.println("This method is eat from interface BasicAnimals");
	}
	public void sleep() {
		System.out.println("This method is sleep from interface BasicAnimals");
	}
} 

public class Zeek_Ch11_PractiseSet1 {

	public static void main(String[] args) {
		Humans h= new Humans();
		
		h.jumps();
		h.bite();
		h.eat();
		h.sleep();
	}
}
