package ch7ex5;
import java.util.Scanner;
public class Ch7Ex5 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int quarters, dimes, nickels, pennies;
   
    
    System.out.println("Enter your total coins: ");
    System.out.print("\nQuarters: ");
    quarters = input.nextInt();
    System.out.print("Dimes: ");
    dimes = input.nextInt();
    System.out.print("Nickels: ");
    nickels = input.nextInt();
    System.out.print("Pennies: ");
    pennies = input.nextInt();
    
    System.out.println("\nTotal : " + getDollarAmount(quarters, dimes, nickels, pennies));
    


}
public static String getDollarAmount(double quarters, double dimes, double nickels, double pennies){
    String total;
    double amount;
    amount = (quarters*(.25)) + (dimes*(.10)) + (nickels*(.05)) + (pennies*(.01));
    total = String.format("$%.2f", amount);
    return total;
}
}