package ch7ex10;
import java.util.Scanner;
public class Ch7Ex10 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int max = 20, min = 1, Guess = 0;
    int computer = (int)(Math.random() * (max-min+1) + min);


while (Guess != computer) {
    System.out.print("Enter a number between 1 and 20: ");
    Guess = input.nextInt();
    LowG(Guess, computer);
}
    System.out.print("You Won!\n");


}
public static void LowG(int Guess, int computer){
    if (Guess > computer){
    System.out.println("Hint: try a lower number.");
    }
    if (Guess < computer){
    System.out.println("Hint: try a higher number");
}
}
}


