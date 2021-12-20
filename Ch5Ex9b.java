package ch5ex9b;
import java.util.*;
public class Ch5Ex9b {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int guess;
Random r = new Random();
int number = r.nextInt(20)+1;
System.out.print("Enter a number between 1 and 20: ");
guess = input.nextInt();
System.out.println("Computer's number: " + number);
System.out.println("Player's number: " + guess);
if (number == guess) {
    System.out.println("You got it!"); 
}
if (number != guess) {
    System.out.println("Better luck next time.");
}
}    
}
