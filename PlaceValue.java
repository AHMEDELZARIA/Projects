package placeValue;

import java.util.Scanner;

// Class that holds the methods of place values
class DigitExtractor {

    public void W(int number) {
        System.out.print("The whole number is: " + number + "\n");
    }

    public void O(int number) {
        System.out.print("The ones place digit is: " + number % 10 + "\n");
    }

    public void T(int number) {
        System.out.print("The tens place digit is: " + number / 10 % 10 + "\n");
    }

    public void H(int number) {
        System.out.print("The hundreds digit is: " + number / 100 + "\n");
    }
}

public class PlaceValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        String choice = "";
        DigitExtractor num = new DigitExtractor();
        
        // Prompts user for a three digit number
        System.out.print("Enter a three digit number: ");
        number = input.nextInt();
        
        // Continues to print out place values chosen by user until Q is entered
        while (!choice.equalsIgnoreCase("Q")) 
        {
            System.out.println("\nShow (W)hole number.");
            System.out.println("Show (O)nes place number.");
            System.out.println("Show (T)ens place number.");
            System.out.println("Show (H)undreds place number.");
            System.out.println("(Q)uit");
            System.out.print("Enter your choice: ");
            choice = input.next();
            if (choice.equalsIgnoreCase("W")) {
                num.W(number);
            }
            if (choice.equalsIgnoreCase("O")) {
                num.O(number);
            }
            if (choice.equalsIgnoreCase("T")) {
                num.T(number);
            }
            if (choice.equalsIgnoreCase("H")) {
                num.H(number);
            }
        }
    }
}
