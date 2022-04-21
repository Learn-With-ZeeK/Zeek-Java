/*
--> An ArrayDeque (also known as an “Array Double Ended Queue”, pronounced as “ArrayDeck”)
--> ArrayDeque is a special kind of a growable array that allows us to 
    add or remove an element from both sides.

--> An ArrayDeque implementation can be used as a Stack (Last-In-First-Out) or
     a Queue(First-In-First-Out).

Really Important

Insertion from Head:  offerFirst(e)  ----> also say addFirst();
........................................................................

Retrieval from Head:  peekFirst()    ----> also say getFirst();

........................................................................
Removal from Head:    pollFirst()    ----> also say removeFirst();
 
 
 
 * */


package com.company;

import java.util.*;

public class Zeek_93_ArrayDeque {

	public static void main(String[] args) {
		
		ArrayDeque <Integer> a1= new ArrayDeque();
		
		a1.add(5);
		a1.add(6);
		a1.add(4);
		a1.add(2);
		
		a1.offerFirst(19);
		a1.offerLast(34);
		
		System.out.println("First element of array is: "+a1.peekFirst());
		System.out.println("Last element of array is: "+a1.peekLast());
		
	}

}
