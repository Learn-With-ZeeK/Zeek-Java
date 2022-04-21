package com.company;

public class Zeek_08_Operators {
    public static void main(String[] args) {
        
        
        int a=3;
        int b=6;
        
//      Arthimetic operators
        
        int c= b+a;
        System.out.println(c);
        
        int d=6;
        int e=4;
        int f= d/e;
        System.out.println("Value of quotient when d(6) is divided by e(4) is: "+f);
        
        
        int g= d%e;
        System.out.println("Value of remainder when d(6) is divided by e(4) is: "+g);
    
      //Assignment Operators
        
        int x=5;
        x += 6;
        System.out.println(x);
    // The value of x becomes 5+6 that means += means add that number to get new value
        
        //Comparison Operators
        System.out.println(64>=8);
        //Compares if not correct then false, if correct then true.
        
        
        //Logical operators
        System.out.println(64>8 && 64>5);
        //Both values true then only true. Else false(AND gate).
        
        System.out.println(64>8 || 64>98);
        //if one or both value true then  true. Else false(OR gate).
        
      }

}

//There are 5 different types of operator

//Arthimetic Operators- Used for mathematical calculation
// Some of them are  {  + , - , * , / , % , ++ , -- }

//Assignment Operators- Used to give or assign values
//Some of them are  { = , +=}

//Comparison Operators - Used to compare values or check conditions
//Some of them are  { == , >= , <= }

//Logical operators- Checks or evaluates a group of conditions and give final result
//Some of them are  { && (Like AND gate) , || (Like OR Gate) }

//Bitwise operators- { & , | }(Operates bitwise)