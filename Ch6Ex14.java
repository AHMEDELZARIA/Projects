package ch6ex14;
import java.util.Random;
import java.util.Scanner;
public class Ch6Ex14 {
public static void main(String[] args) {
    Random r = new Random();
    int dice1, dice2, total;
    System.out.format("%10s%10s%10s\n", "Dice 1" , "Dice 2", "Total");
    
    for(int c = 0; c < 5; c++) {; 
    dice1 = r.nextInt(6)+1;
    dice2 = r.nextInt(6)+1;
    total = dice1 + dice2;
    System.out.format("%10s%10s%10s\n", dice1 , dice2, total);
    }
    
}    
}
