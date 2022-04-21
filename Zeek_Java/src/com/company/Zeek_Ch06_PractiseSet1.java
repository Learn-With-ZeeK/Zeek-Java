//Create an array of 5 float numbers and display their sum using for each.

package com.company;

public class Zeek_Ch06_PractiseSet1 {
	public static void main(String[] args) {
		
		float [] num= {27.6f,56.8f,89.2f,65.7f,45.3f};
		float sum=0;

		for(float element:num) {
			sum=sum+element;	
		};
		
			System.out.println("The sum of array is  "+sum);
		
	}
}
