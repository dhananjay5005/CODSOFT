package com.app;

		import java.util.Random;
		import java.util.Scanner;

		public class numbergame {
			
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();
		        
		        int minRange = 1;
		        int maxRange = 100;
		        int attempts = 10;
		        int score = 0;
		        
		        System.out.println("Welcome to the Number Guessing Game!");
		        System.out.println("You have " + attempts + " attempts to guess the number between "
		                + minRange + " and " + maxRange + ".");
		        
		        boolean playAgain = true;
		        
		        while (playAgain) {
		            int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
		            int remainingAttempts = attempts;
		            
		            System.out.println("New round! Guess the number.");
		            
		            while (remainingAttempts > 0) {
		                System.out.print("Enter your guess: ");
		                int userGuess = scanner.nextInt();
		                
		                if (userGuess < minRange || userGuess > maxRange) {
		                    System.out.println("Your guess is out of range.");
		                } else if (userGuess == numberToGuess) {
		                    System.out.println("Congratulations! You've guessed the correct number: " + numberToGuess);
		                    score++;
		                    break;
		                } else if (userGuess < numberToGuess) {
		                    System.out.println("Your guess is too low.");
		                } else {
		                    System.out.println("Your guess is too high.");
		                }
		                
		                remainingAttempts--;
		                if (remainingAttempts > 0) {
		                    System.out.println("Remaining attempts: " + remainingAttempts);
		                } else {
		                    System.out.println("Out of attempts. The correct number was: " + numberToGuess);
		                }
		            }
		            
		            System.out.print("Do you want to play again? (yes/no): ");
		            String playAgainResponse = scanner.next().toLowerCase();
		            if (!playAgainResponse.equals("yes")) {
		                playAgain = false;
		            }
		        }
		        
		        System.out.println("Game over. Your score: " + score);
		        scanner.close();
		 }
	}
