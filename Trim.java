// Promtps user for a sentence then prompts user for a string they would like to remove from the sentence
package trim;

import java.util.Scanner;

public class Trim {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence, word;
     
        // Prompts user for a sentence
        System.out.print("Enter a sentence: ");
        sentence = input.nextLine();
        
        // Prompts user for a string they want to remove from the sentence
        System.out.print("Enter a string: ");
        word = input.next();
        
        // Updates sentence
        sentence = sentence.replaceAll(word, "");
        sentence = sentence.trim().replaceAll("  ", " ");
     
        // Prints out updated sentence
        System.out.print(sentence + "\n");
    }
}
