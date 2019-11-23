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
        
        
        System.out.println("You chose " + userChoice +"\nComputer chose " + computerChoice);
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
    
    public static String getUserChoice(){
        String userChoice;
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("\nUser make your move! ");
        
        userChoice = myScanner.nextLine();
           return userChoice;   
    } 
    public static void gameMenu(){
        System.out.println("Game Options:\nrock, paper or scissor");
    }
    
    public static int getNumOfRounds(){
        Scanner myScanner = new Scanner(System.in);
        
        int maxTurn, minTurn;
        maxTurn = 10;
        minTurn = 1;
        
        System.out.println("How many rounds do you want to play ranging from 1-10?");
        int numberRounds = myScanner.nextInt(); 
      
        if(numberRounds < 1 || numberRounds > 10){
            System.out.println("Invalid Round");
          } else
           System.out.println("You will be playing " + numberRounds + " rounds of Rock, Paper, Scissor."); 
        return numberRounds;
    } 
     
    }
        
     