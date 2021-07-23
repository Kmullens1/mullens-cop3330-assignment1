/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex12;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        //Computing Simple Interest
        /*Computing simple interest is a great way to quickly
        figure out whether an investment has value. It’s also a
        good way to get comfortable with explicitly coding the
        order of operations in your programs. Create a program
        that computes simple interest. Prompt for the principal
        amount, the rate as a percentage, and the time, and display
        the amount accrued (principal + interest).

        The formula for simple interest is A = P(1 + rt), where P is
        the principal amount, r is the annual rate of interest, t is
        the number of years the amount is invested, and A is the amount
        at the end of the investment.

        Example Output
        Enter the principal: 1500
        Enter the rate of interest: 4.3
        Enter the number of years: 4
        After 4 years at 4.3%, the investment will be worth $1758.

        Constraints
        Prompt for the rate as a percentage (like 15, not .15). Divide the
        input by 100 in your program.
        Ensure that fractions of a cent are rounded up to the next penny.
        Ensure that the output is formatted as money.*/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double interestRate = input.nextDouble();
        double rate = interestRate * 0.01;

        System.out.print("Enter the number of years: ");
        double numOfYears = input.nextDouble();

        double amountAccrued = principal * (1 + (rate * numOfYears));

        DecimalFormat df = new DecimalFormat("###.##");
        System.out.print("After " + df.format(numOfYears) + " years at " + interestRate
                + "%, the investment will be worth $" + df.format(amountAccrued) + ".");
    }
}
