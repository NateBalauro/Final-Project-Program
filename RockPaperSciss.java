/*
Name: Nathaniel Balauro
Class: CS&145
Assingment: Final
Purpose: To create a simple rock paper scissors game between a user and the CPU.
*/


import java.util.*;

public class RockPaperSciss {
        
   public static void loopRPS () {
      
      int i = 0;
      int gameCount = 1;
      
      menu();
       
      for(i = 0; i <= gameCount; i++){
         System.out.println();
         System.out.println("Would you like to play again?");
         System.out.println("Yes(1) or No(2)");
         System.out.println();
         
         Scanner input = new Scanner(System.in);
         
         if(input.nextInt() == 1){
            Rps();
            gameCount++;
         }
         else if (input.nextInt() == 2) {
            System.out.println("Okay then...Goodbye!");
            System.exit(0);
         }
         else {
            System.out.println("Please select a given option: ");
         }
      }

      
   } // end of loopRPS
   
   public static void menu (){
      
      System.out.println("Welcome to the game of Rock, Paper, and Scissors.");
      System.out.println("Please choose an option below: ");
      System.out.println("(0) Ready to play \n(1) No, I am leaving");
      
      Scanner input = new Scanner(System.in);
      
      if(input.nextInt() == 1){
         System.out.println("Okay then...Goodbye!");
         System.exit(0);
      }
      else if (input.nextInt() == 0) {
         System.out.println("Okay, let's begin!...");
         Rps();
      }
      else {
         System.out.println("Please select a given option: ");
      }
   }
   
   public static void Rps () {
      //Declare variables 
      int userChoice, computerChoice, rock, paper, scissors;
      
      Scanner input = new Scanner (System.in);
      
      //create random input for computer
      Random rnd = new Random();  
      
      //Assigning values to the variables:
      rock = 0;
      paper = 1;
      scissors = 2;
      
      //display the menu
      System.out.println();
      System.out.println("Enter your choice:\n(0)rock, (1)paper, (2)scissors");
      
      //User input
      userChoice = input.nextInt();
         //if user chooses above 2
         //while (userChoice > 2) {
            //System.out.println("give number between 0 and 2");
            //userChoice = input.nextInt();
        // }         //user selections
         if (userChoice == 0){
            System.out.println("You chose ROCK");
         }
         else if(userChoice == 1) {
               System.out.println("You chose PAPER");
            }
         else if(userChoice == 2) {
               System.out.println("You chose SCISSORS");
         }
         else{
            System.out.println("Please select a given option:");
            System.out.println("(0)rock, (1)paper, (2)scissors");
            userChoice = input.nextInt();
         }
             
      //computer input
      computerChoice = rnd.nextInt(3);
      
      if(computerChoice == rock) {
         System.out.println("CPU chose ROCK");
      }
      else {
         if(computerChoice == paper){
            System.out.println("CPU chose PAPER");
         }
         else {
            System.out.println("CPU chose SCISSORS");
         }
      }
      
      //Results section
      
      //Draw
      while (userChoice == computerChoice) {
         System.out.println("draw, try again:");
            
         // if user chooses above 2
         userChoice = input.nextInt();
         while (userChoice > 2) {
            System.out.println("give number between 0 and 2");
            userChoice = input.nextInt();
         }
         computerChoice = rnd.nextInt(3);
                       
         // DRAW user selections
         if (userChoice == rock){
            System.out.println("You chose ROCK");
         }
         else {
            if(userChoice== paper) {
               System.out.println("You chose PAPER");
            }
            else {
               System.out.println("You chose SCISSORS");
            }
			}      
         
         //DRAW computer selection
         if(computerChoice == rock) {
            System.out.println("CPU chose ROCK");
         }
         else{
            if(computerChoice == paper) {
               System.out.println("CPU chose PAPER");
            }
            else {
               System.out.println("CPU chose SCISSORS");
            }
         }
      } //END DRAW
      
      //RESULTS
      if (computerChoice==rock){
         if (userChoice==paper){  
            System.out.println("You win!!!");
         }
         else {
            System.out.println("CPU Wins :(");
         }
      }
      else if (computerChoice==paper) {
         if (userChoice==rock) {
            System.out.println("CPU wins :(");
         }
         else{
            System.out.println("You Win!!!");
         }
      }
      else if (userChoice==rock) {
         System.out.println("You Win!!!");
      }
      else {
         System.out.println("CPU Wins :(");
      } //END RESULTS
      
   }//END Rps
    
}//END class