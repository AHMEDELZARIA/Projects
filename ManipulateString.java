/*Prompts the user for a sentence then generates number of characters, number of words, 
sentence reversed, sentence in uppercase and lowercase, number of consonants and vowels,
first word converted to ASCII, does it contain "and"?, does it have consecutive vowels?,
number of uppercase, lowercase, and punctuation characters*/
package manipulateString;

import java.util.Scanner;

public class ManipulateString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence, spaces, reverse = "", num = " ";
        int x = 0, y = 0, z = 0, u = 0, l = 0, p = 0;

        System.out.print("Enter a sentence: "); //input
        sentence = input.nextLine();

        System.out.println("number of characters: " + sentence.length()); //part a) number of characters

        for (int c = 0; c < sentence.length(); c++) //part b) number of words 
        { 
            spaces = sentence.substring(c, c + 1);
            if (spaces.equals(" ")) 
            {
                x++;
            }
        }
        System.out.println("The number of words: " + (x + 1));

        for (int c = sentence.length() - 1; c >= 0; c--) //part c) sententce reversed
        { 
            spaces = sentence.substring(c, c + 1);
            reverse += spaces;
        }
        System.out.println("The sentence reversed is: " + reverse);

        System.out.println("The sentence in uppercase is: " + sentence.toUpperCase()); //part d) sentence in uppercase

        System.out.println("The sentence in lowercase is: " + sentence.toLowerCase()); //part e) sentence in lowercase

        for (int c = 0; c < sentence.length(); c++) //part f) number of vowels
        { 
            spaces = sentence.substring(c, c + 1);
            if ("AEIOU".contains(spaces.toUpperCase())) 
            {
                y++;
            }
        }
        System.out.println("The number of vowels in your sentence are: " + (y));

        for (int c = 0; c < sentence.length(); c++) //part g) number of consonants
        { 
            spaces = sentence.substring(c, c + 1);
            if ("BCDFGHJKLMNPQRSTVWXYZ".contains(spaces.toUpperCase())) 
            {
                z++;
            }
        }
        System.out.println("The number of consonants in your sentence are: " + (z));

        System.out.print("The ASCII number of the first word is: "); //part h) convert first word to coresponding ASCII number
        char word = 0;
        for (int c = 0; c < sentence.length(); c++) 
        {
            word = sentence.charAt(c);
            int first = word;
            if (word == 32) 
            {
                break;
            }
            System.out.print((int) word + " ");
        }

        System.out.print("\nDoes the sentence contain and?: "); //part i) Does it have "and"?
        if (sentence.toLowerCase().contains("and")) 
        {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String lowercase = sentence.toLowerCase(); //part j) Does it have consecutive vowels?
        System.out.print("Does the sentence contain consecutive vowels?: ");
        if (lowercase.contains("ee")) 
        {
            System.out.print("e ");
        }
        if (lowercase.contains("aa")) 
        {
            System.out.print("a ");
        }
        if (lowercase.contains("oo")) 
        {
            System.out.print("o ");
        }
        if (lowercase.contains("uu")) 
        {
            System.out.print("u ");
        }
        if (lowercase.contains("ii")) 
        {
            System.out.print("i ");
        }
        System.out.println();

        for (int c = 0; c < sentence.length(); c++) { // part k) # of uppercase l) # of lowercase m) # of punctuation
            word = sentence.charAt(c);
            if (word >= 'a' && word <= 'z') 
            {
                u++;
            }
            if (word >= 'A' && word <= 'Z') 
            {
                l++;
            }
            if (word == ',' || word == '.' || word == ';' || word == ':' || word == '!' || word == '?') 
            {
                p++;
            }
        }
        
        System.out.println("The number of uppercase letters are: " + l++);
        System.out.println("The number of lowercase letters are: " + u++);
        System.out.println("The number of punctuations used are: " + p++);
    }
}
