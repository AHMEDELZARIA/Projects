// Calculates number of montly payments
package finance;

import java.util.*;

public class Finance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p, r, m, answer;
        
        // Prompts user for principle
        System.out.print("Principle: ");
        p = input.nextDouble();
        
        // Prompts user for interest rate
        System.out.print("Interest Rate: ");
        r = input.nextDouble();
        
        // Prompts user for number of monthly payments
        System.out.print("Number of mothly payments: ");
        m = input.nextDouble();
        
        // Prints out monthly payment
        answer = (p * (r / 12)) / (1 - (Math.pow(1 + r / 12, -m)));
        System.out.format("The monthly payment is $%.2f\n", answer);
    }
}
