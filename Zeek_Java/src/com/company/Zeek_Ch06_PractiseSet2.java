//Create an array and write a code to find its maximum element.

package com.company;

public class Zeek_Ch06_PractiseSet2 {
	public static void main(String[] args) {
	int[] cost= {23,24,27,28,21,39,34,36,31,48,43,42,47,41};
	
	int max=0;
	for(int e:cost) {
		if(e>max) {
			max=e;
		}
	}
	System.out.println("The max value of array is:"+max);
	
	}
}
