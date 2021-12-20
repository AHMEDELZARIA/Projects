package ch5ex11;
import java.util.*;
public class Ch5Ex11 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Double a, b, c, answer, answer2;
    System.out.print("Enter a value for a: ");
    a = input.nextDouble();
    System.out.print("Enter a value for b: ");
    b = input.nextDouble();
    System.out.print("Enter a value for c: ");
    c = input.nextDouble();
    answer = (-b + (Math.sqrt(Math.pow(b, 2) - 4*a*c))) / (2*a);
    answer2 = (-b - (Math.sqrt(Math.pow(b, 2) - 4*a*c))) / (2*a);
    System.out.format("The roots are %.1f and %.1f\n" , answer, answer2);
}
}
