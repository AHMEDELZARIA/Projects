// Calculates number of years until start size population grows to end size population
#include <cs50.h>
#include <stdio.h>

int main(void)
{
    // Prompt user for start size greater than or equal to 9
    int start;
    do
    {
        start = get_int("Start size: ");
    }
    while (start < 9);
    
    // Prompt user for end size greater than or equal to start size
    int end;
    do
    {
        end = get_int("End size: ");
    }
    while (end < start); 
    
    
    // For loop to calculate number of years that have passed by
    int i;
    for (i = 0; start < end; i++)
    {
        start = start + (start / 3) - (start / 4);
    }
    
    // Display number of years to user
    printf("Years: %i\n", i);
}
