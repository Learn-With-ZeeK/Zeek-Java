//Create a class CellPhone which prints "Ringing","Vibrating","Silent","Aeroplane Mode"
 
package com.company;

class CellPhone{
	
	//Methods Starting
	public void ringing() {
		System.out.println("CellPhone is Ringing");	
	}
	public void vibrating() {
		System.out.println("CellPhone is Vibrating");	
	}
	public void silent() {
		System.out.println("CellPhone is Silent");	
	}
	public void aeroplaneMode() {
		System.out.println("CellPhone is in AeroplaneMode");	
	}
    //Methods Created	
}

public class Zeek_Ch08_PractiseSet2 {
	public static void main(String[] args) {
		CellPhone call= new CellPhone();
		
		//Invoking methods
		call.ringing();
		call.vibrating();
		call.silent();
		call.aeroplaneMode();
	}
 }
