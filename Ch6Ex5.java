package ch6ex5;
import java.util.Scanner;
public class Ch6Ex5 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
String num;
System.out.print("Enter a positive integer: ");
num = input.next();

for (int i = 0 ; i < num.length() ; i++) {
    System.out.println(num.charAt(i));     
} 
}
}