/*
 * Class: CMSC203
 * Instructor:Monshi, Khandon
 * Description: We are making a Random Number Guesser to test our loops andrand utility
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source
 * I have not given my code to any student.
 * Justin Rodrigues
 */
import java.util.Scanner;
import java.util.Random;
public class RandomNumberGuesser {

	public static void main(String[] args) {
		
		/*
		 * This is here for the user to input their answer
		 */
		Scanner in = new Scanner(System.in);
		
		/*
		 * This will create an object from the RNG class
		 */
		RNG randObj = new RNG();
		
		/*
		 * This'll hold the user's input 
		 */
		String answer = "";
		
		
		System.out.println("Welcome to my random number guesser!!");
		
		/**
		 * This is where it really begins
		 */
		do {
			
			/*
			 * During the loop, it'll always reset to zero
			 */
			
			
			/*
			 * This will reset the amount of guesses
			 * in the RNG class every loop
			 */
			randObj.resetCount();
			
			/*
			 * @param lowGuess, holds the lowest guess
			 * @param highGuess, holds the highest guess
			 * @param nextguess, holds the user's guess
			 */
			int lowGuess = 0;;
			int highGuess = 100;
			int guessNum = 0;
			
			//This'll hold the random number 
			int randNum = randObj.rand();
			
			//Tells user to input their guess
			System.out.println("Enter your first guess:"); 
			
			//User inputs their first guess
			guessNum = in.nextInt();
			
			//Another do-while to check whether they can guess the random number
			do {				
				
				/*
				 * If the number is higher than the random number 
				 */
				if(guessNum > randNum) {
					
					//This will initiate the count in the object class and check the number
					if(randObj.inputValidation(guessNum, lowGuess, highGuess)) {
						
						highGuess = guessNum;
						
					}
					
					System.out.println("Number of guesses: " + randObj.getCount());
					System.out.println("Your guess is too high!\n" + "Enter your next guess between "
										+ lowGuess + " and " + highGuess);
					//User input another guess
					guessNum = in.nextInt();
					
				}
				
				/*
				 * This will occur when the number the
				 * user guess is lower than the random number
				 */
				if(guessNum < randNum) {
					
					//This will initiate the count in the object class and check the number
					if(randObj.inputValidation(guessNum, lowGuess, highGuess)) {
						
						lowGuess = guessNum;
						
					}
					
					System.out.println("Number of guesses: " + randObj.getCount());
					System.out.println("Your guess is too low!\n" + "Enter your next guess between "
										+ lowGuess + " and " + highGuess);
					//User input their next guess
					guessNum = in.nextInt();
					
				}
				
			}while(guessNum != randNum);
			
			/*
			 * Ending message
			 */
			System.out.println("Congratulations, you guessed correctly");
			System.out.println("Try again? (yes or no) ");
			//Clears the scanner
			in.next();
			//User enters whether they want to try again
			answer = in.nextLine();
			
			
		}while(answer.equals("yes") || !answer.equals("no"));
		
		System.out.println("Thanks for playing!");
	}

}
