/*
 Please try using Oracle Documentation for better references.
 
 Java HashSet class is used to create a collection that uses a hash table for storage.
  It inherits the AbstractSet class and implements Set interface.

The important points about Java HashSet class are:

--> HashSet stores the elements by using a mechanism called hashing.

--> HashSet contains unique elements only.

--> HashSet allows null value.

--> HashSet class is non synchronized.

--> HashSet doesn't maintain the insertion order.
    Here, elements are inserted on the basis of their hashcode.
    
--> HashSet is the best approach for search operations.

--> The initial default capacity of HashSet is 16, and the load factor is 0.75

Get syntax and main stuff from API Documentation of Oracle

HashSet(int initialCapacity, float loadFactor);
--> Constructs a new, empty set; the backing HashMap instance has the specified initial capacity
    and the specified load factor.
*/

package com.company;

import java.util.*;

public class Zeek_95_HashSet {
	public static void main(String[] args) {
		
	     HashSet <Integer> h1= new HashSet();
	        
	     h1.add(51);
	     h1.add(6);
	     h1.add(9);
	     h1.add(10);
	     h1.add(6);
	     h1.add(5);
	     
	     System.out.println(h1);
	     
	    // You will see 6 is printed only once.
	     //And Although 5 is last but printed next to 51(Does not maintain insertion order)
		}
}
