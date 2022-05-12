//Create a multi dimension array that stores floor(ground and first) and 
//There appartment number in respective floors(3 appartments in 1 floor) and 
//Print it on console


package com.company;

public class Zeek_28_MultiDimensionArray {
	public static void main(String[] args) {
		
		
		int [][]flat= new int[2][3];
		
		//Ground floor
		flat[0][0]=101;
		flat[0][1]=102;
		flat[0][2]=103;
		
		//First floor
		flat[1][0]=201;
		flat[1][1]=202;
		flat[1][2]=203;
		
		for (int i=0;i<flat.length;i++) {
			for (int j=0;j<flat[i].length;j++)	{
		
	        System.out.print(flat[i][j]);	
		    System.out.print(" ");
			}
		System.out.println(" ");
		}
	
	
	}
   }
   
