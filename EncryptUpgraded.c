/* This is an upgraded version of encrypt.c. Now, user enters a full new alphabet in any order as a key and generates 
ciphertext by replacing each letter of the plaintext with the corresponding letter from the custom alphabet key */
#include <cs50.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>


int main(int argc, string argv[])
{
    // Checks if there are more or less than 2 arguments, if there is than error
    if (argc != 2)
    {
        printf("Usage: ./substitution key");
        return 1;
    }
    
    // Checks if key contains only alphabetic characters, if not, error. Counter x counts how many characters there are in key.
    int x = 0;
    for (int i = 0, n = strlen(argv[1]); i < n; i++)
    {
        if (isalpha(argv[1][i]) == false)
        {
            printf("Key must only contain alphabatetic characters");
            return 1;
        }
        x++;
    }
    
    // If there are more or less than 26 characters in the key, error
    if (x != 26)
    {
        printf("Key must include 26 characters");
        return 1;
    }
    
    // Checks if there are repeated characters in ket, if there are, error
    for (int i = 0, n = strlen(argv[1]) - 1; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (argv[1][i] == argv[1][j])
            {
                printf("Key must not contain repeated characters");
                return 1;
            }
        }
    }
    
    // Prompt user for plaintext and prints out ciphertext
    string plaintext = get_string("plaintext: ");
    printf("ciphertext: ");
    
    // Generates ciphertext
    for (int i = 0, n = strlen(plaintext); i < n; i++)
    {
        int index;
        char newLetter;
        if (isupper(plaintext[i])) // Preserves uppercase letters while changing it with key
        {
            index = plaintext[i] - 65;
            newLetter = toupper(argv[1][index]);
            printf("%c", newLetter);
        }
        else if (islower(plaintext[i])) // Preserves lowercase letters while changing it with key
        {
            index = plaintext[i] - 97;
            newLetter = tolower(argv[1][index]);
            printf("%c", newLetter);
        }
        else // If not a letter than print as is
        {
            printf("%c", plaintext[i]);
        }
    }
    printf("\n");
}
