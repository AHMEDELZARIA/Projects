// Generates 10 unrepeated random numbers and take the sum of every other integer  to form a new number
package newNumber;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NewNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        int[] tenNumbers = new int[10];

        for (int i = 0; i < 10; i++) {
            int rn = r.nextInt(50);
            tenNumbers[i] = rn;
            for (int x = 0; x < i; x++) {
                if (tenNumbers[x] == tenNumbers[i]) {
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(tenNumbers[i] + " ");
        }
        String form = "";
        for (int i = 0; i < 10; i++) {
            form += String.valueOf(tenNumbers[i]);
        }
        int y = 0;
        for (int i = 0; i < form.length(); i += 2) {
            y += Integer.parseInt(form.substring(i, i + 1));
        }
        System.out.println("\nNew number: " + y);
    }
}
