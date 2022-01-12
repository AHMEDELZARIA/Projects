// Generates 500 random numbers from 0-9 and prints out number of occurences for each number
package occurences;

import java.util.Random;

public class Occurences {

    public static void main(String[] args) {
        int[] outcomes = new int[10];
        int occurences;
        Random r = new Random();
        
        // Generates 500 random numbers from 0-9
        System.out.println("Number" + "\t" + "Occurences");
        for (int i = 0; i < 500; i++) {
            occurences = r.nextInt(10);
            outcomes[occurences] += 1;
        }
        // Prints index and corresponding occurences
        for (int index = 0; index <= 9; index++) {
            System.out.println(index + "\t" + outcomes[index]);
        }
    }
}
   

