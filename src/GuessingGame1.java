import java.util.Random;
import java.util.Scanner;
public class GuessingGame1 {

	public static void main(String[] args) {

		//this generates a random number
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		
		int randInt = random.nextInt(20);
		int guess = 0;
		
		System.out.println("What number would you like to guess, betweem 0 and 20?: ");
		guess =  in.nextInt();
		
		if (guess == randInt ) {

			System.out.println("Congratulation! That's correct!");
			
		} else {
			
			System.out.println("Sorry, that's incorrect. The secret number was " +randInt+ ".");
			in.close();
			
		}
		
		
	}

}
