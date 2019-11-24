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
        while(rounds >= 1 || rounds <= 10){  //TRYING TO LOOP round of games of what the user inputted.
        
        rounds = getNumOfRounds();
        rounds--;
        
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
        /*if(userChoice == "rock" || userChoice == "paper" || userChoice == "scissor"){
            personPlay = userChoice;
        }else{
            System.out.println("Invalid Input");
        }*/
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
       
   
          



           
            
        
    


   /* public static int keepScore(int score){
        
        int tie;
        int userScore;
        int computerScore;
        // if user choose rock and comp chooses paper. Computer wins.
        if(userChoice.equal "rock" && computerChoice.equal "scissor"){
        userScore++;
        }else if{userChoice.equal "paper" && computerChoice.equal "rock"){
        userScore++;
        }else(userChoice = "scissor" && computerChoice = "paper")
        userScore++;
        }else
            computerScore++;
                    
        if(userChoice.equal "rock" && computerChoice.equal "rock"){
        tie++;
        }else if(userChoice.equal "paper" && computerChoice.equal "paper"){
        tie++;
        }else if(userChoice.equal "scissor" && computerChoice.equal "scissor"){
        tie++;
        }*/
    


    
        
        
        
        
        
        
        
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*Scanner myScanner = new Scanner(System.in);
        
        int maxTurn, minTurn;
        maxTurn = 10;
        minTurn = 1;
        
        System.out.println("How many rounds do you want to play ranging from 1-10?");
        int numberRounds = myScanner.nextInt(); 
      
        if(numberRounds < 1 || numberRounds > 10){
            System.out.println("Invalid Round");
            return;
        } 
            System.out.println("You will be playing " + numberRounds + " rounds of Rock, Paper, Scissor.");
           
        //variables    
        String rock, paper, scissor;
        int win, loss, draw, rounds;
       
        //User Inputs
       System.out.println("Enter in: rock, paper or scissor: ");
        
       //user
        boolean invalidMove = false;
        
        while (invalidMove == false); {       
            
            
         int user = 0;
         String userChoose = "";
            
         if(user == 1){
             userChoose = "rock";
         } else if(user == 2){
             userChoose = "paper";
         } else if(user == 3){
             userChoose = "scissor";
         } else{
             userChoose = "";
             invalidMove = true;
         }
         
            System.out.println(userChoose);
             
        } 
         
             
        
            
        
        //computer
        
        
        
    }
}



/* while (userChoice.equals("rock")) { 
       
            
        if(userChoice == "rock"){
            System.out.println("You choose " + userChoice);
        } else {
            System.out.println("ERROR. Try entering rock, paper or scissor");
        }   
            /*if(userChoice == "paper"){
            System.out.println("You choose " + userChoice);
        } else if (userChoice == "scissor"){
            System.out.println("You choose " + userChoice);
        } else {
            System.out.println("ERROR. Try entering rock, paper or scissor");
        }
        return userChoice;*/
      
        
   
        
    
   /* public static int getNumOfRounds(){
        Scanner myScanner = new Scanner(System.in);
        
        int maxTurn, minTurn;
        maxTurn = 10;
        minTurn = 1;
        
        System.out.println("How many rounds do you want to play ranging from 1-10?");
        int numberRounds = myScanner.nextInt(); 
      
        if(numberRounds < 1 || numberRounds > 10){
            System.out.println("Invalid Round");
            return;
            
        } 
           System.out.println("You will be playing " + numberRounds + " rounds of Rock, Paper, Scissor."); 
    } return;*/
