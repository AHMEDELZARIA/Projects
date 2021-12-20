package ch4ex12;
import java.util.Scanner;
public class Ch4Ex12 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double percentDes,percentCod,percentDeb,percentTest,designing,coding,debugging,testing,totalTime;
System.out.println("Enter the number of minutes spent on each of the following project tasks:\n");
System.out.print("Designing: ");
designing = input.nextDouble();
System.out.print("Coding: ");
coding = input.nextDouble();
System.out.print("Debugging: ");
debugging = input.nextDouble();
System.out.print("Testing: ");
testing = input.nextDouble();
input.close();
System.out.println("\nTask           % time");
totalTime = designing + coding + debugging + testing;
percentDes = designing/totalTime*100;
percentCod = coding/totalTime*100;
percentDeb = debugging/totalTime*100;
percentTest = testing/totalTime*100;
System.out.format("Designing      %.2f%%\n", percentDes);
System.out.format("Coding         %.2f%%\n", percentCod);
System.out.format("Debugging      %.2f%%\n", percentDeb);
System.out.format("Testing        %.2f%%\n", percentTest);
}
}
