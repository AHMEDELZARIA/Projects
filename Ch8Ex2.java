package ch8ex2;
import java.util.Scanner;
class DigitExtractor {
    public void W(int number){
        System.out.print("The whole number is: " + number + "\n");
    }
    public void O(int number){
        System.out.print("The ones place digit is: " + number % 10 + "\n");
    }
    public void T(int number){
        System.out.print("The tens place digit is: " + number/10%10 + "\n");
    }
    public void H(int number){
        System.out.print("The hundreds digit is: " + number/100 + "\n");
    }   
}
public class Ch8Ex2 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number;
    String choice = "";
    DigitExtractor num = new DigitExtractor();
    
    System.out.print("Enter a three digit number: ");
    number = input.nextInt();
    
    while(!choice.equalsIgnoreCase("Q")) {
        System.out.println("\nShow (W)hole number.");
        System.out.println("Show (O)nes place number.");
        System.out.println("Show (T)ens place number.");
        System.out.println("Show (H)undreds place number.");
        System.out.println("(Q)uit");
        System.out.print("Enter your choice: ");
        choice = input.next();
        if(choice.equalsIgnoreCase("W")){
        num.W(number);
    }
        if(choice.equalsIgnoreCase("O")){
        num.O(number);
    }
        if(choice.equalsIgnoreCase("T")){
        num.T(number);
    }
        if(choice.equalsIgnoreCase("H")){
        num.H(number);
    }        
}    
}
}