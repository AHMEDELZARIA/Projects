package ch6ex19;
import java.util.Scanner;
public class Ch6Ex19 {
public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
    String sentence, word;
    System.out.print("Enter a sentence: ");
    sentence = input.nextLine();
    System.out.print("Enter a string: ");
    word = input.next();
    
    
    sentence = sentence.replaceAll(word, "");
    sentence = sentence.trim().replaceAll("  ", " ");
    System.out.print(sentence + "\n");           
}    
}
