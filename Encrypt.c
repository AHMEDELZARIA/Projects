// Converts plaintext into ciphertext using a key inputed in the command line
#include <cs50.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>


int main(int argc, string argv[])
{
    // First check if there are more or less than two command line arguments
    if (argc > 2 || argc < 2)
    {
        printf("Usage: ./caesar key\n");
        return 1;
    }
    
    // If it does have 2 command line arguments than it will check for two more conditions before fully passing
    for (int i = 0, n = strlen(argv[1]); i < n; i++)
    {
        if (isalpha(argv[1][i]) || ispunct(argv[1][i]))
        {
            printf("Usage: ./caesar key\n");
            return 1;
        }
    }
    
    // Convert string of the number into an int
    int key = atoi(argv[1]);
    
    // Prompt user for a string
    string plaintext = get_string("plaintext: ");
    
    
    // Prints out ciphertext
    printf("ciphertext: ");
    for (int i = 0, n = strlen(plaintext); i < n; i++)
    {
        char newLetter;
        if (isupper(plaintext[i])) // Generates ciphertext for uppercase letters
        {
            plaintext[i] = plaintext[i] - 65;
            newLetter = ((plaintext[i] + key) % 26) + 65;
            printf("%c", newLetter);    
        }
        else if (islower(plaintext[i])) // Generates ciphertext for lowercase letters
        {
            plaintext[i] = plaintext[i] - 97;
            newLetter = ((plaintext[i] + key) % 26) + 97;
            printf("%c", newLetter);    
        }
        else // Print out non-alphabatical characters as is
        {
            printf("%c", plaintext[i]);
        }
    }
    printf("\n");
}

