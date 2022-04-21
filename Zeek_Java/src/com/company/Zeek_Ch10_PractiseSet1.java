/*

--> Create a class circle where you define its radius.
--> Create a class cylinder with circle class as parent class (using concepts of inheritance ).
--> Use getter setter to set values of radius and height. 

*/


package com.company;

class Circle{
	int radius;
	
	public int getRadius() {
		return radius; }
    
	public void setRadius(int radius) {
		this.radius = radius;}


	public double area() {
		double y= Math.PI*this.radius*this.radius;
		return y;
	}
}


class Cylindrical extends Circle{
	int height;

	public int getHeight() {
		return height;}
	
    public void setHeight(int height) {
    	this.height = height;}
	
	public double volume() {
		double x= Math.PI*this.radius*this.radius*this.height;
		return x;
	}
}

	


public class Zeek_Ch10_PractiseSet1 {

	public static void main(String[] args) {
		
		Cylindrical cyl= new Cylindrical();
		
		cyl.setRadius(10);
		cyl.setHeight(10);
		
		System.out.println("Base Area of cylinder is : "+ cyl.area());
		System.out.println("Volume of cylinder is : "+ cyl.volume());
	
	}
}
