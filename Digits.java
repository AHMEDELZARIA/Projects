// Prints out the separate digits of an inputted nuumber
package digits;

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num;
     
        // Prompts user for a positive integer   
        System.out.print("Enter a positive integer: ");
        num = input.next();
        
        // Prints out digits separated
        for (int i = 0; i < num.length(); i++) 
        {
            System.out.println(num.charAt(i));
        }
    }
}
