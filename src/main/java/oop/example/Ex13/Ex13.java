/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        //Determining Compound Interest
        /*Simple interest is something you use only when making a quick guess.
        Most investments use a compound interest formula, which will be much
        more accurate. And this formula requires you to incorporate exponents
        into your programs. Write a program to compute the value of an investment
        compounded over time. The program should ask for the starting amount, the
        number of years to invest, the interest rate, and the number of periods
        per year to compound.

        The formula you’ll use for this is A = P(1 + r/n)^(n*t) where

        P is the principal amount.
        r is the annual rate of interest.
        t is the number of years the amount is invested.
        n is the number of times the interest is compounded per year.
        A is the amount at the end of the investment.

        Example Output
        What is the principal amount? 1500
        What is the rate? 4.3
        What is the number of years? 6
        What is the number of times the interest is compounded per year? 4
        $1500 invested at 4.3% for 6 years compounded 4 times per year is $1938.84.

        Constraints
        Prompt for the rate as a percentage (like 15, not .15). Divide the input
        by 100 in your program.
        Ensure that fractions of a cent are rounded up to the next penny.
        Ensure that the output is formatted as money.*/

        Scanner input = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        double principal = input.nextDouble();

        System.out.print("What is the rate? ");
        double interestRate = input.nextDouble();
        double rate = interestRate / 100;

        System.out.print("What is the number of years? ");
        double numOfYears = input.nextDouble();

        System.out.print("What is the number of times the interest is compounded per year? ");
        double periodsPerYear = input.nextDouble();

        //A = P(1 + r/n)^(n*t)
        double base = (1 + (rate/periodsPerYear));
        double exponent = periodsPerYear * numOfYears;
        double exponential = Math.pow(base,exponent);
        double amountAccrued = principal * exponential;

        System.out.println(base);
        System.out.println(exponent);
        System.out.println(exponential);
        System.out.println(amountAccrued);

        DecimalFormat df = new DecimalFormat("###.##");
        System.out.print("$" + df.format(principal) +" invested at " + interestRate +"% for " +
                df.format(numOfYears) + " years compounded " + df.format(periodsPerYear)
                + " times per year is $" + df.format(amountAccrued) + ".");

    }
}