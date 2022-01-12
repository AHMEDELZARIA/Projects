// Prompts user for a, b, c and calculates roots
package quadratic;

import java.util.*;

public class Quadratic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double a, b, c, answer, answer2;
        
        // Prompts user for a, b, and c
        System.out.print("Enter a value for a: ");
        a = input.nextDouble();
        System.out.print("Enter a value for b: ");
        b = input.nextDouble();
        System.out.print("Enter a value for c: ");
        c = input.nextDouble();
        
        // Calculates roots using quadratic formula
        answer = (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
        // Calculates roots using quadratic formula
        answer2 = (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
        
        // Prints out result
        System.out.format("The roots are %.1f and %.1f\n", answer, answer2);
    }
}
