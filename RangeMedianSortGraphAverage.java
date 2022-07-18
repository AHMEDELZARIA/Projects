package rangeAverageMedianSortGraph;

import java.util.ArrayList;
import java.util.Scanner;

public class RangeAverageMedianSortGraph {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> value = new ArrayList();
        int number = 0, sum = 0, average = 0, min = 0, max = 0, range = 0;

        //Collect numbers into array and set accumulator for sum
        while (number != 999) 
        {
            System.out.println("Enter a number from 1-50 (999 to quite): ");
            number = input.nextInt();
            if (number >= 1 && number <= 50) 
            {
                value.add(number);
                sum += number;
            }
        }
        //Average
        average = sum / value.size();
        System.out.println("The average is " + average + ".");

        //Range
        min = value.get(0);
        max = value.get(0);

        for (int c = 1; c < value.size(); c++) 
        {
            if (value.get(c) > max) 
            {
                max = value.get(c);
            }
            if (value.get(c) < min) 
            {
                min = value.get(c);
            }
        }

        range = max - min;
        System.out.println("The smallest number is " + min + ".");
        System.out.println("The largest number is " + max + ".");
        System.out.println("The range is " + range + ".");

        //Sort
        int sort = 0;
        for (int i = 0; i < value.size(); i++) 
        {
            for (int j = 0; j < value.size() - 1; j++) 
            {
                if (value.get(j) > (value.get(j + 1))) 
                {
                    sort = value.get(j);
                    value.set(j, value.get(j + 1));
                    value.set(j + 1, sort);
                }
            }
        }

        //Median
        double median = 0, median1 = 0, median2 = 0, Median = 0;
        if (value.size() % 2 != 0 && value.size() != 2) 
        {
            median = value.size() / 2;
            System.out.println("Median: " + value.get((int) median));

        }
        if (value.size() % 2 == 0 && value.size() != 2) 
        {
            median1 = (double) value.size() / 2;
            median2 = (double) (value.size() / 2) - 1;
            median = (value.get((int) median1)) + value.get((int) median2);
            Median = median / 2;
            System.out.println("Median: " + Median);
        } else if (value.size() == 2) {
            median = (((double) value.get(0) + (double) value.get(1)) / 2);
            System.out.println("Median: " + median);
        }

        //Graph
        System.out.print("\n  1 - 5: ");
        for (int i = 0; i < value.size(); i++) 
        {
            if (value.get(i) >= 1 && value.get(i) <= 5) 
            {
                System.out.print("*");
            }
        }
        
        System.out.print("\n 6 - 10: ");
        for (int i = 0; i < value.size(); i++) 
        {
            if (value.get(i) >= 6 && value.get(i) <= 10) 
            {
                System.out.print("*");
            }
        }
        
        System.out.print("\n11 - 15: ");
        for (int i = 0; i < value.size(); i++) 
        {
            if (value.get(i) >= 11 && value.get(i) <= 15) 
            {
                System.out.print("*");
            }
        }
        
        System.out.print("\n16 - 20: ");
        for (int i = 0; i < value.size(); i++) 
        {
            if (value.get(i) >= 16 && value.get(i) <= 20) 
            {
                System.out.print("*");
            }
        }
        
        System.out.print("\n21 - 25: ");
        for (int i = 0; i < value.size(); i++) 
        {
            if (value.get(i) >= 21 && value.get(i) <= 25) 
            {
                System.out.print("*");
            }
        }
        
        System.out.print("\n26 - 30: ");
        for (int i = 0; i < value.size(); i++) 
        {
            if (value.get(i) >= 26 && value.get(i) <= 30) 
            {
                System.out.print("*");
            }
        }
        
        System.out.print("\n31 - 35: ");
        for (int i = 0; i < value.size(); i++) 
        {
            if (value.get(i) >= 31 && value.get(i) <= 35) 
            {
                System.out.print("*");
            }
        }
        
        System.out.print("\n36 - 40: ");
        for (int i = 0; i < value.size(); i++) 
        {
            if (value.get(i) >= 36 && value.get(i) <= 40) 
            {
                System.out.print("*");
            }
        }
        
        
        System.out.print("\n41 - 45: ");
        for (int i = 0; i < value.size(); i++) 
        {
            if (value.get(i) >= 41 && value.get(i) <= 45) 
            {
                System.out.print("*");
            }
        }
        
        
        System.out.print("\n46 - 50: ");
        for (int i = 0; i < value.size(); i++) 
        {
            if (value.get(i) >= 46 && value.get(i) <= 50) 
            {
                System.out.print("*");
            }
        }
        System.out.println("");

    }
}

    
