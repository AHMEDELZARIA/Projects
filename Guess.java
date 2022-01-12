// Number guessing game between user and computer
package guess;

import java.util.*;

public class Guess {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess;
        
        // Generates a random number between 1 - 20
        Random r = new Random();
        int number = r.nextInt(20) + 1;
        
        // Prompts user for guess
        System.out.print("Enter a number between 1 and 20: ");
        guess = input.nextInt();
        
        // Prints out computer's and player's numbers
        System.out.println("Computer's number: " + number);
        System.out.println("Player's number: " + guess);
        
        // Checks for win
        if (number == guess) 
        {
            System.out.println("You got it!");
        }
        if (number != guess) 
        {
            System.out.println("Better luck next time.");
        }
    }
}
