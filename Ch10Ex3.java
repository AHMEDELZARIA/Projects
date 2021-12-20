package ch10ex3;

import java.util.Random;

public class Ch10Ex3 {
public static void main(String[] args) {
    int[] outcomes = new int[10];
    int occurences;
    Random r = new Random();
    
    System.out.println("Number" + "\t" + "Occurences");
    for(int i = 0; i < 500; i++){
        occurences  = r.nextInt(10);
        outcomes[occurences] += 1;
        }
    
    for(int index = 0; index <= 9; index++){
    System.out.println(index + "\t" + outcomes[index]); 
    }
}
}
   

