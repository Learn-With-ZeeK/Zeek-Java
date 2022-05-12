//Income Tax Slab per year	       ,New Regime Income Tax Slab Rates FY 2020-21
//Rs 0.0 – Rs 2.5 Lakhs	           ,Tax-    NIL
//Rs 2.5 lakhs- Rs 5.00 Lakhs      ,Tax-	5% 
//Rs. 5.00 lakhs- Rs 7.5 Lakhs     ,Tax -	10%
//Rs 7.5 lakhs – Rs 10.00 Lakhs	   ,Tax-        15%
//Rs 10.00 lakhs – Rs. 12.50 Lakhs ,Tax-	20%
//Rs. 12.5 lakhs- Rs. 15.00 Lakhs  ,Tax-	25%
//> Rs. 15 Lakhs                   ,Tax-	30%

//Calculate your income per month(in Rs) after giving income tax away. Take input from user.



package com.company;
import java.util.Scanner;
public class Zeek_Ch04_PractiseSet2 {
	 public static void main(String[] args) {
			
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your income per year(in lakhs):");
      
      double income=sc.nextFloat();
      double tax=0;
      
      if(income<2.5){    	  
    	  tax=tax+0;                   //Updating Tax for slab  0 to income
    	 }
      
      else if(income>=2.5 && income<5) {
    	  tax=tax+ 0;                  //Updating Tax for slab 0 to 2.5
     	  tax=tax+ 0.05*(income-2.5);  //Updating Tax for slab 2.5 to income
     	}
     
      else if(income>=5 && income<7.5) {
    	 tax=tax+ 0;                   //Updating Tax for slab 0 to 2.5
      	 tax=tax+ 0.05*(5-2.5);        //Updating Tax for slab 2.5 to 5
      	 tax=tax+ 0.1*(income-5);      //Updating Tax for slab 5 to income
      	}
      
      else  if(income>=7.5 && income<10) {
    	 tax=tax+ 0;                   //Updating Tax for slab 0 to 2.5
       	 tax=tax+ 0.05*(5-2.5);        //Updating Tax for slab 2.5 to 5
       	 tax=tax+ 0.1*(7.5-5);         //Updating Tax for slab 5 to 7.5
         tax=tax+ 0.15*(income-7.5);   //Updating Tax for slab 7.5 to income
      }
      
      else if(income>=10 && income<12.5) {
    	  tax=tax+ 0;                  //Updating Tax for slab 0 to 2.5
          tax=tax+ 0.05*(5-2.5);       //Updating Tax for slab 2.5 to 5
          tax=tax+ 0.1*(7.5-5);        //Updating Tax for slab 5 to 7.5
          tax=tax+ 0.15*(10-7.5);      //Updating Tax for slab 7.5 to 10
       	  tax=tax+ 0.2*(income-10);    //Updating Tax for slab 10 to income
        }
      
      else if(income>=12.5 && income<15) {
    	  tax=tax+ 0;                   //Updating Tax for slab 0 to 2.5
     	  tax=tax+ 0.05*(5-2.5);        //Updating Tax for slab 2.5 to 5
     	  tax=tax+ 0.1*(7.5-5);         //Updating Tax for slab 5 to 7.5
          tax=tax+ 0.15*(10-7.5);       //Updating Tax for slab 7.5 to 10
    	  tax=tax+ 0.2*(12.5-10);       //Updating Tax for slab 10 to 12.5   
      	  tax=tax+ 0.25*(income-12.5);  //Updating Tax for slab 12.5 to income
      	}
     
      else  {
    	  tax=tax+ 0;                   //Updating Tax for slab 0 to 2.5
      	  tax=tax+ 0.05*(5-2.5);        //Updating Tax for slab 2.5 to 5
      	  tax=tax+ 0.1*(7.5-5);         //Updating Tax for slab 5 to 7.5
          tax=tax+ 0.15*(10-7.5);       //Updating Tax for slab 7.5 to 10
     	  tax=tax+ 0.2*(12.5-10);       //Updating Tax for slab 10 to 12.5   
       	  tax=tax+ 0.25*(15-12.5);      //Updating Tax for slab 12.5 to 15
    	  tax=tax+ 0.3*(income-15);     //Updating Tax for slab 15 to income
    }
      System.out.println("Your total income tax(in lakhs)is: "+tax);
      
      double incomeFinal=income-tax;
	  System.out.println("Per yr income (in lakhs) after tax is: "+incomeFinal);
	  
	  double monthlyIncome=incomeFinal/12;
	  int monthlyIncomeRs=(int)Math.floor( monthlyIncome*100000);
	  
	  System.out.println("Per month income after tax is: "+ monthlyIncomeRs+" Rs");
	  
      }

}



	
