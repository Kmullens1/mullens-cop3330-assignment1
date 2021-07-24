/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex18;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex18 {
    static final double F_CONSTANT = 9/5;
    static final double C_CONSTANT = 5/9;
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

        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\nYour choice: ");
        String choice = input.next();

        double temp = -1500;            //Initialized to nonsense numbers
        double convertedTemp = -1500;
        String tempType = "ERROR";
        if(choice.equals("c") || choice.equals("C"))
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            temp = input.nextDouble();
            //C = (F − 32) × 5 / 9
            convertedTemp = (temp - 32) * (C_CONSTANT);
            tempType = "Celsius";
        }

        if(choice.equals("f") || choice.equals("F"))
        {
            System.out.print("Please enter the temperature in Celsius: ");
            temp = input.nextDouble();
            //F = (C × 9 / 5) + 32
            convertedTemp = (temp * (F_CONSTANT)) + 32;
            tempType = "Fahrenheit";
        }

        DecimalFormat df = new DecimalFormat("###.##");
        System.out.print("The temperature in " + tempType + " is " + df.format(convertedTemp) + ".");


    }
}