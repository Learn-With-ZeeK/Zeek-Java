/*  The following conditions are true regarding inheritance hierarchy:
------> class extends class
------> interface extends interface

------> class implements interface

------> class extends class implements interface1,interface2,.....,interface-n
    
  
  
  Following conditions are FALSE
------> class extends interface [FALSE]
------> class extends class1,class2,.....,class-n [FALSE]
------> interface extends class [FALSE]

IN CONCLUSION
--> extends used for same type  (class to class) or (interface to interface)
--> implements used for (child implements interface)
*/

/*
WRITE CODE FOR FOLLOWING INHERITANCE
     
       ParentInterface --------> ChildInterface ------> GrandChildClass
 
 This means:
 >>> ChildInterface inherits ParentInterface
 
 >>> GrandChildClass inherits ChildInterface
 
 This implies GrandChildClass inherits both interfaces(ChildInterface,ParentInterface)
 
*/

package com.company;

interface ParentInterface{
	void meth1();
	void meth2();
}
interface ChildInterface extends ParentInterface{
	void meth3();
	void meth4();
}
class GrandChildClass implements  ChildInterface{
	public void meth1() {
		System.out.println("meth1 from ParentInterface");
    }
	public void meth2() {
		System.out.println("meth2 from ParentInterface");
	}
	public void meth3() {
		System.out.println("meth3 from ChildInterface");
	}
	public void meth4() {
		System.out.println("meth4 from ChildInterface");
	}
}

public class Zeek_58_InheritanceInInterafaces {

	public static void main(String[] args) {
		
		GrandChildClass g= new GrandChildClass();
		g.meth1();
		g.meth2();
		g.meth3();
		g.meth4();

	}
}
