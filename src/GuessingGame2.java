import java.util.Random;
import java.util.Scanner;
public class GuessingGame2 {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner in = new Scanner(System.in);
		
		int randInt = random.nextInt(20);
		int guess = 0;
		boolean rightGuess = false;
		
		while (!rightGuess) {
		
			System.out.println("What number would you like to guess, betweem 0 and 20?: ");
			guess =  in.nextInt();
		
			if (guess == randInt ) {

				System.out.println("Congratulation! That's correct!");
				in.close();
				rightGuess = true;
			
			} else {
			
				System.out.println("Sorry, that's incorrect. Try again!");
				System.out.println();
			
			}
		
		}
		
	}

}
