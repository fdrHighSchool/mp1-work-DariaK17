
/**
 * Write a description of class rng here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.Random;
public class rng
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("On what diffucalty you want to play. Easy, Medium, Hard? ");
        String mode = s.nextLine();
        mode = mode.toLowerCase();
        int max;
        if(mode.equals("easy")) {
            max = 10;
        }//end if statement
        else if(mode.equals ("medium")) {
            max = 50;
        }//end else if statement
        else {
            max = 100;
        }//ende else statement 
        //we will take a users wish and create a random number
        System.out.println(max);
        //Random r = new Random();
        //int mysteryNumber = r.nextInt(max) + 1; // just a placeholder for now
        
        int mysteryNumber= (int)(Math.random()* max + 1);
        System.out.print("Enter your guess: ");
        int playerGuess = s.nextInt();
        
        // if the player guessed incorrectly
        while (playerGuess != mysteryNumber){
        if(playerGuess != mysteryNumber) {
            // if the player guessed too low
            if(playerGuess < mysteryNumber) {
                System.out.println("You were off by " + (mysteryNumber - playerGuess));
                System.out.print("Enter your guess: ");
                playerGuess = s.nextInt();
            } // end inner if statement
            // if the player didn't guess too low (meaning, incorrect and too high!)
            else {
                System.out.println("You were off by " + (playerGuess - mysteryNumber));
                System.out.print("Enter your guess: ");
                playerGuess = s.nextInt();
            } // end inner else statement
        } // end outer if statement
    
        // if the player didn't guess incorrectly (meaning, correct guess)
    }
     {
        System.out.println("Correct!!!");
        } // end outer else statement
    } // end main method
} // end class