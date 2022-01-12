// Scaling program, prompts user for scaling factor and scales icon accordingly
package assign13;
import java.util.Scanner;
public class Assign13 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Here is the starting icon: ");
    System.out.println("*X*");
    System.out.println("X**");
    System.out.println("**X");
    System.out.print("Choose a scale factor: ");
    int sFactor = input.nextInt();
    System.out.println("Here is your scaled icon by " + sFactor + " times:");
    scaling(sFactor);
    
    
    }
    public static void scaling(int sFactor){
    
    for (int i = 0; i < (sFactor); i++){
        for (int j = 0; j < (sFactor); j++){
        System.out.print("*");  
        }
        for (int j = 0; j < (sFactor); j++){
        System.out.print("X");  
        }
        for (int j = 0; j < (sFactor); j++){
        System.out.print("*");  
        }
    System.out.println();
    }
    for (int i = 0; i < (sFactor); i++){
        for (int j = 0; j < (sFactor); j++){
        System.out.print("X");  
        }
        for (int j = 0; j < (sFactor); j++){
        System.out.print("*");  
        }
        for (int j = 0; j < (sFactor); j++){
        System.out.print("*");  
        }
    System.out.println();
    }
for (int i = 0; i < (sFactor); i++){
        for (int j = 0; j < (sFactor); j++){
        System.out.print("*");  
        }
        for (int j = 0; j < (sFactor); j++){
        System.out.print("*");  
        }
        for (int j = 0; j < (sFactor); j++){
        System.out.print("X");  
        }
    System.out.println();
    }
    }
}
    

