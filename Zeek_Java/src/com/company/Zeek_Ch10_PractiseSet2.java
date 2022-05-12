/*
 
--> Create a class rectangle with its length and width. 
--> Create a class cuboid which is sub class of rectangle(Using concepts of inheritance).
--> Use constructors to set its length,width and height.
--> Calculate totalSurfaceArea and volume of cuboid  

 */

package com.company;

class Rectangle{
	int length;
	int width;
	
	Rectangle(int l,int w){
		this.length=l;
		this.width= w;
		
		System.out.println("The parameters of rectangle are initialised here");
	}
}
class Cuboid extends Rectangle{
     int height;
     
	Cuboid(int l, int w,int h) {
		super(l, w);
		this.height=h;
		
		System.out.println("The parameters of cuboid are initialised here");	
	}
	
	 public int totalSurfaceArea() {
		int t= 2*(this.length*this.width + this.width*this.height + this.height*this.length );
		return t;
	}
	public int volume() {
		int v= this.length*this.width*this.height;
		return v;
	}
}

public class Zeek_Ch10_PractiseSet2 {
	public static void main(String[]args) {
	
		Cuboid cub= new Cuboid(20,20,10);
		
		System.out.println("Total Surface Area of cuboid: "+cub.totalSurfaceArea());	
		
		System.out.println("Volume of cuboid: "+cub.volume());
	}
}
