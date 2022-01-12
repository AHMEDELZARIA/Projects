// Prompts user for time spent on each task and calculates the percentage of total time spent of each task
package percentTimeCalculator;

import java.util.Scanner;

public class PercentTimeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double percentDes, percentCod, percentDeb, percentTest, designing, coding, debugging, testing, totalTime;
        
 
        System.out.println("Enter the number of minutes spent on each of the following project tasks:\n");
        
        // Designing time
        System.out.print("Designing: ");
        designing = input.nextDouble();
        
        // Coding time
        System.out.print("Coding: ");
        coding = input.nextDouble();
        
        // Coding time
        System.out.print("Debugging: ");
        debugging = input.nextDouble();
        
        // Testing time
        System.out.print("Testing: ");
        testing = input.nextDouble();
        input.close();
        
        
        System.out.println("\nTask           % time");
        
        // Calculates total time spent on all tasks
        totalTime = designing + coding + debugging + testing;
        
        // Percent of time spent designing
        percentDes = designing / totalTime * 100;
        
        // Percent of time spent coding
        percentCod = coding / totalTime * 100;
        
        // Precent of time spent debugging
        percentDeb = debugging / totalTime * 100;
        
        // Percent of time spent testing
        percentTest = testing / totalTime * 100;
        
        // Prints out percent of time spent on each task
        System.out.format("Designing      %.2f%%\n", percentDes);
        System.out.format("Coding         %.2f%%\n", percentCod);
        System.out.format("Debugging      %.2f%%\n", percentDeb);
        System.out.format("Testing        %.2f%%\n", percentTest);
    }
}

