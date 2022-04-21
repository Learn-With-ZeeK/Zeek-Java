//Different ways to print

package com.company;

import java.util.Scanner;

public class Zeek_13_PrintManipulations {
    public static void main(String[] args) {
        
        //System.out.println() working
 System.out.println("hello Zeek");
 System.out.println("This line printed in next line after hello Zeek on console because of ln");
        
        
        //System.out.print() working
 System.out.print("HII ZEEK");
 System.out.println(" This line printed next to HII ZEEK on console because no ln in print");
        
        
        //System.out.printf() working,
        //%d  for integer, %f for float,%s for string,%c for character
        int a=6;
        float b=4.657f;
        String x="Hii";
        char y='p';
        
 System.out.printf("The value of a is %d , b is %f, x is %s, y is %c", a, b ,x , y);
 System.out.println("........");
        
        
        //Printing a string by taking input from user by scanner class...
        //Refer Zeek_Ch01_PractiseSet,
        
//      Scanner sc=new Scanner(System.in);
//      System.out.print("  Enter your name:");
//      String str=sc.nextLine();
//      System.out.println(str);
        }
    }