/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.assessment;

import static com.sg.assessment.RockPaperScissorIdea.getNumOfRounds;
import static com.sg.assessment.RockPaperScissors.getNumOfRounds;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Chon Xiong
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        Random randomNumGenerated = new Random();
        Scanner myScanner = new Scanner(System.in);
        
        int rounds;
        int roundCount = 0;
        String playAgain= "";
        rounds = getNumOfRounds();
        
        while (roundCount > 1 || roundCount < 10){
            
            roundCount++;

            gameMenu();
            String userChoice = getUserChoice();
            String computerChoice = getComputerChoice(randomNumGenerated);

            System.out.println("\nYou chose " + userChoice + "\nComputer chose " + computerChoice);
            chooseWinner(computerChoice, userChoice);
            
            System.out.println("Would you like to play again? [y/n]");
            playAgain = myScanner.nextLine();
            playAgain = myScanner.nextLine();
        } while (playAgain.equals('y'));
        
            System.out.println("Thanks for playing!");
    }

    public static String getComputerChoice(Random random) {
        int wordNum;
        wordNum = random.nextInt(3) + 1;
        String computerWordChoice = "";

        if (wordNum == 1) {
            computerWordChoice = "rock";
        } else if (wordNum == 2) {
            computerWordChoice = "paper";
        } else if (wordNum == 3) {
            computerWordChoice = "scissor";
        }
        System.out.println("\nThe computer has chosen ");
        return computerWordChoice;
    }

    public static String getUserChoice() {
        String userChoice;
        String personPlay;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("\nUser make your move! ");

        userChoice = myScanner.nextLine();

        return userChoice;
    }

    public static void gameMenu() {
        System.out.println("\nGame Options:\nrock, paper or scissor");
    }

    public static int getNumOfRounds() {
        Scanner myScanner = new Scanner(System.in);

        int numberRounds = 0;

        
        do {
            System.out.println("How many rounds do you want to play ranging from 1-10?");
            numberRounds = myScanner.nextInt();

            if (numberRounds < 1 || numberRounds > 10) {
                System.out.println("Invalid.");
                System.exit(1);
            } else {
                System.out.println("You will be playing " + numberRounds + " rounds of Rock, Paper, Scissor.");
            }

        } while (numberRounds < 1 || numberRounds > 10);
        return numberRounds;
    }

    public static String chooseWinner(String computerChoice, String userChoice) {
        String winner = "No winner";
        int countUserWins = 0;
        int countComputerWins = 0;
        int countTie = 0;
        int countRounds;

        if (computerChoice.equals("rock") && userChoice.equalsIgnoreCase("scissors")) {
            winner = "Computer";
            countComputerWins++;
        } else if (userChoice.equalsIgnoreCase("rock") && computerChoice.equals("scissors")) {
            winner = "User";
            countUserWins++;
        }
        if (computerChoice.equals("paper") && userChoice.equalsIgnoreCase("rock")) {
            winner = "Computer";
            countComputerWins++;
        } else if (userChoice.equalsIgnoreCase("paper") && computerChoice.equals("rock")) {
            winner = "User";
            countUserWins++;
        }
        if (computerChoice.equals("scissor") && userChoice.equalsIgnoreCase("paper")) {
            winner = "Computer";
            countComputerWins++;
        } else if (userChoice.equalsIgnoreCase("scissor") && computerChoice.equals("paper")) {
            winner = "User";
            countUserWins++;
        } else
            System.out.println("\n" + winner + " won the round.");
            countTie++;
        
            System.out.println("\nThe final score is user: " + countUserWins + " and computer: " +countComputerWins);
            if(countUserWins > countComputerWins){
                System.out.println("User is the winner!");
            } else if (countComputerWins > countUserWins){
                System.out.println("Computer is the winner!");
            } else
                System.out.println("Tie!");
        return winner;
    }

}

/*Rock, Paper, Scissors
Before you begin
It's very important to have a plan before you write any code. For some people, flowcharts work best. For others, a list of logical steps that include jumps back to other steps is effective. It's also a good idea to sketch out the UI, get an idea of how one "screen" transitions to another.

Once you have a plan, implement. You'll probably notice that your plan changes. That's perfectly normal. The important thing is to have a plan to get started. Then, adjust as necessary.

Rules
Each player chooses Rock, Paper, or Scissors.
If both players choose the same thing, the round is a tie.
Otherwise:
Paper wraps Rock to win
Scissors cut Paper to win
Rock breaks Scissors to win
Requirements
This program will be a Java Console Application called RockPaperScissors.

The program first asks the user how many rounds he/she wants to play.
Maximum number of rounds = 10, minimum number of rounds = 1. If the user asks for something outside this range, the program prints an error message and quits.
If the number of rounds is in range, the program plays that number of rounds.  Each round is played according to the requirements below.
For each round of Rock, Paper, Scissors, the program does the following:
The computer asks the user for his/her choice (Rock, Paper, or Scissors).
Hint: 1 = Rock, 2 = Paper, 3 = Scissors
After the computer asks for the user’s input, the computer randomly chooses Rock, Paper, or Scissors and displays the result of the round (tie, user win, or computer win).
Hint: use the Random class.
The program must keep track of how many rounds are ties, user wins, or computer wins.
Hint: Create three variables to keep track of these items and update them correctly after each round.
The program must print out the number of ties, user wins, and computer wins and declare the overall winner based on who won more rounds.
After all rounds have been played and the winner declared, the program must ask the user if he/she wants to play again.
If the user says No, the program prints out a message saying, “Thanks for playing!” and then exits.
If the user says Yes, the program starts over, asking the user how many rounds he/she would like to play.*/