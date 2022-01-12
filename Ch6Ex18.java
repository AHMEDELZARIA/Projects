// Generates a personalized monogram
package monogram;

import java.util.Scanner;

public class Monogram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1, name2, name3;
        
        // Prompts fdor first name
        System.out.print("Enter your fist name: ");
        name1 = input.next();
        
        // Prompts for middle name initial
        System.out.print("Enter your middle initial: ");
        name2 = input.next();
        
        // Prompts for last name
        System.out.print("Enter your last name: ");
        name3 = input.next();
        
        // Prints out monogram
        System.out.println("Your monogram is: " + name1.substring(0, 1).toLowerCase() + name3.substring(0, 1).toUpperCase() + name2.substring(0, 1).toLowerCase());
    }
}
