/*
--->  Create a class MySmartPhone which inherit interfaces MyCamera,MyWifi,MyMemory
      and inherits the class CellPhone.

--> MyCamera has three methods takePhoto,recordVideo and savePhoto.
--> MyWifi has two methods getNetwork and accessNetwork
--> MyMemory has two methods formatMemory and mountSDCard

--> MyCellPhone has three methods incomingCall,outgoingCall and missCall. 

--> Get 1 default method in MyCamera name is record4kVideo and explain how it works.
--> Get 1 private method in MyCamera name is load4kVideo and explain how it works.

NOTE----Private method is a method whose accessibility is in the class or interface that it exists.
    
    ----By giving default keyword to a method in an interface means 
	    It is not necessary for you to implement the void in class that inherits the interface.
*/


package com.company;

interface MyCamera{
	void takePhoto();
	void recordVideo();
	void savePhoto();
	
	private void load4kVideo() {                 
		System.out.println("Loading 4k video Processor");	
	}
	/*Private void is a void whose accessibility is in the class or interface that it exists.
	   Accessibility means places where it is visible.
	   Like in this case we can use load4kvideo in interface MyCamera only. */
	
    default void record4kVideo(){
		load4kVideo();
		System.out.println("Recording in 4k video");	
	} 
	/*By giving default keyword to void in this interface means 
	  It is not necessary for you to implement the void in class that inherits this interface.*/
}

interface MyWifi{
	String[] getNewtwork();
	void accessNetwork();
	
}

interface MyMemory{
	void formatMemeory();
	void mountSDCard();
}

abstract class MyCellPhone{
	abstract void incomingCall();
	abstract void outgoingCall();
	abstract void missedCall();
	
}

class SmartPhone5 extends MyCellPhone implements MyCamera,MyWifi,MyMemory{
	
	public void takePhoto() {System.out.println("Capturing Image...");}
	
	public void recordVideo() {System.out.println("Video Recording Started....");}
	
	public void savePhoto() {System.out.println("Saving Image in Gallery...");}
	
	public String[] getNewtwork() {
		String[] getNetwork={"Jio","Airtel","BSNL","TataDocomo"};
		System.out.println("Networks available are:");
	    int i=0;
		while( i<4) {
		System.out.println(getNetwork[i]);	
			i++;
		}
	    return getNetwork;
	}
	
	public void accessNetwork() {
		System.out.println("You have access to JIO Network");	
	}
	
	
	public void formatMemeory() {
		System.out.println("Formatting Memory Card...");	
	}
	
	public void mountSDCard() {
		System.out.println("Memory Card is inserted...");
	}
	
	public void incomingCall(){
		System.out.println("Ringing...");
	}
	
	public void outgoingCall(){
		System.out.println("Calling...");
	}
	
	public void missedCall(){
		System.out.println("Missed Call...");
	}
	
	
}



public class Zeek_57_DefaultMethodsInInterfaces {
	public static void main(String[]args) {
		SmartPhone5 sp= new SmartPhone5();
		
		System.out.println("......MyWifi Interface Methods .........");
		sp.getNewtwork();
		sp.accessNetwork();
		System.out.println("..........................................");
		
		System.out.println("......MyCellPhone Class Methods..........");
		sp.incomingCall();
		sp.outgoingCall();
		sp.missedCall();
		System.out.println("...........................................");
		
		System.out.println("......MyCamera Interface Methods..........");
		sp.takePhoto();
		sp.recordVideo();
		sp.record4kVideo();
		System.out.println("...........................................");
		
		System.out.println("......MyMemory Interface Methods..........");
		sp.formatMemeory();
		sp.mountSDCard();
	}
 }
