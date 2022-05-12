package com.company;

class MyEmployee{
private	int id;
private	String name;


//Method for  Taking or setting value of name
public void setName(String n) {
	name=n;
}
//Method for  Accessing or getting value of name
public String getName() {
	return name;
}


//Method for  Taking or setting value of ID
public void setId(int i) {
	id=i;
}
//Method for  Accessing or getting value of ID.
public int getId() {
	return id;
}
	

}

public class Zeek_40_GetterSetters {
	public static void main(String[] args) {
		
		
		MyEmployee Zeeshan= new MyEmployee();
		
	    /*	
	.........(This code will not work when id and name are private)..............
	    
	    Zeeshan.id=23;
		Zeeshan.name="Zeek";
		System.out.println(Zeeshan.id);
		System.out.println(Zeeshan.name);
		
    ........(USE Getter Setter Method).........
		*/
		
		Zeeshan.setName("Zeek");              //Taking or setting value of name
		System.out.println(Zeeshan.getName());//Accessing or getting value of name
		
		Zeeshan.setId(23);                    //Taking or setting value of ID
		System.out.println(Zeeshan.getId());  //Accessing or getting value of ID.
		
	}
 }
