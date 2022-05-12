// Create an array and Use for loop to display in forward and reverse order
// Create an array and Use for each loop to display in forward order

package com.company;

public class Zeek_27_ArrayStarting {
	public static void main(String[] args) {
		
		//int[] marks= new int[5];This method declares and allocates memory for array.
		
		int[] marks= {56,78,98,90,65,74};//This method declares and initializes arrays
		
		System.out.println("The length of array is: "+marks.length);
		
		
		System.out.println("This array is displayed using for loop in forward order");	
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);	
		}
		
		System.out.println("............");
		
		System.out.println("This array is displayed using for loop in reverse order");
		for(int i=marks.length-1;i>=0;i--) {
			System.out.println(marks[i]);	
		}
		System.out.println("............");
		
		System.out.println("This array is displayed using for each loop in forward order");
		for ( int element:marks) {
			System.out.println(element);
		}
		
	}
}
