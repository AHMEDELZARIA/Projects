// Prints out diamond
#include <cs50.h>
#include <stdio.h>


int main(void)
{
    int height;
    do
    {
        height = get_int("Height: ");
    }
    while (height < 1 || height > 8);
    
    // Iterates through 1-height printing out spaces and hashes for top half of diamond
    for (int i = 1; i <= height; i++)
    {
        int x;
        for (x = 0; x < height - i; x++)
        {
            printf(" ");
        }
        for (int j = 0; j < (i * 2) - 1; j++)
        {
            printf("#");
        }
        printf("\n");
    }
    
    // Iterates through 1-height prinitng out hashes and spaces for bottom half of 
    for (int i = 2; i <= height; i++)
    {
        int x;
        for (x = 0; x < i - 1; x++)
        {
            printf(" ");
        }
        for (int j = 0; j < (((height - i) * 2) + 1); j++)
        {
            printf("#");
        }
        printf("\n");
    }
}
