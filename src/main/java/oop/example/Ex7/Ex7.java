/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Keri Mullens
 */

package oop.example.Ex7;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex7 {
    static final double CONVERSION_FACTOR = 0.09290304;

    public static void main(String[] args) {
        //Area of a Rectangular Room
        /*When working in a global environment, you’ll have to present information
        in both metric and Imperial units. And you’ll need to know when to do the
        conversion to ensure the most accurate results.
        Create a program that calculates the area of a room. Prompt the user for the
        length and width of the room in feet. Then display the area in both square feet
        and square meters.
        Example Output
            What is the length of the room in feet? 15
            What is the width of the room in feet? 20
            You entered dimensions of 15 feet by 20 feet.
            The area is
            300 square feet
            27.871 square meters
                    *The formula for this conversion is m2 = f2 × 0.09290304
        Constraints
            Keep the calculations separate from the output.
            Use a constant to hold the conversion factor.*/
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        double length = input.nextDouble();

        System.out.print("What is the width of the room in feet? " );
        double width = input.nextDouble();

        DecimalFormat df = new DecimalFormat("###.###");
        System.out.print("You entered dimensions of " + df.format(length) + " feet by " + df.format(width) + " feet. \n");

        //Calculate area in feet
        double squareFeet = length * width;

        //Formula for conversion: m2 = f2 × 0.09290304
        double squareMeters = squareFeet * CONVERSION_FACTOR;

        System.out.print("The area is\n" + df.format(squareFeet) + " square feet\n" + df.format(squareMeters) + " square meters");

    }
}

