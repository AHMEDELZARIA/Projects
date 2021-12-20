package ch6ex18;
import java.util.Scanner;
public class Ch6Ex18 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String name1, name2, name3;
    System.out.print("Enter your fist name: ");
    name1 = input.next();
    System.out.print("Enter your middle initial: ");
    name2 = input.next();
    System.out.print("Enter your last name: ");
    name3 = input.next();
    System.out.println("Your monogram is: " + name1.substring(0,1).toLowerCase() + name3.substring(0,1).toUpperCase() + name2.substring(0,1).toLowerCase());
}}