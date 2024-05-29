package codsoft;
import java.util.Random;
import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 7;
        int rounds = 0;
        int totalAttempts =0;
        int totalRoundsWon = 0;
        System.out.println("Welcome to Guess the Number!");
        boolean playAgain = true;
        while (playAgain) {
        	rounds++;
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            boolean roundWon = false;
            System.out.println("\nRound " + rounds + ":");
            System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ".");
            while (attempts < maxAttempts)  {
            	System.out.print("Enter your guess: ");
                int userGuess;
                try {
                	userGuess = Integer.parseInt(scanner.nextLine());
                }
                catch (NumberFormatException e) {
                	System.out.println("Please enter a valid number.");
                    continue;
                }
                attempts++;
                if (userGuess < targetNumber) {
                	System.out.println("Too low! Try again.");
                }
                else if (userGuess > targetNumber) {
                	System.out.println("Too high! Try again.");
                }
                else {
                	System.out.println("Congratulations! You've guessed the number " + targetNumber + " in " + attempts + " attempts!");
                    totalAttempts += attempts;
                    totalRoundsWon++;
                    roundWon = true;
                    break;
                }
            }
            if (!roundWon) {
            	System.out.println("Sorry, you've exceeded the maximum number of attempts. The correct number was " + targetNumber + ".");
            }
            System.out.println("\nRound " + rounds + " completed in " + attempts + " attempts.");
            System.out.println("Total attempts so far: " + totalAttempts);
            System.out.println("Rounds won: " + totalRoundsWon);
            System.out.print("Do you want to play again? (yes/no): ");
            String choice = scanner.nextLine().toLowerCase();
            if (!choice.equals("yes")) {
            	 playAgain = false;
            }
        }
        System.out.println("Thanks for playing!");
        System.out.println("Total rounds played: " + rounds);
        System.out.println("Total attempts made: " + totalAttempts);
        System.out.println("Rounds won: " + totalRoundsWon);
        
        scanner.close();

	}

}
