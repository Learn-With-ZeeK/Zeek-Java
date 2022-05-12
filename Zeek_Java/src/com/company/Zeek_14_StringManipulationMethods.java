//Different methods to manipulate strings


//Strings are immutable(once defined the defined one cannot be changed)

package com.company;

public class Zeek_14_StringManipulationMethods {
	public static void main(String[] args) {
		
		
		String name= "ZeeshanKhan";
		System.out.println("The name of string is: "+ name);
		//Index of Z,e,e,s,h.... are 0,1,2,3,4,.... respectively (i.e index of Z is 0 and so on)
		
		
		//To Know length of string use .length
		int value= name.length();
		System.out.println(value);
		
		
		//To make string into lower or upper case use .toLowerCase() and .toUpperCase()
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		
		//To remove white spaces use .trim()
		String nonTrimmed="  Zeeshan   ";
		System.out.println(nonTrimmed);
		System.out.println(nonTrimmed.trim());
		
		
		//To replace some old part with something new use .replace
		String rname= name.replace("e", "i"); //Here e in name is replaced by i see console
		System.out.println(rname);
		
		
		//To take a part of string(i.e- substring) use .substring
		String subname= name.substring(3) ;//Will take string from 3rd index and print till the end
		System.out.println(subname);
		
		String subname1= name.substring(2, 8);//Will take string from 3rd index and print till index 7 (8 is excluded)
		System.out.println(subname1);
	
		
		//To find what character is at particular index use charAt
		char s= name.charAt(7);//Character at 7th position will be print on console
		System.out.println(s);
		
		
		//To find the index of a word or alphabet use .indexOf()
		int position= name.indexOf("a");// Index of a when it occurs first time(5th index)
		System.out.println(position);
		
		int last_position= name.lastIndexOf("a");// Index of a when it occurs last time(9th index)
		System.out.println(last_position);
	
	
	
	
	}
 }
