 /*
--- Create a class Game, which allows a user to play "Guess the Number"
     game once.
>>> Game is computer generates unknown random number between 0 to 100 
>>> You guess the number if user number greater than computer number print Too High.
>>> You guess the number if user number less than computer number print Too low.
>>> You guess the number if user number equal to computer number print You Won the game.
      
      Game should have the following methods:      
---1. Constructor to generate the random number
---2. takeUserInput() to take a user input of number
---3. isCorrectNumber() to detect whether the number entered by the user is true
---4. getter and setter for noOfGuesses
      
      Use properties such as noOfGuesses(int), etc to get this task done!
         */




package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
	int user_number;
	int r_number;
	int noOfGuess=0;
	
	public void setnoOfGuess( int noOfGuess ) {
		this.noOfGuess=noOfGuess;
	}
	//Method for  Accessing or getting value of ID.
	public int getnoOfGuess() {
		return noOfGuess ;
	}
	Game(){
		Random rand=new Random();
		this.r_number=rand.nextInt(100);
	}
	
	void takeUserInput() {
		System.out.println("Guess the number");
		Scanner sc= new Scanner(System.in);
		this.user_number= sc.nextInt();
		
	}
	
	
	boolean isCorrectNumber() {
		noOfGuess++;
		if(user_number== r_number) {
			System.out.printf("You won.It took you %d guesses and number is %d",noOfGuess,r_number);
			return true;
		}
		else if(user_number< r_number){
			System.out.println("Too low");}
		else if(user_number> r_number){
			System.out.println("Too high");}
		return false;
	}
	
	
}
public class Zeek_43_GuessTheNumber {
	
	public static void main(String[] args) {
		
		Game play= new Game();
		
		boolean b= false;
		
		while(!b) {
			play.takeUserInput();
			b=play.isCorrectNumber();
			
		}
	}
}		
			
			