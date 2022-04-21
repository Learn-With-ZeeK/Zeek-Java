/*
---In Java, a constructor is a block of codes similar to the method
---A constructor is a special kind of method from where execution starts inside a class
---Constructor can create and initialize at the same time
    (Method can only give path or print  not initialize)
---Name of constructor class should be sane to class name
---It can be overloaded(Same name with different parameters)
---CANNOT return any value
 --- Syntax of constructor---------  class-name(){..........}           
 ---Syntax of constructor can also be---------public  class-name(){..........}
 ---When there is no public in syntax then access specifier is default
 */
package com.company;

class MyMainEmployee {
	private int id;
	private String name;

	//First Constructor MyMainEmployee() with no parameters
	public MyMainEmployee(){
	id=23;          //Also write........... this.id=23;
	name="Zeeshan"; //Also write........... this.name=23;
    }
	
	//Second Constructor MyMainEmployee(int i) with 1 parameter int i.
	public MyMainEmployee(int i){
	id=i;
	name="ZEESHAN";
    }
	
	//Third Constructor MyMainEmployee(int i) with 1 parameter int i and string n.
	public MyMainEmployee(int i,String n){
	id=i;
	name=n;
    }
	//Constructors are method overloaded i.e(Same name different parameters)
	
	
	//Creating Methods to get id and name
	public int getId() {return id;}
	public String getName() {return name;}
}

public class Zeek_42_ConstructorInJava {

	public static void main(String[] args) {
		MyMainEmployee ZeeKhan= new MyMainEmployee();//To acces first constructor.
		System.out.println(ZeeKhan.getId());
		System.out.println(ZeeKhan.getName());
		
		System.out.println(".........................................");
		
		MyMainEmployee Zee= new MyMainEmployee(45);//To acces second constructor.
		System.out.println(Zee.getId());
		System.out.println(Zee.getName());
		
		System.out.println(".........................................");
		
		MyMainEmployee ZEE= new MyMainEmployee(91490,"ZEEK91490");//To acces third constructor.
		System.out.println(ZEE.getId());
		System.out.println(ZEE.getName());
	}
}
