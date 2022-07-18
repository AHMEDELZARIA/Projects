// Calculates reading level as a grade for a string that is inputted from user based on the Coleman-Laiu index
#include <cs50.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <math.h>

int compute_grade(string text);

int main(void)
{
    // Prompt user for text
    string userText = get_string("Text: ");
    
    int textGrade = compute_grade(userText);
    
    // Prints out grade
    if (textGrade < 1)
    {
        printf("Before Grade 1\n");
    }
    else if (textGrade >= 16)
    {
        printf("Grade 16+\n");
    }
    else
    {
        printf("Grade %i\n", textGrade);
    }
}


// calculates number of letters, words, sentences, and grade level
int compute_grade(string text)
{
    int letters = 0, words = 0, sentences = 0;
    
    for (int i = 0, n = strlen(text); i < n; i++)
    {
        if (isalpha(text[i]))
        {
            letters++;
        }
        else if (isspace(text[i]))
        {
            words++;
        }
        else if (text[i] == 46 || text[i] == 33 || text[i] == 63)
        {
            sentences++;
        }
    }
    words = words + 1;

    int grade = round(0.0588 * ((letters / (float) words) * 100.0) - 0.296 * ((sentences / (float) words) * 100.0) - 15.8);
    return grade;
}
