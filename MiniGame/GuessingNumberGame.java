package MiniGame;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int randomNumber = rand.nextInt(99) + 1;
		
		
		
		while(true) {
			System.out.println("Enter your guess (1-100): ");

			int playerGuess = scan.nextInt();
			
			if(playerGuess == randomNumber) {
				System.out.println("You are correct!");
				break;
			} else if(randomNumber > playerGuess) {
				System.out.println("Too low.");
			} else {
				System.out.println("Too high.");
			}
		}
		
		scan.close();

	}

}
