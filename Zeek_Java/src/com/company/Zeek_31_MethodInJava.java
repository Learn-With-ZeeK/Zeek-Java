// We write a method once and use it many times. We do not require to write code again and again.
//The method is executed only when we call or invoke it.
//And every program must have a method named main, which is the method first invoked when the program is run

package com.company;
public class Zeek_31_MethodInJava {
	//Creating a static method mySum.
	static int mySum(int x,int y) {
	int z = 0;
	
	if(x>y)       {z=x+y;}
	
	else if(x<y)  {z=y/x;}
	
	else if(x==y) {z=x*y;}
	
	else          {z=0;}
	
	return z;	
	};
	
	
	
	public static void main(String[] args) {
		
	int a=5;
	int b=6;
	
	//Calling method mySum where a takes x,b takes y,c takes z.
	int	c= mySum(a,b);
	
	System.out.println("The value of c is: "+c);
	
	int a1=5;
	int b1=2;
	
	//Calling method mySum where a1 takes x,b1 takes y,c1 takes z.
    int	c1= mySum(a1,b1);
    
    System.out.println("The value of c1 is: "+c1);
    
    int a2=2;
    int b2=2;
    
  //Calling method mySum where a2 takes x,b2 takes y,c2 takes z.
    int	c2= mySum(a2,b2);
    
    System.out.println("The value of c2 is: "+c2);
	}
	
}
