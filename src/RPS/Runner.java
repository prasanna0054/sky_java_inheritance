package RPS;

import java.util.*;
public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice : {Rock, Paper, or Scissors}:");
        String playerInput = scanner.nextLine().toUpperCase();

        Choice playerChoice;
        try {
            playerChoice = Choice.valueOf(playerInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
            scanner.close();
            return;
        }

        GameResult result = RockPaperScissors.play(playerChoice);
        System.out.println("Result: " + result);

        scanner.close();
    }
    }

