/*
 >> Create a cylinder class and use constructor for its radius and height
 >> Calculate Surface Area Base and Volume of cylinder using method.
 >> You can create contructor class by selecting parameters clicking on source and
   click on Generator using fields
  */

package com.company;
class MyCylinder {
	int radius;
	int height;
	
	public MyCylinder(int radius, int height) {
		this.radius = radius;
		this.height = height;
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

public class Zeek_Ch09_PractiseSet2 {

	public static void main(String[] args) {
		MyCylinder calc= new MyCylinder(10,20);//Constructor Class
		
		System.out.println("Surface-Area-Base of cylinder: "+calc.surfaceAreaBase());
		System.out.println("Volume of cylinder: "+calc.volume());
     }
}
