/*
Abram Denzlinger
January 18, 2026
Module 1.3 Programming Assignment

This program calculates the energy
needed in Joules to heat water from
an initial temperature to a final
temperature. The user is prompted to
enter the amount of water in kilograms
and the initial and final temperatures
of the water.
 */

void main() {
    // Create a Scanner object to read input
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the amount of water
    IO.print("Enter the amount of water in Kilograms: ");
    int waterMass = input.nextInt();

    // Prompt the user to enter initial water temp
    IO.print("Enter the initial water temperature in Celsius: ");
    int initialTemperature = input.nextInt();

    // Prompt the user to enter final water temp
    IO.print("Enter the final water temperature in Celsius: ");
    int finalTemperature = input.nextInt();

    // Perform the calculation and display the result
    int MULTIPLIER = 4184;
    int Q = waterMass * (finalTemperature - initialTemperature) * MULTIPLIER;
    IO.println("It takes " + Q + " Joules of energy to heat " + waterMass +
            " kg of water from " + initialTemperature + " degrees Celsius to " +
            finalTemperature + " degrees Celsius.");

    // Close the scanner to free up resources
    input.close();
}