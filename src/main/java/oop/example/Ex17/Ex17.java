/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex17;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        //Blood Alcohol Calculator
        /*Sometimes you have to perform a more complex calculation based
        on some provided inputs and then use that result to make a determination.
        Create a program that prompts for your weight, gender, total alcohol
        consumed (in ounces), and the amount of time since your last drink.
        Calculate your blood alcohol content (BAC) using this formula

                BAC = (A × 5.14 / W × r) − .015 × H
                where

        A is total alcohol consumed, in ounces (oz).
        W is body weight in pounds.
        r is the alcohol distribution ratio:
             0.73 for men
             0.66 for women
        H is number of hours since the last drink.

        Display whether or not it’s legal to drive by comparing the blood
        alcohol content to 0.08.

        Example Output
        Enter a 1 is you are male or a 2 if you are female: 1
        How many ounces of alcohol did you have? 3
        What is your weight, in pounds? 175
        How many hours has it been since your last drink? 1

        Your BAC is 0.049323
        It is legal for you to drive.

        Or

        Enter a 1 is you are male or a 2 if you are female: 1
        How many ounces of alcohol did you have? 5
        What is your weight, in pounds? 175
        How many hours has it been since your last drink? 1

        Your BAC is 0.092206
        It is not legal for you to drive.

        Constraint
        Prevent the user from entering non-numeric values.*/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        int gender = input.nextInt(); //FIXME - should this variable be int, bool, or char?

        System.out.print("How many ounces of alcohol did you have? ");
        double ounces = input.nextDouble();

        System.out.print("What is your weight, in pounds? ");
        double weight = input.nextDouble();

        System.out.print("How many hours has it been since your last drink? ");
        double hours = input.nextDouble();

        //FIXME - remove hardcoded data
        System.out.print("Your BAC is " + 0.049323);
        //FIXME - add in an if/then statement
        System.out.print("It is legal for you to drive.");
        System.out.print("It is not legal for you to drive.");
    }
}