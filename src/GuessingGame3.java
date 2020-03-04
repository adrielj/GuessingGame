import java.util.Random;
import java.util.Scanner;
public class GuessingGame3 {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner in = new Scanner(System.in);
		
		int randInt = random.nextInt(20);
		int userGuess = 0;
		int guessAmount = 0;
		boolean rightGuess = false;
		
		while (!rightGuess) {
		
			System.out.println("You have guessed " +guessAmount+ " times.");
			System.out.print("What number would you like to guess, betweem 0 and 20?: ");
			
			userGuess =  in.nextInt();
		
			if (userGuess == randInt ) {

				System.out.println("Congratulation! That's correct!");
				in.close();
				rightGuess = true;
			
			} else {
			
				System.out.println("Sorry, that's incorrect. Try again!");
				guessAmount++;
				System.out.println();
			
			}
		
		}
		
	}

}
