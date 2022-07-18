// Generates 25 random numbers and displays even and odd numbers
package evenOdd;

import java.util.Random;

public class EvenOdd {

    public static void main(String[] args) {
        // Declare array of size 25 that will hold the 25 random numbers
        int nums[] = new int[25];
        Random r = new Random();
        
        // Generates 25 random numbers 0 - 100 and prints them out
        System.out.println("Numbers:");
        for (int c = 0; c < nums.length; c++) {
            nums[c] = r.nextInt(100);
            System.out.print(nums[c] + " ");
        }
        
        // Checks if even, if true, print them 
        System.out.println("\nEven:");
        for (int c = 0; c < nums.length; c++) {
            if (nums[c] % 2 == 0) {
                System.out.print(nums[c] + " ");
            }
        }
        
        // Checks if odd, if true, print them
        System.out.println("\nOdd:");
        for (int c = 0; c < nums.length; c++) {
            if (nums[c] % 2 != 0) {
                System.out.print(nums[c] + " ");
            }
        }
        System.out.println(" ");
    }
}

