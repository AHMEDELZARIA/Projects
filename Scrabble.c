// Scrabble game between 2 players
#include <cs50.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>


int compute_score(string word);

// Points assigned to each letter of the alphabet
int POINTS[] = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};

int main(void)
{
    // Prompt user for two words
    string word1 = get_string("Player 1: ");
    string word2 = get_string("Player 2: ");
    
    // Run the two words through the compute score function
    int score1 = compute_score(word1);
    int score2 = compute_score(word2);
    
    // Prints out result
    if (score1 > score2)
    {
        printf("Player 1 wins!\n");
    }
    else if (score2 > score1)
    {
        printf("Player 2 wins!\n");
    }
    else
    {
        printf("Tie!\n");
    }
    
}

// Calculates score of word
int compute_score(string word)
{
    int total = 0, index;
    for (int i = 0, n = strlen(word); i < n; i++)
    {
        if (isdigit(word[i]) == 0 && isalpha(word[i]) != 0 && isspace(word[i]) == 0)
        {
            word[i] = toupper(word[i]);
            index = word[i] - 65;
            total += POINTS[index];
        }
        else
        {
            total += 0; 
        }
    }
    return total;
}
