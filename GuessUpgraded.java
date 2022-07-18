// This is an upgrade from the guess game where it now gives hints and user has unlimeted tries until number is guessed
package guessUpgraded;

import GuessUpgraded;

public class Ch7Ex10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 20, min = 1, Guess = 0;
        int computer = (int) (Math.random() * (max - min + 1) + min);
        
        // Prompts user for a number and displays hint as long as number not guessed
        while (Guess != computer) 
        {
            System.out.print("Enter a number between 1 and 20: ");
            Guess = input.nextInt();
            LowG(Guess, computer);
        }
        // If number is guessed then print out winning line
        System.out.print("You Won!\n");

    }
    
    // Method that generates appropriate hint
    public static void LowG(int Guess, int computer) 
    {
        if (Guess > computer) 
        {
            System.out.println("Hint: try a lower number.");
        }
        if (Guess < computer) 
        {
            System.out.println("Hint: try a higher number");
        }
    }
}


