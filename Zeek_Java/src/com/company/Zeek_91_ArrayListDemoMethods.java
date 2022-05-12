/*

import java.util.*;  ---------> Means you are accessing everything from utils class.

Syntax for Array list of Integers is:   ArrayList<Integer> l1= new ArrayList();
                       
 You can use  array-list for strings and other data types also;
 
 Some of the methods and work of ArrayList are  -->
 
 l1.get(i) --> getting element at position or index i.
 
 l1.size ---> Length or Size of ArrayList.
 
 l1.add(1,13)--> Means inserting element 13 at position or index 1.
 
 l1.add(2);  --> Means adding element 2 at next position available.
 
 l1.contains(5); --> Checks whether 5 is an element in array or not.
                    If it is an element then true else false 
 
 l1.indexOf(2); --> Gives us index where element 2 occurs first.
 
  l1.lastIndexOf(2); --> Gives us index where element 2 occurs last.
 
 l1.add(l2) --> Adding ArrayList l2 into l1.
 
 l1.removeAll(l2) ---> Removing ArrayList l2 from ArrayList l1
 
 l1.remove(1,2); --->  Removing element 2 from index or position 1.
 
 l1.clear;  ---> Erasing entire l1 elements

 */
package com.company;

import java.util.*;

public class Zeek_91_ArrayListDemoMethods {
    public static void main(String[] args) {
		
		ArrayList<Integer> l1= new ArrayList();
		ArrayList<Integer> l2= new ArrayList();
		
		l2.add(19);
		l2.add(15);
		l2.add(16);
		l2.add(17);
		l2.add(14);
		
		l1.add(7);
		l1.add(9);
		l1.add(3);
		l1.add(6);
		l1.add(5);
		l1.add(9);
		
		l1.addAll(l2); //Inserting ArrayList l2 into l1 
		l1.add(0,1);   //Inserting element 1 at position 0
		
		System.out.println("Does this Array list have 2 as an element? "+ l1.contains(2) );
		System.out.println("Does this Array list have 7 as an element? "+ l1.contains(7) );
		
		System.out.println("First Occuring Position(INDEX) of 9 as an element in ArrayList: "+ l1.indexOf(9) );
		System.out.println("Last Occuring Position(INDEX) of 9 as an element in ArrayList: "+ l1.lastIndexOf(9) );
		
		for(int i=0;i<l1.size();i++) {
			System.out.print(l1.get(i));
			System.out.print(", ");
		}

	}

} 
