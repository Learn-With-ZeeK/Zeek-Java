/*
 >> Create a cylinder class and use getter setter for its radius and height
 >> Calculate Surface Area Base and Volume of cylinder using method.
  
  */

package com.company;

class Cylinder{
	private int radius;
	private int  height;
	public void setRadius(int radius) {
		this.radius=radius;
		
	}
	public int getRadius() {
		return radius;
	}
	public void setHeight(int height) {
		this.height=height;
		
	}
	public int getHeight() {
		return height;
	} 
	public double  surfaceAreaBase() {
      double surfaceArea = (double)(3.142857*radius*radius);                        
     return surfaceArea;
	}
	public double  volume() {
		double volume= (double) (3.142857*radius*radius*height);
		return volume;
	}
	
}
public class Zeek_Ch09_PractiseSet1 {
	public static void main(String[] args) {
	Cylinder calculation= new Cylinder();
	
	calculation.setRadius(10);
	calculation.setHeight(10);
	System.out.println("Radius of cylinder: "+calculation.getRadius());
	System.out.println("Height of cylinder: "+calculation.getHeight());
	
	System.out.println("Surface-Area-Base of cylinder: "+calculation.surfaceAreaBase());
	System.out.println("Volume of cylinder: "+calculation.volume());
    }
}
