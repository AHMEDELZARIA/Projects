package dollarAmount;

import java.util.Scanner;

public class DollarAmount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quarters, dimes, nickels, pennies;
        
        System.out.println("Enter your total coins: ");
        
        // Prompts user for number of quarters
        System.out.print("\nQuarters: ");
        quarters = input.nextInt();
        
        // Prompts user for number of dimes
        System.out.print("Dimes: ");
        dimes = input.nextInt();
        
        // Prompts user for number of nickels
        System.out.print("Nickels: ");
        nickels = input.nextInt();
        
        // Prompts user for number of pennies
        System.out.print("Pennies: ");
        pennies = input.nextInt();
        
        // Prints out total in dollars
        System.out.println("\nTotal : " + getDollarAmount(quarters, dimes, nickels, pennies));

    }
    
    // Method that calculates dollar amount
    public static String getDollarAmount(double quarters, double dimes, double nickels, double pennies) {
        String total;
        double amount;
        amount = (quarters * (.25)) + (dimes * (.10)) + (nickels * (.05)) + (pennies * (.01));
        total = String.format("$%.2f", amount);
        return total;
    }
}
