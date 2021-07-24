/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex20;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        //Multistate Sales Tax Calculator
        /*More complex programs may have decisions nested in other decisions,
        so that when one decision is made, additional decisions must be made.
        Create a tax calculator that handles multiple states and multiple
        counties within each state. The program prompts the user for the order
        amount and the state where the order will be shipped.

        Wisconsin residents must be charged 5% sales tax with an additional county-level charge.
        For Wisconsin residents, prompt for the county of residence.
              - For Eau Claire county residents, add an additional 0.005 tax.
              - For Dunn county residents, add an additional 0.004 tax.
        Illinois residents must be charged 8% sales tax with no additional county-level charge.
        All other states are not charged tax.

        The program then displays the tax and the total for Wisconsin and Illinois residents
        but just the total for everyone else.

        Example Output
        What is the order amount? 10
        What state do you live in? Wisconsin
        What county do you live in? Dane
        The tax is $0.50.
        The total is $10.50.

        Constraints
        Ensure that all money is rounded up to the nearest cent.
        Use a single output statement at the end of the program to display the program results.*/

        Scanner input = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        double orderAmount = input.nextDouble();
        double tax = 0;

        System.out.print("What state do you live in? ");
        String state = input.next();

        DecimalFormat df = new DecimalFormat("###.##");
        String taxOutput = "";
        if(state.equals("WI"))
        {
            double taxPercentage = 0.05;
            System.out.print("What county do you live in?\n   - If Eau Claire, type the letter E.\n" +
                    "   - If Dunn, type the letter D.\n   - Otherwise, type the letter N\n");
            String county = input.next();
            if(county.equals("E"))
            {
                taxPercentage = taxPercentage + 0.005;
                tax = orderAmount * taxPercentage;
            }
            else if(county.equals("D"))
            {
                taxPercentage = taxPercentage + 0.004;
                tax = orderAmount * taxPercentage;
            }
            else
                tax = orderAmount * taxPercentage;

            String taxRounded = String.format("%.2f", tax);
            taxOutput = "The tax is $" + taxRounded + ".\n";
            orderAmount = orderAmount + tax;
        }

        else if(state.equals("IL"))
        {
            double taxPercentage = 0.08;
            tax = orderAmount * taxPercentage;
            String taxRounded = String.format("%.2f", tax);
            taxOutput = "The tax is $" + taxRounded + ".\n";
            orderAmount = orderAmount + tax;
        }

        else
            System.out.print("ERROR");

        String total = String.format("%.2f", orderAmount);
        System.out.print(taxOutput + "The total is $" + total + ".");
    }
}