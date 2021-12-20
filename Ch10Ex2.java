package ch10ex2;
public class Ch10Ex2 {
public static void main(String[] args) {
    int[] answer = new int[102];
    int ones = 0, tens = 0, hundreds = 0;
    
    System.out.println("Index" + "\t" + "Generated Number");
    for(int index = 0; index <= 101; index++){
        ones = index%10;
        tens = index/10%10;
        hundreds = index/100;
        answer[index] = index + ones + tens + hundreds;
        System.out.println(index + "\t" + answer[index]);
    }
}   
}
