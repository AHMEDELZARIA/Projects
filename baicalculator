// BAI calculator
package baicalculator;

import java.util.Scanner;

public class baicalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hipSize, height, bai;
        int age;

        System.out.println("Hello! I am here today to help you calculate your BAI, but first I need some information from you.");
        System.out.println("What is your hip circumference in cm?: ");
        hipSize = input.nextDouble();
        System.out.println("Thanks! What is your height in cm?: ");
        height = input.nextDouble();
        height = height / 100;
        System.out.println("Alright, are you a male or female?: ");
        String gender = input.next();
        System.out.println("Finally, what is your age?: ");
        age = input.nextInt();

        bai = (hipSize / (Math.pow(height, 1.5))) - 18;
        System.out.format("BAI: %.1f%%\n", bai);

//female aged 20-39
        if (gender.equals("female") && age >= 20 && age <= 39 && bai < 21) {
            System.out.println("You are underweight.");
        }
        if (gender.equals("female") && age >= 20 && age <= 39 && bai >= 21 && bai <= 33) {
            System.out.println("You are healthy.");
        }
        if (gender.equals("female") && age >= 20 && age <= 39 && bai > 33 && bai <= 39) {
            System.out.println("You are overweight.");
        }
        if (gender.equals("female") && age >= 20 && age <= 39 && bai > 39) {
            System.out.println("You are obese.");
        }

//female aged 40-59
        if (gender.equals("female") && age >= 40 && age <= 59 && bai < 23) {
            System.out.println("You are underweight.");
        }
        if (gender.equals("female") && age >= 40 && age <= 59 && bai >= 23 && bai <= 35) {
            System.out.println("You are healthy.");
        }
        if (gender.equals("female") && age >= 40 && age <= 59 && bai > 35 && bai <= 41) {
            System.out.println("You are overweight.");
        }
        if (gender.equals("female") && age >= 40 && age <= 59 && bai > 41) {
            System.out.println("You are obese.");
        }

//female aged 60-79
        if (gender.equals("female") && age >= 60 && age <= 79 && bai < 25) {
            System.out.println("You are underweight.");
        }
        if (gender.equals("female") && age >= 60 && age <= 79 && bai >= 25 && bai <= 38) {
            System.out.println("You are healthy.");
        }
        if (gender.equals("female") && age >= 60 && age <= 79 && bai > 38 && bai <= 43) {
            System.out.println("You are overweight.");
        }
        if (gender.equals("female") && age >= 60 && age <= 79 && bai > 43) {
            System.out.println("You are obese.");
        }

//male aged 20-39
        if (gender.equals("male") && age >= 20 && age <= 39 && bai < 8) {
            System.out.println("You are underweight.");
        }
        if (gender.equals("male") && age >= 20 && age <= 39 && bai >= 8 && bai <= 21) {
            System.out.println("You are healthy.");
        }
        if (gender.equals("male") && age >= 20 && age <= 39 && bai > 21 && bai <= 26) {
            System.out.println("You are overweight.");
        }
        if (gender.equals("male") && age >= 20 && age <= 39 && bai > 26) {
            System.out.println("You are obese.");
        }

//male aged 40-59
        if (gender.equals("male") && age >= 40 && age <= 59 && bai < 11) {
            System.out.println("You are underweight.");
        }
        if (gender.equals("male") && age >= 40 && age <= 59 && bai >= 11 && bai <= 23) {
            System.out.println("You are healthy.");
        }
        if (gender.equals("male") && age >= 40 && age <= 59 && bai > 23 && bai <= 29) {
            System.out.println("You are overweight.");
        }
        if (gender.equals("male") && age >= 40 && age <= 59 && bai > 29) {
            System.out.println("You are obese.");
        }

//male aged 60-79
        if (gender.equals("male") && age >= 60 && age <= 79 && bai < 13) {
            System.out.println("You are underweight.");
        }
        if (gender.equals("male") && age >= 60 && age <= 79 && bai >= 13 && bai <= 25) {
            System.out.println("You are healthy.");
        }
        if (gender.equals("male") && age >= 60 && age <= 79 && bai > 25 && bai <= 31) {
            System.out.println("You are overweight.");
        }
        if (gender.equals("male") && age >= 60 && age <= 79 && bai > 31) {
            System.out.println("You are obese.");
        }

        if (age > 79 && age < 20) {
            System.out.print("Age is incompatible for rating");
        }
    }
}

