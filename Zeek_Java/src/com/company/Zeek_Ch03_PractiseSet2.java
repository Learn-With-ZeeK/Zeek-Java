//Take a name from user and print a letter  by putting username where name appears in letter template
//Letter is "Respected name,Read  this blog...Thank you name"

package com.company;
import java.util.Scanner;
public class Zeek_Ch03_PractiseSet2 {
	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter your name:");
			String user_name = sc.nextLine();
			
			String letter="Respected name,\n Read  this blog...\n\nThank you\nname";
			String s2= letter.replaceAll("name", user_name);
			
			System.out.println(s2);
}
}