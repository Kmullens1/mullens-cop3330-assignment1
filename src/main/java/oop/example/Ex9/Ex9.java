/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex9;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Ex9 {
    static final double SQUARE_FEET_PER_GALLON = 350;

    public static void main(String[] args) {

        //Paint Calculator
        /*Sometimes you have to round up to the next number rather than follow
        standard rounding rules. Calculate gallons of paint needed to paint the
        ceiling of a room. Prompt for the length and width, and assume one gallon
        covers 350 square feet. Display the number of gallons needed to paint the
        ceiling as a whole number.

        Example Output
        You will need to purchase 2 gallons of paint to cover 360 square feet.
        Remember, you can’t buy a partial gallon of paint. You must
        round up to the next whole gallon.

        Constraints
        Use a constant to hold the conversion rate.
        Ensure that you round up to the next whole number.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the room? ");
        double length = input.nextDouble();

        System.out.print("What is the width of the room? ");
        double width = input.nextDouble();

        //Calculations
        double area = width * length;
        double exactNumOfGallons = (area / SQUARE_FEET_PER_GALLON);
        double roundedNumOfGallons = Math.ceil(exactNumOfGallons);

        DecimalFormat df = new DecimalFormat("###.###");
        System.out.print("You will need to purchase " + df.format(roundedNumOfGallons) +
                " gallons of paint to cover " + df.format(area) + " square feet.\n" +
                "Remember, you can’t buy a partial gallon of paint.\n" +
                "You must round up to the next whole gallon.");

    }
}