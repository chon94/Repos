/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.assessment;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Chon Xiong
 */
public class RPS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rock = 1;
        int paper = 2;
        int scissor = 3;
        int userChoice = 0;
        int computerChoice;
        int numberRounds = 0;
        String playAgain = "";
        int tie = 0;
        int userWin = 0;
        int computerWin = 0;
        String userChoiceName = "";

        do {
            // The Game
            System.out.println("\nRock, Paper, Scissor!");
            System.out.println("---------------------");
            System.out.println("---------------------");

            System.out.println("\nPlease enter amount of rounds you want to play?");
            numberRounds = input.nextInt();

            if (numberRounds < 1 || numberRounds > 10) {
                System.out.println("Invalid.");
            }
            if (numberRounds >= 1 || numberRounds <= 10) {
            } else {
                System.out.println("Invalid.");
            }
            for (int i = 1; i <= numberRounds; i++) {

                do {
                    System.out.println("\nUser, make your move!");
                    System.out.println("OPTIONS (Select a number): 1 = rock, 2 = paper, 3 = scissor");
                    userChoice = input.nextInt();
                    if ((userChoice < 0 || userChoice > 3)) {
                        System.out.println("Invalid. Please try entering in: \n1 = rock, 2 = paper, 3 = scissor");
                    }
                    if (userChoice == 1) {
                        userChoiceName = "rock";
                    } else if (userChoice == 2) {
                        userChoiceName = "paper";
                    } else if (userChoice == 3) {
                        userChoiceName = "scissor";
                    }
                    System.out.println("\nUser chose: " + userChoiceName);
                } while (userChoice < 1 || userChoice > 3);

                //computer input
                Random randomizer = new Random();
                computerChoice = (randomizer.nextInt(3) + 1);
                String computerChoiceName = "";

                if (computerChoice == 1) {
                    computerChoiceName = "rock";
                } else if (computerChoice == 2) {
                    computerChoiceName = "paper";
                } else if (computerChoice == 3) {
                    computerChoiceName = "scissor";
                }
                System.out.println("\nComputer chose: " + computerChoiceName);

                //Keeping scores
                if (userChoice == computerChoice) {
                    tie++;
                    System.out.println("\nTie!");
                } else if (userChoice == rock && computerChoice == scissor || userChoice == paper && computerChoice == rock || userChoice == scissor && computerChoice == paper) {
                    userWin++;
                    System.out.println("\nUser wins!");
                } else if (computerChoice == rock && userChoice == scissor || computerChoice == paper && userChoice == rock || computerChoice == scissor && userChoice == paper) {
                    computerWin++;
                    System.out.println("\nComputer wins!");
                }
            }

            //Total game results
            if (userWin > 0 || tie > 0 || computerWin > 0) {

                System.out.println("\nUsers total win: " + userWin);
                System.out.println("Computers total win: " + computerWin);
                System.out.println("Tie: " + tie);
                System.out.println("\nAND the WINNER is: ");
                System.out.println("-------------------");
                if (userWin > computerWin) {
                    System.out.println("User is the winner!");
                } else if (userWin == computerWin) {
                    System.out.println("Nobody! It's a draw!");
                } else if (computerWin > userWin) {
                    System.out.println("Computer is the winner!");
                }
            }

            System.out.println("\nWould you like to play again? [y/n]");
            playAgain = input.nextLine();
            playAgain = input.nextLine();
            
        } while (playAgain.equals("y"));

    }
}

