package ch10ex1;
import java.util.Random;
public class Ch10Ex1 {
public static void main(String[] args) {
    int nums[] = new int[25];
    Random r = new Random();
    
    System.out.println("Numbers:");
    for(int c = 0; c < nums.length; c++){
        nums[c] = r.nextInt(100);
        System.out.print(nums[c] + " ");
    }
    
    System.out.println("\nEven:");
    for(int c = 0; c < nums.length; c++){
        if(nums[c] % 2 == 0){
            System.out.print(nums[c] + " ");
        }
    }
    
    System.out.println("\nOdd:");
    for(int c = 0; c < nums.length; c++){
        if(nums[c] % 2 != 0){
            System.out.print(nums[c] + " ");
        }
    }
    System.out.println(" ");
}    
}
