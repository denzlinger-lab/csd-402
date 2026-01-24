/*
Abram Denzlinger
January 24, 2026
2.2 - Rock, Paper, Scissors

This program is like the popular game titled "Rock-
Paper-Scissors."
 */

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Initialize Scanner for user input
        // and Random for computer selection
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // REQ: randomly generates the numbers 0, 1, or 2
        // then adds 1 to the result
        // and assigns to computerChoice variable
        int computerChoice = rand.nextInt(3) + 1;

        // REQ: prompts the user to enter a value of 1, 2, or 3
        // and assigns it to userChoice variable
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
        int userChoice = input.nextInt();

        // REQ: a readable message
        // convert the numbers to a string via
        // separate method
        String userStr = getChoiceName(userChoice);
        String compStr = getChoiceName(computerChoice);

        // REQ: display selections
        System.out.println("\n--- Results ---");
        System.out.println("You chose: " + userStr);
        System.out.println("Computer chose: " + compStr);

        // REQ: display results
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win! " + userStr + " beats " + compStr + ".");
        } else {
            System.out.println("Computer wins! " + compStr + " beats " + userStr + ".");
        }

        input.close();
    }

    // Helper method to turn 1, 2, 3 into words
    public static String getChoiceName(int choice) {
        return switch (choice) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            case 3 -> "Scissors";
            default -> "Invalid Choice";
        };
    }
}