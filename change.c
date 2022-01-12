#include <cs50.h>
#include <stdio.h>
#include <math.h>

int main(void)
{
    // Prompt the user for amount of change that is a non-negative float
    float change;
    do
    {
        change = get_float("Change owed: ");
    }
    while (change < 0); 
    
    // Initialize cents by converting change in dollars into cents & initialize counter for each coin 
    int cents = round(change * 100), quarters, dimes, nickels, pennies;
    
    // Calculates amount of quarters by checking if cents is >= 25 cents, if true updates the variable "cents" and increments quarters by 1
    for (quarters = 0; cents >= 25; quarters++)
    {
        cents = cents - 25;
    }
    
    // Calculates amount of dimes by checking if cents is >= 10 cents, if true updates the variable "cents" and increments dimes by 1
    for (dimes = 0; cents >= 10; dimes++)
    {
        cents = cents - 10;
    }
    
    // Calculates amount of nickels by checking if cents is >= 5 cents, if true updates the variable "cents" and increments nickels by 1
    for (nickels = 0; cents >= 5; nickels++)
    {
        cents = cents - 5;
    }
    
    //  Calculates amount of pennies by checking if cents is >= 1 cents, if true updates the variable "cents" and increments pennies by 1
    for (pennies = 0; cents >= 1; pennies++)
    {
        cents = cents - 1;
    }
    
    // Stores amount of coins in variable "coins"
    int coins = quarters + dimes + nickels + pennies;
    
    // Prints amount of coins
    printf("%i\n", coins);
}
