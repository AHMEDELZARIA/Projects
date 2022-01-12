// Based on an inputted height, prints out right aligned triangle with a gap then a left alligned triangle
#include <cs50.h>
#include <stdio.h>


int main(void)
{
    // Prompts user for a height that is greater than or equal to 1 and less than or equal to 8
    int height;
    do
    {
        height = get_int("Height: ");
    }
    while (height < 1 || height > 8);
    
    // Iterates through 1-height printing out spaces and hashes
    for (int i = 1; i <= height; i++)
    {
        int x;
        for (x = 0; x < height - i; x++)
        {
            printf(" ");
        }
        for (int j = 0; j < i; j++)
        {
            printf("#");
        }
        for (int a = 0; a < 2; a++)
        {
            printf(" ");
        }
        for (int b = 0; b < i; b++)
        {
            printf("#");
        }
        printf("\n");
    }
}
