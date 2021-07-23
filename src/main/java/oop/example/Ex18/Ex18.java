/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex18;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        //Temperature Converter
        /*You’ll often need to determine which part of a program is
        run based on user input or other events. Create a program that
        converts temperatures from Fahrenheit to Celsius or from Celsius
        to Fahrenheit. Prompt for the starting temperature. The program
        should prompt for the type of conversion and then perform the
        conversion.

        The formulas are

            C = (F − 32) × 5 / 9
            and
            F = (C × 9 / 5) + 32

        Example Output
        Press C to convert from Fahrenheit to Celsius.
        Press F to convert from Celsius to Fahrenheit.
        Your choice: C
        Please enter the temperature in Fahrenheit: 32
        The temperature in Celsius is 0.

        Constraints
        Ensure that you allow upper or lowercase values for C and F.
        Use as few output statements as possible and avoid repeating output strings.*/

        Scanner input = new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius.\n");
        System.out.print("Press F to convert from Celsius to Fahrenheit.\n");
        System.out.print("Your choice: ");
        String choice = input.next(); //FIXME - Should this variable be int, bool, char or String?

        System.out.print("Please enter the temperature in Fahrenheit: ");
        double temp = input.nextDouble();

        System.out.print("The temperature in Celsius is " + 0 + "."); //FIXME - remove hardcoded numbers

    }
}