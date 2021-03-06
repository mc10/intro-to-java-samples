package highlowgame;

import java.util.Scanner;

/**
 * Let's play a high/low game!
 * @author Kevin Ji
 */
public class HighLowGame {
    private final int initialNum = (int)(Math.random() * 100) + 1;
    
    public void play() {
        System.out.println("Let's play a high/low game!");
        
        int guess = 0;
        int guessCount = 0;
        int lowerBound = 1;
        int upperBound = 100;
        
        while (guess != initialNum) {
            guess = promptForGuess(lowerBound, upperBound);
            guessCount++;
            
            if (guess < initialNum) {
                System.out.println("Higher...");
                lowerBound = guess + 1;
            } else if (guess > initialNum) {
                System.out.println("Lower...");
                upperBound = guess - 1;
            } else {
                System.out.println("You got it!");
                System.out.println("You took " + guessCount + " guesses.");
                break;
            }
        }
    }
    
    private static int promptForGuess(int lowerBound, int upperBound) {
        System.out.println("Guess a number (" + lowerBound + "-" + upperBound +
                "):");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    
    public static void main(String[] args) {
        HighLowGame game = new HighLowGame();
        game.play();
    }
}
