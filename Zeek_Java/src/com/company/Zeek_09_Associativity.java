//Like there is BODMAS in mathematics calculation In Java there is precedence and 
//associativity concept for calculation.

package com.company;

public class Zeek_09_Associativity {
    public static void main(String[] args) {
      
        
        int a = 6*5-34/2;
        int b=  6*5/2;
        
/*  (/ and *) takes precedence over (+ and -) but when there is tie means 
     between / and * then associativity concept comes and calculation  performed from 
    left to right
    (See associativity table.Different direction for different cases)

        => a= 6*5-34/2,
        => a= 30-34/2,
        => a= 30-17,
        => a= 13 
        
        => b=  6*5/2,
        => b=  30/2,(Left to right {associativity concept})
        => b=  15,
        
*/
        
        System.out.println(a);
        System.out.println(b);
    }
}


