/*
 Create a class cube and write method to calculate its:
 ---totalArea
 ---Surafce area of one-face
 ---Volume
 Take the length of side as an input from user
 */

package com.company;

import java.util.Scanner;

class Cube{
	int a;//Property required
	
	//Creating methods
	public int totalArea(){
		return 6*a*a;
	}
	
	public int surfaceAreaOneFace(){
		return a*a;
	}
	
	public int volume(){
		return a*a*a;
	}
	//Methods Created
}

public class Zeek_Ch08_PractiseSet3 {
public static void main(String[] args) {
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the value of edge(side) of cube:");
				int m=sc.nextInt();//Getting value from user
				
				Cube calculations= new Cube();//Instantiating the class Cube.
				
				//Setting value of a (attribute of class) with m(user input)
				calculations.a = m; 
				
				//Storing  return in integer values
				int t= calculations.totalArea();
				int s= calculations.surfaceAreaOneFace();
				int v= calculations.volume();
				
				//Printing integer with stored values
				System.out.println("Total Area of cube is: "+t);
				System.out.println("Surface Area of one face of cube is: "+s);
				System.out.println("Volume of cube is:"+v);
		 }
 }
