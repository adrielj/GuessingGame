import java.util.Random;
import java.util.Scanner;
public class GuessingGame4 {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner in = new Scanner(System.in);
		
		int randInt = random.nextInt(20);
		int userGuess = 0;
		int guessAmount = 0;
		boolean rightGuess = false;
		
		//this is the start of the do statement, which executes code based on the while statement
		do {
					
			System.out.println("You have guessed " +guessAmount+ " times.");
			System.out.print("What number would you like to guess, betweem 0 and 20?: ");
			userGuess =  in.nextInt();
			System.out.println();
				
			if (userGuess == randInt ) {

				System.out.println("Congratulation! That's correct!");
				in.close();
				rightGuess = true;
				
				} else {
				
				System.out.println("Sorry, that's incorrect. Try again!");
				
				//this increases the amount of guessed every time a guess is made in the loop
				guessAmount++;
				System.out.println();	
			
				}
					
		}	while (!rightGuess);
		
		
	}

}
