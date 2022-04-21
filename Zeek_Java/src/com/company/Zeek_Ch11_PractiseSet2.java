/*
 Create a  TV that has features like channelNo(),dishConnection()
 Create a LCD_TV that has features of TV plus dolbySound(),hdDisplay(),sleekDesign()
 
 Create an Android_TV that inherits features of TV and LCD_TV and some other features like
 internetConnection(),youTube(),appsAndGames()..
 
 Also TV can have maximum of 100 channels.
      LCD_TV can have maximum of 250 channels.
      Android TV can have maximum of 800 channels.
      
      In this code
       TV --> LCD_TV --> AndroidTV
       
       LCD_TV inherits TV.
       AndroidTV inherits LCD_TV.
       
       This means AndroidTV inherits both(LCD_TV and TV)
  */


package com.company;

class TV{
	void channelNo() {
		System.out.println("This TV has 100 chanels.");
	}
	String[] dishConnection(){
	
		String[] getConnection= {"TataSky","TataSky HD+","BigTV","DishTV","Airtel"};
	
	    System.out.println("\nThe TV dish connections available are:");
	    int i=0;
	    while(i<5) {
		System.out.println(getConnection[i]);
		i++;
	    }
	    return getConnection;
	}
}
class LCD_TV extends TV{
	void channelNo() {
		System.out.println("This TV has 250 chanels.");
	}
	void dolbySound(){
		System.out.println("\nSound quality for this TV is dolby.");	
	}
	void hdDisplay(){
		System.out.println("Watch TV in HD quality display.");	
	}
	void sleekDesign() {
		System.out.println("TV is very sleek in design.");	
	}
}

class AndroidTV extends LCD_TV{
	void channelNo() {
		System.out.println("This TV has 800 chanels.");
	}
	void internetConnection() {
		System.out.println("This TV can access internet.");
	}
	void youTube() {
		System.out.println("Welcome to YouTube...");	
	}
	void appsAndGames() {
		System.out.println("Press Enter to play Games...");		
	}
}



public class Zeek_Ch11_PractiseSet2 {

	public static void main(String[] args) {
		TV t=new TV();
		t.channelNo();
		t.dishConnection();
		
		System.out.println("................................");	
		
		LCD_TV l= new LCD_TV();
		l.channelNo();
		l.dishConnection();
		l.dolbySound();
		l.hdDisplay();
		l.sleekDesign();
		
		System.out.println("................................");
		
		AndroidTV a=new AndroidTV();
		a.channelNo();
		a.dishConnection();
		a.dolbySound();
		a.hdDisplay();
		a.sleekDesign();
		a.internetConnection();
		a.youTube();
		a.appsAndGames();

	}

}
