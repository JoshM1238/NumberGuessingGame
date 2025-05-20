# Number Guess Game (Standard Version)

This is a simple terminal-based number guessing game written in Java.

The player and the computer take turns guessing a hidden number within a user-defined range.

> This is the **standard (non-ML)** version of the game.  
> If you're looking for the **machine-learning-enhanced version**, check out the separate repository here:  
> [NumberGuessingGameML](https://github.com/JoshM1238/NumberGuessingGameML)

---

## Features

- User selects the maximum number in the range (minimum is 2)
- The computer and player alternate turns
- Input validation and edge case handling
- Clean, modular design with:
  > `NumberGuessGame.java` — main game loop
  > `ComputerPlayer.java` — computer guess logic
  > `UserTurn.java` — user input and handling

---

## How to Run

1. Make sure you have Java installed.
2. Open a terminal and navigate to the project directory:
   cd /path/to/NumberGuess
3. Compile the Java source files:
   javac *.java
4. Run the program by executing the main class:
   java NumberGuessGame
   
 Note: Make sure you're running the command from the same directory that contains your .java files.
