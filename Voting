// Prompts the user for votes for 3 people and prints out winner
package assign12;
import java.util.Scanner;
public class Assign12 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

System.out.println("Enter the votes");
String vote = input.next();
int a = 0, b = 0, d = 0;

for (int c = 0; c < vote.length(); c++){
    if (vote.charAt(c) == 'A'){
        a++;
    }
    if (vote.charAt(c) == 'B'){
        b++;
    }
    if (vote.charAt(c) == 'C'){
        d++;
    }
    
}

if (a > b && a > d){
    System.out.println("The winner is singer A with " + a + " votes.");
}
if (d > b && d > a){
    System.out.println("The winner is singer C with " + d + " votes.");
}
if (b > d && b > a){
    System.out.println("The winner is singer B with " + b + " votes.");
}
if (a == b && b > d && a > d){
    System.out.println("There is a tie between singer A and B with " + a + " votes each.");
}
if (a == d && a > b && d > b){
    System.out.println("There is a tie between singer A and C with " + a + " votes each.");
}
if (b == d && b > a && d > a){
    System.out.println("There is a tie between singer B and C with " + b + " votes each.");
}
if (a == b && a == d && b == d){
    System.out.println("There is three way tie bewtween the three singers with " + a + " votes each.");
}
}    
}
