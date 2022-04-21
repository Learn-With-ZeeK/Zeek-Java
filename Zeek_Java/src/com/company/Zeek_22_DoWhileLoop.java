//Difference in while and do while loop
package com.company;

public class Zeek_22_DoWhileLoop {
public static void main(String[] args) {
		
		int i=10;
		do {
			System.out.println(i);
			i++;
		}while(i<=5);
		System.out.println("do While will print only first value when while condition is false i.e"
				+ "  print 10 even though 10 is not less than 5");
	}
}
