import java.util.Random;

public class ComputerPlayer {
    int low; // Lowest value in the guessable range
    int high; // Highest value in the guessable range
    private int lastGuess; // Holds the previous guess so that the guessable range can be updated accordingly
    private final Random random;

    public ComputerPlayer(int low, int high){
       this.low = low;
       this.high = high;
       this.random = new Random();
    }

    // Choose a number in the given range for the computer to guess
     public int computerMakeGuess(){
        lastGuess = NumberGuessGame.safeRandomInt(random, low, high);
     return lastGuess;
    }

    // Used to compare the computer's guesses to the target number
    public String checkComputerGuess(int currentGuess, int target){

        // Check if the guess is equal to the target.
        // If the guess was lower than the target, return 'higher', meaning that a higher guess is needed
        // If the guess was higher than the target, return 'lower', meaning that a lower guess is needed
        return currentGuess == target ? "correct" : (currentGuess < target ? "higher" : "lower");
    }

    // Combines all required instructions for one computer turn, and updates values to prepare for the next turn
    public boolean handleComputerTurn(int target){
        int guess = computerMakeGuess();
        String guessResult = checkComputerGuess(guess, target);

        System.out.println("The computer guessed " + guess);

        if (guessResult.equals("correct")) {
            System.out.println("The number was " + target + ". The computer wins!");
            return true;

        }
        else if (guessResult.equals("higher")) {
            this.low = lastGuess + 1;
        }

        else {
            this.high = lastGuess - 1;

        }

        return false;
    }
}

