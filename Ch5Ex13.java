package ch5ex13;
import java.util.*;
public class Ch5Ex13 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double p, r, m, answer;
    System.out.print("Principle: ");
    p = input.nextDouble();
    System.out.print("Interest Rate: ");
    r = input.nextDouble();
    System.out.print("Number of mothly payments: ");
    m = input.nextDouble();
    answer = (p*(r/12)) / (1-(Math.pow(1+r/12,-m)));
    System.out.format("The monthly payment is $%.2f\n" , answer);
}    
}
