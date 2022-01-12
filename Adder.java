// Adding game
package adder;
import java.util.Random;
import java.util.Scanner;

public class Adder {
    private int answer, score = 0;
    
    void createP(){
        Random r = new Random();
        int num1 = r.nextInt(20);
        int num2 = r.nextInt(20);
        answer = num1 + num2;
        System.out.print("\n" + num1 + " + " + num2 + " = ");
    }
    void startG(){
        Scanner input = new Scanner(System.in);
        int guess = 0;
            
        while(guess != 999){
        createP();
        for(int tries = 0; tries < 3 && guess != 999; tries++){
            guess = input.nextInt();
            if(guess == answer){
            if(tries == 0) score +=5;
            if(tries == 1) score +=3;
            if(tries == 2) score +=1;
            break;
        }
        
        if(guess != answer && guess != 999 && tries <2){
            System.out.print("Wrong answer. Enter another answer: ");        
        }
        }
        }
        System.out.println("Your score is: " + score);
    }
    }

