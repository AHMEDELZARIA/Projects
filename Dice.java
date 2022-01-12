// Generates random dice 1 and dice 2 and prints them both out including the sum
package dice;

import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {
        Random r = new Random();
        int dice1, dice2, total;
        
        // Prints header for table
        System.out.format("%10s%10s%10s\n", "Dice 1", "Dice 2", "Total");
        
        // Generates random numbers between and including 1 and 6, calculates total sum and prints out dice 1, dice2, and total
        for (int c = 0; c < 5; c++) 
        {
            dice1 = r.nextInt(6) + 1;
            dice2 = r.nextInt(6) + 1;
            total = dice1 + dice2;
            System.out.format("%10s%10s%10s\n", dice1, dice2, total);
        }
    }
}

