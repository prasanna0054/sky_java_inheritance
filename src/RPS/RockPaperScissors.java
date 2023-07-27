package RPS;
import java.util.*;
public class RockPaperScissors {

    // Method to determine the result of the game
    public static GameResult play(Choice playerChoice) {
        Random random = new Random();
        Choice cpuChoice = Choice.values()[random.nextInt(Choice.values().length)];

        System.out.println("You chose: " + playerChoice);
        System.out.println("CPU chose: " + cpuChoice);

        if (playerChoice == cpuChoice) {
            return GameResult.DRAW;
        } else if (
                (playerChoice == Choice.ROCK && cpuChoice == Choice.SCISSORS) ||
                        (playerChoice == Choice.PAPER && cpuChoice == Choice.ROCK) ||
                        (playerChoice == Choice.SCISSORS && cpuChoice == Choice.PAPER)
        ) {
            return GameResult.WIN;
        } else {
            return GameResult.LOSE;
        }
    }
}
