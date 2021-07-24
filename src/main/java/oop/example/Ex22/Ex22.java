/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex22;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        //Comparing Numbers
        /*Comparing one input to a known value is common enough,
        but you’ll often need to process a collection of inputs.
        write a program that asks for three numbers. Check first
        to see that all numbers are different. If they’re not
        different, then exit the program. Otherwise, display
        the largest number of the three.

        Example Output
        Enter the first number: 1
        Enter the second number: 51
        Enter the third number: 2
        The largest number is 51.

        Constraint
        Write the algorithm manually. Don’t use a built-in function for
        finding the largest number in a list.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double firstNum = input.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNum = input.nextDouble();

        System.out.print("Enter the third number: ");
        double thirdNum = input.nextDouble();
        double max = firstNum;

        if(firstNum != secondNum && secondNum != thirdNum && firstNum != thirdNum)
        {
            if(firstNum < secondNum)
            {
                max = secondNum;
                if(secondNum < thirdNum)
                    max = thirdNum;
            }
            else if(firstNum < thirdNum)
                max = thirdNum;
        }
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.print("The largest number is " + df.format(max) + ".");
    }
}
