 /*
   Dynamic Method Dispatch or Runtime Polymorphism---
     
     Dynamic method dispatch or Runtime Polymorphism is the mechanism in which a call to an 
     overridden method is resolved at run time instead of compile time.
     
  Runtime Polymorphism-- DOES NOT WORK FOR DATA MEMBERS LIKE INTEGERS ETC.
   
 
   Following is inheritance hierarchy
       _____________
      | SUPER CLASS |------------->meth1()
      |_____________|------------->meth2()
            |        
            |
       _____V_______
      | SUB CLASS   |------------->meth2()  [Overriden]
      |_____________|------------->meth3()
      
                                               ______________________________________________________________
   ->  Super obj = new Sub(); // [Allowed and ||Works.Reference of object is super but object is in Sub class||]
                                              ||_____________________________________________________________||
   
   ->  obj.meth2();   //[Allowed and prints overriden meth2]
   
   ->  obj.meth3();   //[Not Allowed]
   
   ->  Sub obj = new Super();     //[Not Allowed]
   
   --->> Basic point
        - Square is always a rectangle...
        - Rectangle is not always a square...
        
   ---> Execute a code for which Phone is Super class and Smart Phone is Sub class and do dynamic dispatch.
  */


package com.company;

class Phone{
	public void switchOff() {
		System.out.println("Phone is switched off");	
	}
	
	public void turnOn() {
		System.out.println("Turning on Phone.....");	
	}
}



class SmartPhone extends Phone{
	public void turnOn() {   //Overridden turnOn Method
		System.out.println("Turning on Smart Phone.....");	
	}
	
	public void formatMemory() {
		System.out.println("Formatting Memory of Phone...");
	}
}

public class Zeek_49_DynamicDispatch_RuntimePolymorphism {
    public static void main(String[] args) {
		
    	Phone obj= new SmartPhone();
		
    	obj.switchOff();         //Method of Phone printed in Smart Phone object
    	
    	obj.turnOn();            //Overriden Method turnOn printed
    	
    //  obj.formatMemory();      //Will show error.Method of Smart Phone not in phone object.
		
    }
}
