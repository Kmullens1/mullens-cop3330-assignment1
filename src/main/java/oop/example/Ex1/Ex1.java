/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Keri Mullens
 */
package oop.example.Ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        //Create a program that prompts for your name and prints a greeting using your name.
        //Constraint: Keep the input, string concatenation, and output separate.
        //Example Output:
        //What is your name? Brian
        //Hello, Brian, nice to meet you!

        System.out.print("What is your name? ");

        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.print("Hello, ");
        System.out.print(name);
        System.out.print(", nice to meet you!");
    }
}


