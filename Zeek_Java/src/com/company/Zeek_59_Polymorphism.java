/*Refer to Zeek_49_DynamicDispatch_RuntimePolymorphism
 
  Basically Polymorphism Is (Same work--different outputs)
  
  Consider a scenario where Bank is a class that provides a method to get the rate of interest.
  That Means
  >> Same Work(get rate of Interest) different outputs( 8.4% , 7.3% , 9.7% )
  
    For example,
              Bank Name                          Rate of Interest(in %)
                  SBI                             8.4%.
                 ICICI                            7.3%
                 AXIS                             9.7%
                 
   Execute a code to obtain rate of interest for different banks.
 */

package com.company;


abstract class Bank{
	abstract float getRateOfInterest() ;
}

class SBI extends Bank{
	public float getRateOfInterest() {
		return 8.4f;
	}
}
class ICICI extends Bank{
	public float getRateOfInterest() {
		return 7.3f;
	}
	}
class  AXIS extends Bank{
	public float getRateOfInterest() {
		return 9.7f;
	}
	}

public class Zeek_59_Polymorphism {
	public static void main(String[]args) {
		Bank s= new SBI();
		System.out.println("SBI Rate is: "+ s.getRateOfInterest() +"%");
		
		Bank i= new ICICI();
		System.out.println("ICICI Rate is: "+ i.getRateOfInterest() +"%");
		
		Bank a= new AXIS();
		System.out.println("AXIS Rate is: "+ a.getRateOfInterest()  +"%");
		
	}
}
