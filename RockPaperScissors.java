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
 * @author G10-DEV10W3
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        Random randomNumGenerated = new Random();
        Scanner myScanner = new Scanner(System.in);
        int rounds;

        rounds = 0;

        while (rounds > 1 || rounds < 10) {

            rounds = getNumOfRounds();

            for (int i = 0; i < rounds; i++) {

            }

            gameMenu();
            String userChoice = getUserChoice();
            String computerChoice = getComputerChoice(randomNumGenerated);

            System.out.println("\nYou chose " + userChoice + "\nComputer chose " + computerChoice);
            chooseWinner(computerChoice, userChoice);

        }

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

        int maxTurn, minTurn;
        maxTurn = 10;
        minTurn = 1;
        int numberRounds = 0;

        System.out.println("How many rounds do you want to play ranging from 1-10?");
        do {
            numberRounds = myScanner.nextInt();

            if (numberRounds < 1 || numberRounds > 10) {
                System.out.println("Invalid Round. Please enter a number between 1-10.");
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
        int countTie;
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
        }
        System.out.println("\n" + winner + " won the round.");
        return winner;
    }

}