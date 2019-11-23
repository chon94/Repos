/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.assessment;

/**
 *
 * @author G10-DEV10W3
 */
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorIdea {

    public static void main(String[] args) {
        Random randomNumGenerated = new Random();
        Scanner myScanner = new Scanner(System.in);

        getNumOfRounds();
        gameMenu();
        String userChoice = getUserChoice();
        String computerChoice = getComputerChoice(randomNumGenerated);

        System.out.println("You chose " + userChoice + "\nComputer chose " + computerChoice);
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
        System.out.println("The computer has chosen ");
        return computerWordChoice;

    }

    public static String getUserChoice() {
        String userChoice;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("\nUser make your move! ");

        userChoice = myScanner.nextLine();
        return userChoice;
    }

    public static void gameMenu() {
        System.out.println("Game Options:\nrock, paper or scissor");
    }

    public static int getNumOfRounds() {
        Scanner myScanner = new Scanner(System.in);

        int maxTurn, minTurn;
        maxTurn = 10;
        minTurn = 1;

        System.out.println("How many rounds do you want to play ranging from 1-10?");
        int numberRounds = myScanner.nextInt();

        if (numberRounds < 1 || numberRounds > 10) {
            System.out.println("Invalid Round");
        } else {
            System.out.println("You will be playing " + numberRounds + " rounds of Rock, Paper, Scissor.");
        }
        return numberRounds;
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
If the user says Yes, the program starts over, asking the user how many rounds he/she would like to play.
